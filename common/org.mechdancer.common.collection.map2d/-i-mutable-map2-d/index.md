---
title: IMutableMap2D - common
---

[common](../../index.html) / [org.mechdancer.common.collection.map2d](../index.html) / [IMutableMap2D](./index.html)

# IMutableMap2D

`interface IMutableMap2D<T, U, V> : `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>`

可变二维映射

### Functions

| [put](put.html) | 添加样点 (t, u) -&gt; v`abstract fun put(t: T, u: U, v: V): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [put0](put0.html) | 添加键[T](index.html#T)`abstract fun put0(t: T, block: (T, U) -> V): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [put1](put1.html) | 添加键[U](index.html#U)`abstract fun put1(u: U, block: (T, U) -> V): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [putAll0](put-all0.html) | 添加一组键[T](index.html#T)`abstract fun putAll0(t: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>, block: (T, U) -> V): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [putAll1](put-all1.html) | 添加一组键[U](index.html#U)`abstract fun putAll1(u: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<U>, block: (T, U) -> V): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [remove0](remove0.html) | 移除键[T](index.html#T)`abstract fun remove0(t: T): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [remove1](remove1.html) | 移除键[U](index.html#U)`abstract fun remove1(u: U): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [removeAll0](remove-all0.html) | 移除一组键[T](index.html#T)`abstract fun removeAll0(t: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [removeAll1](remove-all1.html) | 移除一组键[U](index.html#U)`abstract fun removeAll1(u: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<U>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Extension Functions

| [fillBy](../fill-by.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.fillBy(block: (T, U) -> V): `[`ICompleteMap2D`](../-i-complete-map2-d/index.html)`<T, U, V>` |
| [mapValue](../map-value.html) | 值映射到另一表`fun <T, U, V, V1> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.mapValue(block: (V) -> V1): `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V1>` |
| [set](../set.html) | 添加或修改表项`operator fun <T, U, V> `[`IMutableMap2D`](./index.html)`<T, U, V>.set(t: T, u: U, v: V): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [toMap2D](../to-map2-d.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.toMap2D(): `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>` |
| [toMutableMap2D](../to-mutable-map2-d.html) | 转不可变二维映射`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.toMutableMap2D(): `[`IMutableMap2D`](./index.html)`<T, U, V>` |
| [view](../view.html) | 通用转字符串`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.view(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [viewBy](../view-by.html) | 通用转字符串`fun <T, U, V> `[`IMap2D`](../-i-map2-d/index.html)`<T, U, V>.viewBy(f0: (T) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f1: (U) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, f2: (V) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Inheritors

| [MutablePairMap2D](../-mutable-pair-map2-d/index.html) | 可变二维映射`class MutablePairMap2D<T, U, V> : `[`IMutableMap2D`](./index.html)`<T, U, V>` |

