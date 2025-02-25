/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.gradle.tasks

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.UnknownTaskException
import org.gradle.api.tasks.TaskCollection
import org.gradle.api.tasks.TaskProvider
import org.jetbrains.kotlin.gradle.plugin.PropertiesProvider
import org.jetbrains.kotlin.gradle.plugin.mapKotlinTaskProperties
import org.jetbrains.kotlin.gradle.plugin.mpp.pm20.KotlinCompilationData
import org.jetbrains.kotlin.gradle.plugin.runOnceAfterEvaluated
import org.jetbrains.kotlin.gradle.plugin.sources.applyLanguageSettingsToKotlinOptions
import org.jetbrains.kotlin.gradle.targets.js.ir.KotlinJsIrLink

/**
 * Registers the task with [name] and [type] and initialization script [body]
 */
@JvmName("registerTaskOld")
@Deprecated("please use Project.registerTask", ReplaceWith("project.registerTask(name, type, emptyList(), body)"))
internal fun <T : Task> registerTask(project: Project, name: String, type: Class<T>, body: (T) -> (Unit)): TaskProvider<T> =
    project.registerTask(name, type, emptyList(), body)

internal inline fun <reified T : Task> Project.registerTask(
    name: String,
    args: List<Any> = emptyList(),
    noinline body: ((T) -> (Unit))? = null
): TaskProvider<T> =
    this@registerTask.registerTask(name, T::class.java, args, body)

internal fun <T : Task> Project.registerTask(
    name: String,
    type: Class<T>,
    constructorArgs: List<Any> = emptyList(),
    body: ((T) -> (Unit))? = null
): TaskProvider<T> {
    val resultProvider = project.tasks.register(name, type, *constructorArgs.toTypedArray())
    if (body != null) {
        resultProvider.configure(body)
    }
    return resultProvider
}

internal fun TaskProvider<*>.dependsOn(other: TaskProvider<*>) = configure { it.dependsOn(other) }

internal fun TaskProvider<*>.dependsOn(other: Task) = configure { it.dependsOn(other) }

internal inline fun <reified S : Task> TaskCollection<in S>.withType(): TaskCollection<S> = withType(S::class.java)

/**
 * Locates a task by [name] and [type], without triggering its creation or configuration.
 */
internal inline fun <reified T : Task> Project.locateTask(name: String): TaskProvider<T>? =
    try {
        tasks.withType(T::class.java).named(name)
    } catch (e: UnknownTaskException) {
        null
    }

/**
 * Locates a task by [name] and [type], without triggering its creation or configuration or registers new task
 * with [name], type [T] and initialization script [body]
 */
internal inline fun <reified T : Task> Project.locateOrRegisterTask(name: String, noinline body: (T) -> (Unit)): TaskProvider<T> {
    return project.locateTask(name) ?: project.registerTask(name, T::class.java, body = body)
}

internal inline fun <reified T : Task> Project.locateOrRegisterTask(
    name: String,
    args: List<Any> = emptyList(),
    invokeWhenRegistered: (TaskProvider<T>.() -> Unit) = {},
    noinline configureTask: (T.() -> Unit)? = null
): TaskProvider<T> {
    locateTask<T>(name)?.let { return it }
    return registerTask(name, args, configureTask).also(invokeWhenRegistered)
}

internal open class KotlinTasksProvider {
    open fun registerKotlinJVMTask(
        project: Project,
        name: String,
        compilation: KotlinCompilationData<*>,
        configureAction: (KotlinCompile) -> (Unit)
    ): TaskProvider<out KotlinCompile> {
        val properties = PropertiesProvider(project)
        val kotlinCompile = project.registerTask(
            name,
            KotlinCompile::class.java,
            constructorArgs = listOf(compilation.kotlinOptions)
        )

        val configurator = KotlinCompile.Configurator<KotlinCompile>(compilation, properties)
        configurator.runAtConfigurationTime(kotlinCompile, project)

        kotlinCompile.configure {
            configureAction(it)
            configurator.configure(it)
        }
        configure(kotlinCompile, project, properties, compilation)

        return kotlinCompile
    }

    fun registerKotlinJSTask(
        project: Project,
        name: String,
        compilation: KotlinCompilationData<*>,
        configureAction: (Kotlin2JsCompile) -> Unit
    ): TaskProvider<out Kotlin2JsCompile> {
        val properties = PropertiesProvider(project)
        val result = project.registerTask(
            name,
            Kotlin2JsCompile::class.java,
            constructorArgs = listOf(compilation.kotlinOptions)
        ) {
            configureAction(it)
            Kotlin2JsCompile.Configurator<Kotlin2JsCompile>(compilation).configure(it)
        }
        configure(result, project, properties, compilation)
        return result
    }

    fun registerKotlinJsIrTask(
        project: Project,
        name: String,
        compilation: KotlinCompilationData<*>,
        configureAction: (KotlinJsIrLink) -> Unit
    ): TaskProvider<out KotlinJsIrLink> {
        val properties = PropertiesProvider(project)
        val result = project.registerTask(
            name,
            KotlinJsIrLink::class.java
        ) {
            it.compilation = compilation
            configureAction(it)
            KotlinJsIrLink.Configurator(compilation).configure(it)
        }
        configure(result, project, properties, compilation)
        return result
    }

    fun registerKotlinCommonTask(
        project: Project,
        name: String,
        compilation: KotlinCompilationData<*>,
        configureAction: (KotlinCompileCommon) -> (Unit)
    ): TaskProvider<out KotlinCompileCommon> {
        val properties = PropertiesProvider(project)
        val result = project.registerTask(
            name,
            KotlinCompileCommon::class.java,
            constructorArgs = listOf(compilation.kotlinOptions)
        ) {
            configureAction(it)
            KotlinCompileCommon.Configurator(compilation).configure(it)
        }
        configure(result, project, properties, compilation)
        return result
    }

    open fun configure(
        kotlinTaskHolder: TaskProvider<out AbstractKotlinCompile<*>>,
        project: Project,
        propertiesProvider: PropertiesProvider,
        compilation: KotlinCompilationData<*>
    ) {
        project.runOnceAfterEvaluated("apply properties and language settings to ${kotlinTaskHolder.name}", kotlinTaskHolder) {
            propertiesProvider.mapKotlinTaskProperties(kotlinTaskHolder.get())

            applyLanguageSettingsToKotlinOptions(
                compilation.languageSettings,
                (kotlinTaskHolder.get() as org.jetbrains.kotlin.gradle.dsl.KotlinCompile<*>).kotlinOptions
            )
        }
    }
}

internal class AndroidTasksProvider : KotlinTasksProvider() {
    override fun configure(
        kotlinTaskHolder: TaskProvider<out AbstractKotlinCompile<*>>,
        project: Project,
        propertiesProvider: PropertiesProvider,
        compilation: KotlinCompilationData<*>
    ) {
        super.configure(kotlinTaskHolder, project, propertiesProvider, compilation)
        kotlinTaskHolder.configure {
            it.useModuleDetection.set(true)
        }
    }
}
