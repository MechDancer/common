---
title: Optional - common
---

[common](../../index.html) / [org.mechdancer.common.extension](../index.html) / [Optional](./index.html)

# Optional

`inline class Optional<out T>`

A discriminated union that encapsulates a value of type [T](index.html#T)
or void represented by `Void`.

### Properties

| [existent](existent.html) | Returns `true` if this instance has a value. In this case [nonexistent](nonexistent.html) returns `false`.`val existent: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [nonexistent](nonexistent.html) | Returns `true` if this instance has no value. In this case [existent](existent.html) returns `false`.`val nonexistent: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Functions

| [get](get.html) | Returns the encapsulated value if this instance [existent](existent.html) or throw an [UnsupportedOperationException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unsupported-operation-exception/index.html) if it is [nonexistent](nonexistent.html).`fun get(): T` |
| [getOrElse](get-or-else.html) | Returns the encapsulated value if this instance [existent](existent.html) or [otherwise](get-or-else.html#org.mechdancer.common.extension.Optional$getOrElse(org.mechdancer.common.extension.Optional.getOrElse.U)/otherwise) if it is [nonexistent](nonexistent.html).`fun <U, T : U> getOrElse(otherwise: U): U` |
| [getOrNull](get-or-null.html) | Returns the encapsulated value if this instance [existent](existent.html) or `null` if it is [nonexistent](nonexistent.html).`fun getOrNull(): T?` |
| [otherwise](otherwise.html) | Performs the given [action](otherwise.html#org.mechdancer.common.extension.Optional$otherwise(kotlin.Function0((kotlin.Any)))/action) on encapsulated exception if this instance [nonexistent](nonexistent.html). Returns the original `Optional` unchanged.`fun otherwise(action: () -> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Optional`](./index.html)`<T>` |
| [then](then.html) | Performs the given [action](then.html#org.mechdancer.common.extension.Optional$then(kotlin.Function1((org.mechdancer.common.extension.Optional.T, kotlin.Any)))/action) on encapsulated value if this instance [existent](existent.html). Returns the original `Optional` unchanged.`fun then(action: (T) -> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Optional`](./index.html)`<T>` |

### Companion Object Properties

| [otherwise](otherwise.html) | Returns a encapsulated `Void`.`val otherwise: `[`Optional`](./index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>` |

### Companion Object Functions

| [otherwise](otherwise.html) | Returns a encapsulated `Void` with specific type [T](otherwise.html#T).`fun <T> otherwise(): `[`Optional`](./index.html)`<T>` |

### Extension Functions

| [ap](../ap.html) | `infix fun <T, U> `[`Optional`](./index.html)`<T>.ap(f: `[`Optional`](./index.html)`<(T) -> U>): `[`Optional`](./index.html)`<U>` |
| [flatMap](../flat-map.html) | `infix fun <T, U> `[`Optional`](./index.html)`<T>.flatMap(f: (T) -> `[`Optional`](./index.html)`<U>): `[`Optional`](./index.html)`<U>` |
| [join](../join.html) | `fun <T> `[`Optional`](./index.html)`<`[`Optional`](./index.html)`<T>>.join(): `[`Optional`](./index.html)`<T>` |
| [map](../map.html) | `infix fun <T, U> `[`Optional`](./index.html)`<T>.map(f: (T) -> U): `[`Optional`](./index.html)`<U>` |

