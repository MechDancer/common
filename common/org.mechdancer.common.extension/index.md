---
title: org.mechdancer.common.extension - common
---

[common](../index.html) / [org.mechdancer.common.extension](./index.html)

## Package org.mechdancer.common.extension

### Types

| [Optional](-optional/index.html) | A discriminated union that encapsulates a value of type [T](-optional/index.html#T) or void represented by `Void`.`class Optional<out T>` |
| [Slider](-slider/index.html) | 容纳 [T](-slider/index.html#T) 的滑块，[size](#) 次不变视作稳定`class Slider<T> : `[`ReadWriteProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-write-property/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, T?>` |
| [TimedSlider](-timed-slider/index.html) | 容纳[T](-timed-slider/index.html#T)的滑块，[time](#)ms 不变视作稳定`class TimedSlider<T> : `[`ReadWriteProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-write-property/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, T?>` |

### Extensions for External Classes

| [kotlin.Any](kotlin.-any/index.html) |  |
| [kotlin.Boolean](kotlin.-boolean/index.html) |  |
| [kotlin.Double](kotlin.-double/index.html) |  |
| [kotlin.Int](kotlin.-int/index.html) |  |
| [kotlin.Long](kotlin.-long/index.html) |  |
| [kotlin.ranges.ClosedFloatingPointRange](kotlin.ranges.-closed-floating-point-range/index.html) |  |
| [kotlin.ranges.ClosedRange](kotlin.ranges.-closed-range/index.html) |  |
| [kotlin.ranges.IntRange](kotlin.ranges.-int-range/index.html) |  |
| [kotlin.ranges.LongRange](kotlin.ranges.-long-range/index.html) |  |

### Functions

| [ap](ap.html) | `infix fun <T, U> `[`Optional`](-optional/index.html)`<T>.ap(f: `[`Optional`](-optional/index.html)`<(T) -> U>): `[`Optional`](-optional/index.html)`<U>` |
| [check](check.html) | Returns an instance of [Optional](-optional/index.html) encapsulated [this](check/-this-.html) if it satisfies the given [predicate](check.html#org.mechdancer.common.extension$check(org.mechdancer.common.extension.check.T, kotlin.Function1((org.mechdancer.common.extension.check.T, kotlin.Boolean)))/predicate) or an instance of [Optional](-optional/index.html) represented `void`, if it doesn't.`fun <T> T.check(predicate: (T) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Optional`](-optional/index.html)`<T>` |
| [flatMap](flat-map.html) | `infix fun <T, U> `[`Optional`](-optional/index.html)`<T>.flatMap(f: (T) -> `[`Optional`](-optional/index.html)`<U>): `[`Optional`](-optional/index.html)`<U>` |
| [join](join.html) | `fun <T> `[`Optional`](-optional/index.html)`<`[`Optional`](-optional/index.html)`<T>>.join(): `[`Optional`](-optional/index.html)`<T>` |
| [map](map.html) | `infix fun <T, U> `[`Optional`](-optional/index.html)`<T>.map(f: (T) -> U): `[`Optional`](-optional/index.html)`<U>` |
| [orDefault](or-default.html) | If [this](or-default/-this-.html) is `null`, use [value](or-default.html#org.mechdancer.common.extension$orDefault(org.mechdancer.common.extension.orDefault.T, org.mechdancer.common.extension.orDefault.T)/value) instead.`fun <T> T.orDefault(value: T): T` |
| [toOptional](to-optional.html) | Returns an instance of [Optional](-optional/index.html) encapsulated [this](to-optional/-this-.html).`fun <T> T.toOptional(): `[`Optional`](-optional/index.html)`<T>` |

