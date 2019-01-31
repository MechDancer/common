---
title: Optional - 
---

[org.mechdancer.common.extension](../index.html) / [Optional](./index.html)

# Optional

`inline class Optional<out T>`

A discriminated union that encapsulates a value of type [T](index.html#T)
or void represented by `Void`.

### Properties

| [existent](existent.html) | `val existent: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if this instance has a value. In this case [nonexistent](nonexistent.html) returns `false`. |
| [nonexistent](nonexistent.html) | `val nonexistent: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if this instance has no value. In this case [existent](existent.html) returns `false`. |

### Functions

| [getOrElse](get-or-else.html) | `fun <U, T : `[`U`](get-or-else.html#U)`> getOrElse(otherwise: `[`U`](get-or-else.html#U)`): `[`U`](get-or-else.html#U)<br>Returns the encapsulated value if this instance [existent](existent.html) or [otherwise](get-or-else.html#org.mechdancer.common.extension.Optional$getOrElse(org.mechdancer.common.extension.Optional.getOrElse.U)/otherwise) if it is [nonexistent](nonexistent.html). |
| [getOrNull](get-or-null.html) | `fun getOrNull(): `[`T`](index.html#T)`?`<br>Returns the encapsulated value if this instance [existent](existent.html) or `null` if it is [nonexistent](nonexistent.html). |
| [otherwise](otherwise.html) | `fun otherwise(action: () -> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Optional`](./index.html)`<`[`T`](index.html#T)`>`<br>Performs the given [action](otherwise.html#org.mechdancer.common.extension.Optional$otherwise(kotlin.Function0((kotlin.Any)))/action) on encapsulated exception if this instance [nonexistent](nonexistent.html). Returns the original `Optional` unchanged. |
| [then](then.html) | `fun then(action: (`[`T`](index.html#T)`) -> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Optional`](./index.html)`<`[`T`](index.html#T)`>`<br>Performs the given [action](then.html#org.mechdancer.common.extension.Optional$then(kotlin.Function1((org.mechdancer.common.extension.Optional.T, kotlin.Any)))/action) on encapsulated value if this instance [exist](#). Returns the original `Optional` unchanged. |

### Companion Object Properties

| [otherwise](otherwise.html) | `val otherwise: `[`Optional`](./index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>`<br>Returns a encapsulated `Void`. |

### Companion Object Functions

| [otherwise](otherwise.html) | `fun <T> otherwise(): `[`Optional`](./index.html)`<`[`T`](otherwise.html#T)`>`<br>Returns a encapsulated `Void` with specific type [T](otherwise.html#T). |

### Extension Functions

| [cast](../kotlin.-any/cast.html) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.cast(): `[`T`](../kotlin.-any/cast.html#T)<br>Casts [this](../kotlin.-any/cast/-this-.html) to the class represented by type parameter [T](../kotlin.-any/cast.html#T). Throws an exception if the value is `null` or if it is not an instance of [T](../kotlin.-any/cast.html#T). |
| [safeCast](../kotlin.-any/safe-cast.html) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.safeCast(): `[`T`](../kotlin.-any/safe-cast.html#T)`?`<br>Casts [this](../kotlin.-any/safe-cast/-this-.html) to the class represented by type parameter [T](../kotlin.-any/safe-cast.html#T). Returns `null` if the value is `null` or if it is not an instance of [T](../kotlin.-any/safe-cast.html#T). |

