/*
 * Copyright 2010-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir.types

import org.jetbrains.kotlin.ir.declarations.IrAnnotationContainer
import org.jetbrains.kotlin.ir.symbols.IrClassifierSymbol
import org.jetbrains.kotlin.ir.symbols.IrTypeAliasSymbol
import org.jetbrains.kotlin.ir.types.impl.IrTypeBase
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.Variance
import org.jetbrains.kotlin.types.model.*

abstract class IrType : KotlinTypeMarker, IrAnnotationContainer {

    /**
     * @return true if this type is equal to [other] symbolically. Note that this is NOT EQUIVALENT to the full type checking algorithm
     * used in the compiler frontend. For example, this method will return `false` on the types `List<*>` and `List<Any?>`,
     * whereas the real type checker from the compiler frontend would return `true`.
     *
     * Classes are compared by FQ names, which means that even if two types refer to different symbols of the class with the same FQ name,
     * such types will be considered equal. Type annotations do not have any effect on the behavior of this method.
     */
    abstract override fun equals(other: Any?): Boolean

    abstract override fun hashCode(): Int
}

abstract class IrErrorType(kotlinType: KotlinType?) : IrTypeBase(kotlinType)

abstract class IrDynamicType(kotlinType: KotlinType?) : IrTypeBase(kotlinType), DynamicTypeMarker

abstract class IrDefinitelyNotNullType(kotlinType: KotlinType?) : IrTypeBase(kotlinType), DefinitelyNotNullTypeMarker {
    abstract val original: IrType
}

abstract class IrSimpleType(kotlinType: KotlinType?) : IrTypeBase(kotlinType), SimpleTypeMarker, TypeArgumentListMarker {
    abstract val classifier: IrClassifierSymbol
    abstract val hasQuestionMark: Boolean
    abstract val arguments: List<IrTypeArgument>
    abstract val abbreviation: IrTypeAbbreviation?
}

interface IrTypeArgument : TypeArgumentMarker {
    override fun equals(other: Any?): Boolean
    override fun hashCode(): Int
}

interface IrStarProjection : IrTypeArgument

interface IrTypeProjection : IrTypeArgument {
    val variance: Variance
    val type: IrType
}

interface IrTypeAbbreviation : IrAnnotationContainer {
    val typeAlias: IrTypeAliasSymbol
    val hasQuestionMark: Boolean
    val arguments: List<IrTypeArgument>
}