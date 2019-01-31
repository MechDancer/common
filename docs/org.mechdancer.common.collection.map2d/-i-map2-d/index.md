---
title: IMap2D - 
---

[org.mechdancer.common.collection.map2d](../index.html) / [IMap2D](./index.html)

# IMap2D

`interface IMap2D<T, U, V>`

二维映射

### Parameters

`T` - 第一种键类型

`U` - 第二种键类型

`V` - 值类型

### Properties

| [keys0](keys0.html) | `abstract val keys0: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`T`](index.html#T)`>`<br>获取键[T](index.html#T)集合 |
| [keys1](keys1.html) | `abstract val keys1: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`U`](index.html#U)`>`<br>获取键[U](index.html#U)集合 |

### Functions

| [containsKey0](contains-key0.html) | `open fun containsKey0(key: `[`T`](index.html#T)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>判断是否包含某个键[T](index.html#T) |
| [containsKey1](contains-key1.html) | `open fun containsKey1(key: `[`U`](index.html#U)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>判断是否包含某个键[U](index.html#U) |
| [get](get.html) | `abstract operator fun get(t: `[`T`](index.html#T)`, u: `[`U`](index.html#U)`): `[`V`](index.html#V)`?`<br>获取值 |
| [toPairMap](to-pair-map.html) | `abstract fun toPairMap(): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`T`](index.html#T)`, `[`U`](index.html#U)`>, `[`V`](index.html#V)`>`<br>转键对映射 |
| [values0](values0.html) | `abstract fun values0(t: `[`T`](index.html#T)`): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`U`](index.html#U)`, `[`V`](index.html#V)`?>`<br>按键[T](index.html#T)查找 |
| [values1](values1.html) | `abstract fun values1(u: `[`U`](index.html#U)`): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`T`](index.html#T)`, `[`V`](index.html#V)`?>`<br>按键[U](index.html#U)查找 |

### Extension Functions

| [cast](../../org.mechdancer.common.extension/kotlin.-any/cast.html) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.cast(): `[`T`](../../org.mechdancer.common.extension/kotlin.-any/cast.html#T)<br>Casts [this](../../org.mechdancer.common.extension/kotlin.-any/cast/-this-.html) to the class represented by type parameter [T](../../org.mechdancer.common.extension/kotlin.-any/cast.html#T). Throws an exception if the value is `null` or if it is not an instance of [T](../../org.mechdancer.common.extension/kotlin.-any/cast.html#T). |
| [fillBy](../fill-by.html) | `fun <T, U, V> `[`IMap2D`](./index.html)`<`[`T`](../fill-by.html#T)`, `[`U`](../fill-by.html#U)`, `[`V`](../fill-by.html#V)`>.fillBy(block: (`[`T`](../fill-by.html#T)`, `[`U`](../fill-by.html#U)`) -> `[`V`](../fill-by.html#V)`): `[`ICompleteMap2D`](../-i-complete-map2-d/index.html)`<`[`T`](../fill-by.html#T)`, `[`U`](../fill-by.html#U)`, `[`V`](../fill-by.html#V)`>`<br>转不可变二维映射 |
| [mapValue](../map-value.html) | `fun <T, U, V, V1> `[`IMap2D`](./index.html)`<`[`T`](../map-value.html#T)`, `[`U`](../map-value.html#U)`, `[`V`](../map-value.html#V)`>.mapValue(block: (`[`V`](../map-value.html#V)`) -> `[`V1`](../map-value.html#V1)`): `[`IMap2D`](./index.html)`<`[`T`](../map-value.html#T)`, `[`U`](../map-value.html#U)`, `[`V1`](../map-value.html#V1)`>`<br>值映射到另一表 |
| [safeCast](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.safeCast(): `[`T`](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T)`?`<br>Casts [this](../../org.mechdancer.common.extension/kotlin.-any/safe-cast/-this-.html) to the class represented by type parameter [T](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T). Returns `null` if the value is `null` or if it is not an instance of [T](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T). |
| [toMap2D](../to-map2-d.html) | `fun <T, U, V> `[`IMap2D`](./index.html)`<`[`T`](../to-map2-d.html#T)`, `[`U`](../to-map2-d.html#U)`, `[`V`](../to-map2-d.html#V)`>.toMap2D(): `[`IMap2D`](./index.html)`<`[`T`](../to-map2-d.html#T)`, `[`U`](../to-map2-d.html#U)`, `[`V`](../to-map2-d.html#V)`>`<br>转不可变二维映射 |
| [toMutableMap2D](../to-mutable-map2-d.html) | `fun <T, U, V> `[`IMap2D`](./index.html)`<`[`T`](../to-mutable-map2-d.html#T)`, `[`U`](../to-mutable-map2-d.html#U)`, `[`V`](../to-mutable-map2-d.html#V)`>.toMutableMap2D(): `[`IMutableMap2D`](../-i-mutable-map2-d/index.html)`<`[`T`](../to-mutable-map2-d.html#T)`, `[`U`](../to-mutable-map2-d.html#U)`, `[`V`](../to-mutable-map2-d.html#V)`>`<br>转不可变二维映射 |
| [viewBy](../view-by.html) | `fun <T, U, V> `[`IMap2D`](./index.html)`<`[`T`](../view-by.html#T)`, `[`U`](../view-by.html#U)`, `[`V`](../view-by.html#V)`>.viewBy(f0: (`[`T`](../view-by.html#T)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f1: (`[`U`](../view-by.html#U)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f2: (`[`V`](../view-by.html#V)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>通用转字符串 |
| [viewDefault](../view-default.html) | `fun <T, U, V> `[`IMap2D`](./index.html)`<`[`T`](../view-default.html#T)`, `[`U`](../view-default.html#U)`, `[`V`](../view-default.html#V)`>.viewDefault(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>通用转字符串 |

### Inheritors

| [ICompleteMap2D](../-i-complete-map2-d/index.html) | `interface ICompleteMap2D<T, U, V> : `[`IMap2D`](./index.html)`<`[`T`](../-i-complete-map2-d/index.html#T)`, `[`U`](../-i-complete-map2-d/index.html#U)`, `[`V`](../-i-complete-map2-d/index.html#V)`>`<br>完全二维映射 通过固定映射函数保证表填满 |
| [ICompleteSymmetricMap2D](../-i-complete-symmetric-map2-d/index.html) | `interface ICompleteSymmetricMap2D<T, V> : `[`IMap2D`](./index.html)`<`[`T`](../-i-complete-symmetric-map2-d/index.html#T)`, `[`T`](../-i-complete-symmetric-map2-d/index.html#T)`, `[`V`](../-i-complete-symmetric-map2-d/index.html#V)`>`<br>自动填充对称二维映射 保证表是填满的正方形 |
| [IMutableMap2D](../-i-mutable-map2-d/index.html) | `interface IMutableMap2D<T, U, V> : `[`IMap2D`](./index.html)`<`[`T`](../-i-mutable-map2-d/index.html#T)`, `[`U`](../-i-mutable-map2-d/index.html#U)`, `[`V`](../-i-mutable-map2-d/index.html#V)`>`<br>可变二维映射 |
| [PairMap2D](../-pair-map2-d/index.html) | `class PairMap2D<T, U, V> : `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`T`](../-pair-map2-d/index.html#T)`, `[`U`](../-pair-map2-d/index.html#U)`>, `[`V`](../-pair-map2-d/index.html#V)`>, `[`IMap2D`](./index.html)`<`[`T`](../-pair-map2-d/index.html#T)`, `[`U`](../-pair-map2-d/index.html#U)`, `[`V`](../-pair-map2-d/index.html#V)`>`<br>二维映射 |

