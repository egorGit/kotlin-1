/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.impl.barebone.test

import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.test.model.TestModule
import org.jetbrains.kotlin.test.services.TestService
import org.jetbrains.kotlin.test.services.TestServices

class TestKtModuleProvider(
    private val testServices: TestServices
) : TestService {
    private val cache = mutableMapOf<String, TestKtModule>()

    fun registerModuleInfo(testModule: TestModule, ktModule: TestKtModule) {
        cache[testModule.name] = ktModule
    }

    fun getModuleInfoByKtFile(ktFile: KtFile): TestKtModule =
        cache.values.first { moduleSourceInfo ->
            (if (ktFile.isPhysical) ktFile else ktFile.originalFile) in moduleSourceInfo.ktFiles
        }

    fun getModule(moduleName: String): TestKtModule =
        cache.getValue(moduleName)
}

val TestServices.projectModuleProvider: TestKtModuleProvider by TestServices.testServiceAccessor()
