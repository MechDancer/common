---
title: CompleteSymmetricPairMap2D - common
---

[common](../../index.html) / [org.mechdancer.common.collection.map2d](../index.html) / [CompleteSymmetricPairMap2D](./index.html)

# CompleteSymmetricPairMap2D

`class CompleteSymmetricPairMap2D<T, V> : `[`ICompleteSymmetricMap2D`](../-i-complete-symmetric-map2-d/index.html)`<T, V>`

完全对称表
添加表头时使用 [map](#) 构造表项

### Constructors

| [&lt;init&gt;](-init-.html) | 完全对称表 添加表头时使用 [map](#) 构造表项`CompleteSymmetricPairMap2D(map: (T, T) -> V)` |

### Extension Functions

| [fillBy](../fill-by.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.fillBy(block: (T, U) -> V): `[`ICompleteMap2D`](../-i-complete-map2-d/index.html)`<T, U, V>` |
| [mapValue](../map-value.html) | 值映射到另一表`fun <T, U, V, V1> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.mapValue(block: (V) -> V1): `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V1>` |
| [plusAssign](../plus-assign.html) | 添加或修改表项`operator fun <T, V> `[`ICompleteSymmetricMap2D`](../-i-complete-symmetric-map2-d/index.html)`<T, V>.plusAssign(t: T): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [toMap2D](../to-map2-d.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.toMap2D(): `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>` |
| [toMutableMap2D](../to-mutable-map2-d.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.toMutableMap2D(): `[`IMutableMap2D`](../-i-mutable-map2-d/index.html)`<T, U, V>` |
| [view](../view.html) | 通用转字符串`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.view(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [viewBy](../view-by.html) | 通用转字符串`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.viewBy(f0: (T) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f1: (U) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f2: (V) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

