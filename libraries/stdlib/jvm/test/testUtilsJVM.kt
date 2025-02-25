/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package test

import java.util.*
import kotlin.test.assertEquals

public actual fun assertTypeEquals(expected: Any?, actual: Any?) {
    assertEquals(expected?.javaClass, actual?.javaClass)
}

private val isJava6 = System.getProperty("java.version").startsWith("1.6.")

internal actual fun String.removeLeadingPlusOnJava6(): String =
    if (isJava6) removePrefix("+") else this

private val isJava7 = System.getProperty("java.version").startsWith("1.7.")

private val isJava8AndAbove = !isJava6 && !isJava7

internal actual inline fun testOnNonJvm6And7(f: () -> Unit) {
    if (isJava8AndAbove) {
        f()
    }
}
internal inline fun testOnJvm7AndAbove(f: () -> Unit) {
    if (!isJava6) {
        f()
    }
}
public actual fun testOnJvm(action: () -> Unit) = action()
public actual fun testOnJs(action: () -> Unit) {}

@Suppress("HasPlatformType", "UNCHECKED_CAST")
public fun <T> platformNull() = Collections.singletonList(null as T).first()

public actual val isFloat32RangeEnforced: Boolean = true

public actual val supportsSuppressedExceptions: Boolean get() = !isJava6

public actual val supportsNamedCapturingGroup: Boolean get() = !isJava6

public actual val regexSplitUnicodeCodePointHandling: Boolean get() = false