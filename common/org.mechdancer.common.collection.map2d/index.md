---
title: org.mechdancer.common.collection.map2d - common
---

[common](../index.html) / [org.mechdancer.common.collection.map2d](./index.html)

## Package org.mechdancer.common.collection.map2d

### Types

| [CompletePairMap2D](-complete-pair-map2-d/index.html) | 自填充二维映射`class CompletePairMap2D<T, U, V> : `[`ICompleteMap2D`](-i-complete-map2-d/index.html)`<T, U, V>` |
| [CompleteSymmetricPairMap2D](-complete-symmetric-pair-map2-d/index.html) | 完全对称表 添加表头时使用 [map](#) 构造表项`class CompleteSymmetricPairMap2D<T, V> : `[`ICompleteSymmetricMap2D`](-i-complete-symmetric-map2-d/index.html)`<T, V>` |
| [ICompleteMap2D](-i-complete-map2-d/index.html) | 完全二维映射 通过固定映射函数保证表填满`interface ICompleteMap2D<T, U, V> : `[`IMap2D`](-i-map2-d/index.html)`<T, U, V>` |
| [ICompleteSymmetricMap2D](-i-complete-symmetric-map2-d/index.html) | 自动填充对称二维映射 保证表是填满的正方形`interface ICompleteSymmetricMap2D<T, V> : `[`IMap2D`](-i-map2-d/index.html)`<T, T, V>` |
| [IMap2D](-i-map2-d/index.html) | 二维映射`interface IMap2D<T, U, V>` |
| [IMutableMap2D](-i-mutable-map2-d/index.html) | 可变二维映射`interface IMutableMap2D<T, U, V> : `[`IMap2D`](-i-map2-d/index.html)`<T, U, V>` |
| [MutablePairMap2D](-mutable-pair-map2-d/index.html) | 可变二维映射`class MutablePairMap2D<T, U, V> : `[`IMutableMap2D`](-i-mutable-map2-d/index.html)`<T, U, V>` |
| [PairMap2D](-pair-map2-d/index.html) | 二维映射`class PairMap2D<T, U, V> : `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<T, U>, V>, `[`IMap2D`](-i-map2-d/index.html)`<T, U, V>` |

### Extensions for External Classes

| [kotlin.collections.Iterable](kotlin.collections.-iterable/index.html) |  |

### Functions

| [fillBy](fill-by.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](-i-map2-d/index.html)`<T, U, V>.fillBy(block: (T, U) -> V): `[`ICompleteMap2D`](-i-complete-map2-d/index.html)`<T, U, V>` |
| [map](map.html) | 构造二维映射`fun <T, U, V> map(t: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>, u: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<U>, block: (T, U) -> V): `[`IMap2D`](-i-map2-d/index.html)`<T, U, V>` |
| [mapValue](map-value.html) | 值映射到另一表`fun <T, U, V, V1> `[`IMap2D`](-i-map2-d/index.html)`<T, U, V>.mapValue(block: (V) -> V1): `[`IMap2D`](-i-map2-d/index.html)`<T, U, V1>` |
| [mapValues](map-values.html) | 构造二维映射`fun <T, U, V> mapValues(t: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>, u: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<U>, block: (T, U) -> V): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<V>` |
| [plusAssign](plus-assign.html) | 添加或修改表项`operator fun <T, V> `[`ICompleteSymmetricMap2D`](-i-complete-symmetric-map2-d/index.html)`<T, V>.plusAssign(t: T): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [set](set.html) | 添加或修改表项`operator fun <T, U, V> `[`IMutableMap2D`](-i-mutable-map2-d/index.html)`<T, U, V>.set(t: T, u: U, v: V): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [toMap2D](to-map2-d.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](-i-map2-d/index.html)`<T, U, V>.toMap2D(): `[`IMap2D`](-i-map2-d/index.html)`<T, U, V>` |
| [toMutableMap2D](to-mutable-map2-d.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](-i-map2-d/index.html)`<T, U, V>.toMutableMap2D(): `[`IMutableMap2D`](-i-mutable-map2-d/index.html)`<T, U, V>` |
| [view](view.html) | 通用转字符串`fun <T, U, V> `[`IMap2D`](-i-map2-d/index.html)`<T, U, V>.view(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [viewBy](view-by.html) | 通用转字符串`fun <T, U, V> `[`IMap2D`](-i-map2-d/index.html)`<T, U, V>.viewBy(f0: (T) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f1: (U) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f2: (V) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

