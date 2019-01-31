---
title: RunOnce - 
---

[org.mechdancer.common.concurrent](../index.html) / [RunOnce](./index.html)

# RunOnce

`class RunOnce<T, R> : (`[`T`](index.html#T)`) -> `[`R`](index.html#R)`?`

计算一次

### Parameters

`strictOnce` - 严格一次。若为真，即使第一次计算失败产生异常也不再计算

`action` - 计算方法

### Constructors

| [&lt;init&gt;](-init-.html) | `RunOnce(strictOnce: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, action: (`[`T`](index.html#T)`) -> `[`R`](index.html#R)`)`<br>计算一次 |

### Properties

| [value](value.html) | `val value: `[`R`](index.html#R)`?`<br>获取计算得到的值 |

### Functions

| [invoke](invoke.html) | `fun invoke(p: `[`T`](index.html#T)`): `[`R`](index.html#R)`?`<br>进行一次计算 |

### Extension Functions

| [cast](../../org.mechdancer.common.extension/kotlin.-any/cast.html) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.cast(): `[`T`](../../org.mechdancer.common.extension/kotlin.-any/cast.html#T)<br>Casts [this](../../org.mechdancer.common.extension/kotlin.-any/cast/-this-.html) to the class represented by type parameter [T](../../org.mechdancer.common.extension/kotlin.-any/cast.html#T). Throws an exception if the value is `null` or if it is not an instance of [T](../../org.mechdancer.common.extension/kotlin.-any/cast.html#T). |
| [safeCast](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.safeCast(): `[`T`](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T)`?`<br>Casts [this](../../org.mechdancer.common.extension/kotlin.-any/safe-cast/-this-.html) to the class represented by type parameter [T](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T). Returns `null` if the value is `null` or if it is not an instance of [T](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T). |

