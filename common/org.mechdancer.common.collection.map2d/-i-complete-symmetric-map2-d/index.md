---
title: ICompleteSymmetricMap2D - common
---

[common](../../index.html) / [org.mechdancer.common.collection.map2d](../index.html) / [ICompleteSymmetricMap2D](./index.html)

# ICompleteSymmetricMap2D

`interface ICompleteSymmetricMap2D<T, V> : `[`IMap2D`](../-i-map2-d/index.html)`<T, T, V>`

自动填充对称二维映射
保证表是填满的正方形

### Properties

| [map](map.html) | 映射函数`abstract val map: (T, T) -> V` |

### Functions

| [put](put.html) | 添加键[T](index.html#T)`abstract fun put(t: T): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [putAll](put-all.html) | 添加一组键[T](index.html#T)`abstract fun putAll(t: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [remove](remove.html) | 移除键[T](index.html#T)`abstract fun remove(t: T): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [removeAll](remove-all.html) | 移除一组键[T](index.html#T)`abstract fun removeAll(t: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Extension Functions

| [fillBy](../fill-by.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.fillBy(block: (T, U) -> V): `[`ICompleteMap2D`](../-i-complete-map2-d/index.html)`<T, U, V>` |
| [mapValue](../map-value.html) | 值映射到另一表`fun <T, U, V, V1> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.mapValue(block: (V) -> V1): `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V1>` |
| [plusAssign](../plus-assign.html) | 添加或修改表项`operator fun <T, V> `[`ICompleteSymmetricMap2D`](./index.html)`<T, V>.plusAssign(t: T): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [toMap2D](../to-map2-d.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.toMap2D(): `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>` |
| [toMutableMap2D](../to-mutable-map2-d.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.toMutableMap2D(): `[`IMutableMap2D`](../-i-mutable-map2-d/index.html)`<T, U, V>` |
| [view](../view.html) | 通用转字符串`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.view(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [viewBy](../view-by.html) | 通用转字符串`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.viewBy(f0: (T) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f1: (U) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f2: (V) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Inheritors

| [CompleteSymmetricPairMap2D](../-complete-symmetric-pair-map2-d/index.html) | 完全对称表 添加表头时使用 [map](#) 构造表项`class CompleteSymmetricPairMap2D<T, V> : `[`ICompleteSymmetricMap2D`](./index.html)`<T, V>` |

