---
title: org.mechdancer.common.extension - 
---

[org.mechdancer.common.extension](./index.html)

## Package org.mechdancer.common.extension

### Types

| [Optional](-optional/index.html) | `class Optional<out T>`<br>A discriminated union that encapsulates a value of type [T](-optional/index.html#T) or void represented by `Void`. |

### Extensions for External Classes

| [kotlin.Any](kotlin.-any/index.html) |  |
| [kotlin.Boolean](kotlin.-boolean/index.html) |  |
| [kotlin.Double](kotlin.-double/index.html) |  |
| [kotlin.ranges.ClosedFloatingPointRange](kotlin.ranges.-closed-floating-point-range/index.html) |  |
| [kotlin.ranges.IntRange](kotlin.ranges.-int-range/index.html) |  |

### Functions

| [check](check.html) | `fun <T> `[`T`](check.html#T)`.check(predicate: (`[`T`](check.html#T)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Optional`](-optional/index.html)`<`[`T`](check.html#T)`>`<br>Returns an instance of [Optional](-optional/index.html) encapsulated [this](check/-this-.html) if it satisfies the given [predicate](check.html#org.mechdancer.common.extension$check(org.mechdancer.common.extension.check.T, kotlin.Function1((org.mechdancer.common.extension.check.T, kotlin.Boolean)))/predicate) or an instance of [Optional](-optional/index.html) represented `void`, if it doesn't. |
| [toOptional](to-optional.html) | `fun <T> `[`T`](to-optional.html#T)`.toOptional(): `[`Optional`](-optional/index.html)`<`[`T`](to-optional.html#T)`>`<br>Returns an instance of [Optional](-optional/index.html) encapsulated [this](to-optional/-this-.html). |

