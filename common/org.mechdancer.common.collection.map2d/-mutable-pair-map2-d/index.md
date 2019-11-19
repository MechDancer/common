---
title: MutablePairMap2D - common
---

[common](../../index.html) / [org.mechdancer.common.collection.map2d](../index.html) / [MutablePairMap2D](./index.html)

# MutablePairMap2D

`class MutablePairMap2D<T, U, V> : `[`IMutableMap2D`](../-i-mutable-map2-d/index.html)`<T, U, V>`

可变二维映射

### Constructors

| [&lt;init&gt;](-init-.html) | 可变二维映射`MutablePairMap2D(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<T, U>, V> = mapOf())` |

### Extension Functions

| [fillBy](../fill-by.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.fillBy(block: (T, U) -> V): `[`ICompleteMap2D`](../-i-complete-map2-d/index.html)`<T, U, V>` |
| [mapValue](../map-value.html) | 值映射到另一表`fun <T, U, V, V1> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.mapValue(block: (V) -> V1): `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V1>` |
| [set](../set.html) | 添加或修改表项`operator fun <T, U, V> `[`IMutableMap2D`](../-i-mutable-map2-d/index.html)`<T, U, V>.set(t: T, u: U, v: V): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [toMap2D](../to-map2-d.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.toMap2D(): `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>` |
| [toMutableMap2D](../to-mutable-map2-d.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.toMutableMap2D(): `[`IMutableMap2D`](../-i-mutable-map2-d/index.html)`<T, U, V>` |
| [view](../view.html) | 通用转字符串`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.view(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [viewBy](../view-by.html) | 通用转字符串`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.viewBy(f0: (T) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f1: (U) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f2: (V) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

