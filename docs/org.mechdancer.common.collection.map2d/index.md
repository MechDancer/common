---
title: org.mechdancer.common.collection.map2d - 
---

[org.mechdancer.common.collection.map2d](./index.html)

## Package org.mechdancer.common.collection.map2d

### Types

| [CompletePairMap2D](-complete-pair-map2-d/index.html) | `class CompletePairMap2D<T, U, V> : `[`ICompleteMap2D`](-i-complete-map2-d/index.html)`<`[`T`](-complete-pair-map2-d/index.html#T)`, `[`U`](-complete-pair-map2-d/index.html#U)`, `[`V`](-complete-pair-map2-d/index.html#V)`>`<br>自填充二维映射 |
| [CompleteSymmetricPairMap2D](-complete-symmetric-pair-map2-d/index.html) | `class CompleteSymmetricPairMap2D<T, V> : `[`ICompleteSymmetricMap2D`](-i-complete-symmetric-map2-d/index.html)`<`[`T`](-complete-symmetric-pair-map2-d/index.html#T)`, `[`V`](-complete-symmetric-pair-map2-d/index.html#V)`>`<br>完全对称表 |
| [ICompleteMap2D](-i-complete-map2-d/index.html) | `interface ICompleteMap2D<T, U, V> : `[`IMap2D`](-i-map2-d/index.html)`<`[`T`](-i-complete-map2-d/index.html#T)`, `[`U`](-i-complete-map2-d/index.html#U)`, `[`V`](-i-complete-map2-d/index.html#V)`>`<br>完全二维映射 通过固定映射函数保证表填满 |
| [ICompleteSymmetricMap2D](-i-complete-symmetric-map2-d/index.html) | `interface ICompleteSymmetricMap2D<T, V> : `[`IMap2D`](-i-map2-d/index.html)`<`[`T`](-i-complete-symmetric-map2-d/index.html#T)`, `[`T`](-i-complete-symmetric-map2-d/index.html#T)`, `[`V`](-i-complete-symmetric-map2-d/index.html#V)`>`<br>自动填充对称二维映射 保证表是填满的正方形 |
| [IMap2D](-i-map2-d/index.html) | `interface IMap2D<T, U, V>`<br>二维映射 |
| [IMutableMap2D](-i-mutable-map2-d/index.html) | `interface IMutableMap2D<T, U, V> : `[`IMap2D`](-i-map2-d/index.html)`<`[`T`](-i-mutable-map2-d/index.html#T)`, `[`U`](-i-mutable-map2-d/index.html#U)`, `[`V`](-i-mutable-map2-d/index.html#V)`>`<br>可变二维映射 |
| [MutablePairMap2D](-mutable-pair-map2-d/index.html) | `class MutablePairMap2D<T, U, V> : `[`IMutableMap2D`](-i-mutable-map2-d/index.html)`<`[`T`](-mutable-pair-map2-d/index.html#T)`, `[`U`](-mutable-pair-map2-d/index.html#U)`, `[`V`](-mutable-pair-map2-d/index.html#V)`>`<br>可变二维映射 |
| [PairMap2D](-pair-map2-d/index.html) | `class PairMap2D<T, U, V> : `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`T`](-pair-map2-d/index.html#T)`, `[`U`](-pair-map2-d/index.html#U)`>, `[`V`](-pair-map2-d/index.html#V)`>, `[`IMap2D`](-i-map2-d/index.html)`<`[`T`](-pair-map2-d/index.html#T)`, `[`U`](-pair-map2-d/index.html#U)`, `[`V`](-pair-map2-d/index.html#V)`>`<br>二维映射 |

### Extensions for External Classes

| [kotlin.collections.Set](kotlin.collections.-set/index.html) |  |

### Functions

| [fillBy](fill-by.html) | `fun <T, U, V> `[`IMap2D`](-i-map2-d/index.html)`<`[`T`](fill-by.html#T)`, `[`U`](fill-by.html#U)`, `[`V`](fill-by.html#V)`>.fillBy(block: (`[`T`](fill-by.html#T)`, `[`U`](fill-by.html#U)`) -> `[`V`](fill-by.html#V)`): `[`ICompleteMap2D`](-i-complete-map2-d/index.html)`<`[`T`](fill-by.html#T)`, `[`U`](fill-by.html#U)`, `[`V`](fill-by.html#V)`>`<br>转不可变二维映射 |
| [map](map.html) | `fun <T, U, V> map(t: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](map.html#T)`>, u: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`U`](map.html#U)`>, block: (`[`T`](map.html#T)`, `[`U`](map.html#U)`) -> `[`V`](map.html#V)`): `[`IMap2D`](-i-map2-d/index.html)`<`[`T`](map.html#T)`, `[`U`](map.html#U)`, `[`V`](map.html#V)`>`<br>构造二维映射`fun <T, V> map(set: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](map.html#T)`>, block: (`[`T`](map.html#T)`, `[`T`](map.html#T)`) -> `[`V`](map.html#V)`): `[`IMap2D`](-i-map2-d/index.html)`<`[`T`](map.html#T)`, `[`T`](map.html#T)`, `[`V`](map.html#V)`>`<br>展开对称二维映射 |
| [mapValue](map-value.html) | `fun <T, U, V, V1> `[`IMap2D`](-i-map2-d/index.html)`<`[`T`](map-value.html#T)`, `[`U`](map-value.html#U)`, `[`V`](map-value.html#V)`>.mapValue(block: (`[`V`](map-value.html#V)`) -> `[`V1`](map-value.html#V1)`): `[`IMap2D`](-i-map2-d/index.html)`<`[`T`](map-value.html#T)`, `[`U`](map-value.html#U)`, `[`V1`](map-value.html#V1)`>`<br>值映射到另一表 |
| [plusAssign](plus-assign.html) | `operator fun <T, V> `[`ICompleteSymmetricMap2D`](-i-complete-symmetric-map2-d/index.html)`<`[`T`](plus-assign.html#T)`, `[`V`](plus-assign.html#V)`>.plusAssign(t: `[`T`](plus-assign.html#T)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>添加或修改表项 |
| [set](set.html) | `operator fun <T, U, V> `[`IMutableMap2D`](-i-mutable-map2-d/index.html)`<`[`T`](set.html#T)`, `[`U`](set.html#U)`, `[`V`](set.html#V)`>.set(t: `[`T`](set.html#T)`, u: `[`U`](set.html#U)`, v: `[`V`](set.html#V)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>添加或修改表项 |
| [stretch2D](stretch2-d.html) | `fun <T, V> stretch2D(t: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](stretch2-d.html#T)`>, block: (`[`T`](stretch2-d.html#T)`, `[`T`](stretch2-d.html#T)`) -> `[`V`](stretch2-d.html#V)`): `[`ICompleteSymmetricMap2D`](-i-complete-symmetric-map2-d/index.html)`<`[`T`](stretch2-d.html#T)`, `[`V`](stretch2-d.html#V)`>`<br>展开可变二维映射 |
| [toMap2D](to-map2-d.html) | `fun <T, U, V> `[`IMap2D`](-i-map2-d/index.html)`<`[`T`](to-map2-d.html#T)`, `[`U`](to-map2-d.html#U)`, `[`V`](to-map2-d.html#V)`>.toMap2D(): `[`IMap2D`](-i-map2-d/index.html)`<`[`T`](to-map2-d.html#T)`, `[`U`](to-map2-d.html#U)`, `[`V`](to-map2-d.html#V)`>`<br>转不可变二维映射 |
| [toMutableMap2D](to-mutable-map2-d.html) | `fun <T, U, V> `[`IMap2D`](-i-map2-d/index.html)`<`[`T`](to-mutable-map2-d.html#T)`, `[`U`](to-mutable-map2-d.html#U)`, `[`V`](to-mutable-map2-d.html#V)`>.toMutableMap2D(): `[`IMutableMap2D`](-i-mutable-map2-d/index.html)`<`[`T`](to-mutable-map2-d.html#T)`, `[`U`](to-mutable-map2-d.html#U)`, `[`V`](to-mutable-map2-d.html#V)`>`<br>转不可变二维映射 |
| [viewBy](view-by.html) | `fun <T, U, V> `[`IMap2D`](-i-map2-d/index.html)`<`[`T`](view-by.html#T)`, `[`U`](view-by.html#U)`, `[`V`](view-by.html#V)`>.viewBy(f0: (`[`T`](view-by.html#T)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f1: (`[`U`](view-by.html#U)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f2: (`[`V`](view-by.html#V)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>通用转字符串 |
| [viewDefault](view-default.html) | `fun <T, U, V> `[`IMap2D`](-i-map2-d/index.html)`<`[`T`](view-default.html#T)`, `[`U`](view-default.html#U)`, `[`V`](view-default.html#V)`>.viewDefault(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>通用转字符串 |

