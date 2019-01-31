---
title: PairMap2D - 
---

[org.mechdancer.common.collection.map2d](../index.html) / [PairMap2D](./index.html)

# PairMap2D

`class PairMap2D<T, U, V> : `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`T`](index.html#T)`, `[`U`](index.html#U)`>, `[`V`](index.html#V)`>, `[`IMap2D`](../-i-map2-d/index.html)`<`[`T`](index.html#T)`, `[`U`](index.html#U)`, `[`V`](index.html#V)`>`

二维映射

### Constructors

| [&lt;init&gt;](-init-.html) | `PairMap2D(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`T`](index.html#T)`, `[`U`](index.html#U)`>, `[`V`](index.html#V)`>)`<br>二维映射 |

### Properties

| [keys0](keys0.html) | `val keys0: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`T`](index.html#T)`>`<br>获取键[T](../-i-map2-d/index.html#T)集合 |
| [keys1](keys1.html) | `val keys1: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`U`](index.html#U)`>`<br>获取键[U](../-i-map2-d/index.html#U)集合 |

### Functions

| [get](get.html) | `fun get(t: `[`T`](index.html#T)`, u: `[`U`](index.html#U)`): `[`V`](index.html#V)`?`<br>获取值 |
| [toPairMap](to-pair-map.html) | `fun toPairMap(): `[`PairMap2D`](./index.html)`<`[`T`](index.html#T)`, `[`U`](index.html#U)`, `[`V`](index.html#V)`>`<br>转键对映射 |
| [values0](values0.html) | `fun values0(t: `[`T`](index.html#T)`): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`U`](index.html#U)`, `[`V`](index.html#V)`?>`<br>按键[T](../-i-map2-d/index.html#T)查找 |
| [values1](values1.html) | `fun values1(u: `[`U`](index.html#U)`): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`T`](index.html#T)`, `[`V`](index.html#V)`?>`<br>按键[U](../-i-map2-d/index.html#U)查找 |

### Inherited Functions

| [containsKey0](../-i-map2-d/contains-key0.html) | `open fun containsKey0(key: `[`T`](../-i-map2-d/index.html#T)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>判断是否包含某个键[T](../-i-map2-d/index.html#T) |
| [containsKey1](../-i-map2-d/contains-key1.html) | `open fun containsKey1(key: `[`U`](../-i-map2-d/index.html#U)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>判断是否包含某个键[U](../-i-map2-d/index.html#U) |

### Extension Functions

| [cast](../../org.mechdancer.common.extension/kotlin.-any/cast.html) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.cast(): `[`T`](../../org.mechdancer.common.extension/kotlin.-any/cast.html#T)<br>Casts [this](../../org.mechdancer.common.extension/kotlin.-any/cast/-this-.html) to the class represented by type parameter [T](../../org.mechdancer.common.extension/kotlin.-any/cast.html#T). Throws an exception if the value is `null` or if it is not an instance of [T](../../org.mechdancer.common.extension/kotlin.-any/cast.html#T). |
| [fillBy](../fill-by.html) | `fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<`[`T`](../fill-by.html#T)`, `[`U`](../fill-by.html#U)`, `[`V`](../fill-by.html#V)`>.fillBy(block: (`[`T`](../fill-by.html#T)`, `[`U`](../fill-by.html#U)`) -> `[`V`](../fill-by.html#V)`): `[`ICompleteMap2D`](../-i-complete-map2-d/index.html)`<`[`T`](../fill-by.html#T)`, `[`U`](../fill-by.html#U)`, `[`V`](../fill-by.html#V)`>`<br>转不可变二维映射 |
| [mapValue](../map-value.html) | `fun <T, U, V, V1> `[`IMap2D`](../-i-map2-d/index.html)`<`[`T`](../map-value.html#T)`, `[`U`](../map-value.html#U)`, `[`V`](../map-value.html#V)`>.mapValue(block: (`[`V`](../map-value.html#V)`) -> `[`V1`](../map-value.html#V1)`): `[`IMap2D`](../-i-map2-d/index.html)`<`[`T`](../map-value.html#T)`, `[`U`](../map-value.html#U)`, `[`V1`](../map-value.html#V1)`>`<br>值映射到另一表 |
| [safeCast](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.safeCast(): `[`T`](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T)`?`<br>Casts [this](../../org.mechdancer.common.extension/kotlin.-any/safe-cast/-this-.html) to the class represented by type parameter [T](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T). Returns `null` if the value is `null` or if it is not an instance of [T](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T). |
| [toMap2D](../to-map2-d.html) | `fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<`[`T`](../to-map2-d.html#T)`, `[`U`](../to-map2-d.html#U)`, `[`V`](../to-map2-d.html#V)`>.toMap2D(): `[`IMap2D`](../-i-map2-d/index.html)`<`[`T`](../to-map2-d.html#T)`, `[`U`](../to-map2-d.html#U)`, `[`V`](../to-map2-d.html#V)`>`<br>转不可变二维映射 |
| [toMutableMap2D](../to-mutable-map2-d.html) | `fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<`[`T`](../to-mutable-map2-d.html#T)`, `[`U`](../to-mutable-map2-d.html#U)`, `[`V`](../to-mutable-map2-d.html#V)`>.toMutableMap2D(): `[`IMutableMap2D`](../-i-mutable-map2-d/index.html)`<`[`T`](../to-mutable-map2-d.html#T)`, `[`U`](../to-mutable-map2-d.html#U)`, `[`V`](../to-mutable-map2-d.html#V)`>`<br>转不可变二维映射 |
| [viewBy](../view-by.html) | `fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<`[`T`](../view-by.html#T)`, `[`U`](../view-by.html#U)`, `[`V`](../view-by.html#V)`>.viewBy(f0: (`[`T`](../view-by.html#T)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f1: (`[`U`](../view-by.html#U)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f2: (`[`V`](../view-by.html#V)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>通用转字符串 |
| [viewDefault](../view-default.html) | `fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<`[`T`](../view-default.html#T)`, `[`U`](../view-default.html#U)`, `[`V`](../view-default.html#V)`>.viewDefault(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>通用转字符串 |

