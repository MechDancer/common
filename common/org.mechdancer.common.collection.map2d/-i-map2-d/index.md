---
title: IMap2D - common
---

[common](../../index.html) / [org.mechdancer.common.collection.map2d](../index.html) / [IMap2D](./index.html)

# IMap2D

`interface IMap2D<T, U, V>`

二维映射

### Parameters

`T` - 第一种键类型

`U` - 第二种键类型

`V` - 值类型

### Properties

| [keys0](keys0.html) | 获取键[T](index.html#T)集合`abstract val keys0: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<T>` |
| [keys1](keys1.html) | 获取键[U](index.html#U)集合`abstract val keys1: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<U>` |

### Functions

| [containsKey0](contains-key0.html) | 判断是否包含某个键[T](index.html#T)`open fun containsKey0(key: T): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [containsKey1](contains-key1.html) | 判断是否包含某个键[U](index.html#U)`open fun containsKey1(key: U): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [get](get.html) | 获取值`abstract operator fun get(t: T, u: U): V?` |
| [toPairMap](to-pair-map.html) | 转键对映射`abstract fun toPairMap(): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<T, U>, V>` |
| [values0](values0.html) | 按键[T](index.html#T)查找`abstract fun values0(t: T): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<U, V?>` |
| [values1](values1.html) | 按键[U](index.html#U)查找`abstract fun values1(u: U): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<T, V?>` |

### Extension Functions

| [fillBy](../fill-by.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](./index.html)`<T, U, V>.fillBy(block: (T, U) -> V): `[`ICompleteMap2D`](../-i-complete-map2-d/index.html)`<T, U, V>` |
| [mapValue](../map-value.html) | 值映射到另一表`fun <T, U, V, V1> `[`IMap2D`](./index.html)`<T, U, V>.mapValue(block: (V) -> V1): `[`IMap2D`](./index.html)`<T, U, V1>` |
| [toMap2D](../to-map2-d.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](./index.html)`<T, U, V>.toMap2D(): `[`IMap2D`](./index.html)`<T, U, V>` |
| [toMutableMap2D](../to-mutable-map2-d.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](./index.html)`<T, U, V>.toMutableMap2D(): `[`IMutableMap2D`](../-i-mutable-map2-d/index.html)`<T, U, V>` |
| [view](../view.html) | 通用转字符串`fun <T, U, V> `[`IMap2D`](./index.html)`<T, U, V>.view(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [viewBy](../view-by.html) | 通用转字符串`fun <T, U, V> `[`IMap2D`](./index.html)`<T, U, V>.viewBy(f0: (T) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f1: (U) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f2: (V) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Inheritors

| [ICompleteMap2D](../-i-complete-map2-d/index.html) | 完全二维映射 通过固定映射函数保证表填满`interface ICompleteMap2D<T, U, V> : `[`IMap2D`](./index.html)`<T, U, V>` |
| [ICompleteSymmetricMap2D](../-i-complete-symmetric-map2-d/index.html) | 自动填充对称二维映射 保证表是填满的正方形`interface ICompleteSymmetricMap2D<T, V> : `[`IMap2D`](./index.html)`<T, T, V>` |
| [IMutableMap2D](../-i-mutable-map2-d/index.html) | 可变二维映射`interface IMutableMap2D<T, U, V> : `[`IMap2D`](./index.html)`<T, U, V>` |
| [PairMap2D](../-pair-map2-d/index.html) | 二维映射`class PairMap2D<T, U, V> : `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<T, U>, V>, `[`IMap2D`](./index.html)`<T, U, V>` |

