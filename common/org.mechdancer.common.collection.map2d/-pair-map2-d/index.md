---
title: PairMap2D - common
---

[common](../../index.html) / [org.mechdancer.common.collection.map2d](../index.html) / [PairMap2D](./index.html)

# PairMap2D

`class PairMap2D<T, U, V> : `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<T, U>, V>, `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>`

二维映射

### Constructors

| [&lt;init&gt;](-init-.html) | 二维映射`PairMap2D(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<T, U>, V>)` |

### Properties

| [keys0](keys0.html) | 获取键[T](../-i-map2-d/index.html#T)集合`val keys0: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<T>` |
| [keys1](keys1.html) | 获取键[U](../-i-map2-d/index.html#U)集合`val keys1: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<U>` |

### Functions

| [get](get.html) | 获取值`fun get(t: T, u: U): V?` |
| [toPairMap](to-pair-map.html) | 转键对映射`fun toPairMap(): `[`PairMap2D`](./index.html)`<T, U, V>` |
| [values0](values0.html) | 按键[T](../-i-map2-d/index.html#T)查找`fun values0(t: T): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<U, V?>` |
| [values1](values1.html) | 按键[U](../-i-map2-d/index.html#U)查找`fun values1(u: U): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<T, V?>` |

### Extension Functions

| [fillBy](../fill-by.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.fillBy(block: (T, U) -> V): `[`ICompleteMap2D`](../-i-complete-map2-d/index.html)`<T, U, V>` |
| [mapValue](../map-value.html) | 值映射到另一表`fun <T, U, V, V1> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.mapValue(block: (V) -> V1): `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V1>` |
| [toMap2D](../to-map2-d.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.toMap2D(): `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>` |
| [toMutableMap2D](../to-mutable-map2-d.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.toMutableMap2D(): `[`IMutableMap2D`](../-i-mutable-map2-d/index.html)`<T, U, V>` |
| [view](../view.html) | 通用转字符串`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.view(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [viewBy](../view-by.html) | 通用转字符串`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.viewBy(f0: (T) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f1: (U) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f2: (V) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

