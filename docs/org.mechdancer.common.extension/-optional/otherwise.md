---
title: Optional.otherwise - 
---

[org.mechdancer.common.extension](../index.html) / [Optional](index.html) / [otherwise](./otherwise.html)

# otherwise

`inline fun otherwise(action: () -> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Optional`](index.html)`<`[`T`](index.html#T)`>`

Performs the given [action](otherwise.html#org.mechdancer.common.extension.Optional$otherwise(kotlin.Function0((kotlin.Any)))/action) on encapsulated exception if this instance [nonexistent](nonexistent.html).
Returns the original `Optional` unchanged.

`val otherwise: `[`Optional`](index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>`

Returns a encapsulated `Void`.

`fun <T> otherwise(): `[`Optional`](index.html)`<`[`T`](otherwise.html#T)`>`

Returns a encapsulated `Void` with specific type [T](otherwise.html#T).

