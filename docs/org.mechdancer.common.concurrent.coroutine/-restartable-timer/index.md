---
title: RestartableTimer - 
---

[org.mechdancer.common.concurrent.coroutine](../index.html) / [RestartableTimer](./index.html)

# RestartableTimer

`class RestartableTimer : `[`Closeable`](http://docs.oracle.com/javase/6/docs/api/java/io/Closeable.html)

可重启定时器

### Constructors

| [&lt;init&gt;](-init-.html) | `RestartableTimer(scope: <ERROR CLASS> = GlobalScope)`<br>可重启定时器 |

### Properties

| [running](running.html) | `val running: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>判断是否正在运行 |

### Functions

| [close](close.html) | `fun close(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>停止调度 |
| [invoke](invoke.html) | `operator fun invoke(period: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, block: suspend () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>立即调度一次 [block](invoke.html#org.mechdancer.common.concurrent.coroutine.RestartableTimer$invoke(kotlin.Long, kotlin.SuspendFunction0((kotlin.Unit)))/block)，并按照新的 [period](invoke.html#org.mechdancer.common.concurrent.coroutine.RestartableTimer$invoke(kotlin.Long, kotlin.SuspendFunction0((kotlin.Unit)))/period) 定时反复调度 [block](invoke.html#org.mechdancer.common.concurrent.coroutine.RestartableTimer$invoke(kotlin.Long, kotlin.SuspendFunction0((kotlin.Unit)))/block) |

### Extension Functions

| [cast](../../org.mechdancer.common.extension/kotlin.-any/cast.html) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.cast(): `[`T`](../../org.mechdancer.common.extension/kotlin.-any/cast.html#T)<br>Casts [this](../../org.mechdancer.common.extension/kotlin.-any/cast/-this-.html) to the class represented by type parameter [T](../../org.mechdancer.common.extension/kotlin.-any/cast.html#T). Throws an exception if the value is `null` or if it is not an instance of [T](../../org.mechdancer.common.extension/kotlin.-any/cast.html#T). |
| [safeCast](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.safeCast(): `[`T`](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T)`?`<br>Casts [this](../../org.mechdancer.common.extension/kotlin.-any/safe-cast/-this-.html) to the class represented by type parameter [T](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T). Returns `null` if the value is `null` or if it is not an instance of [T](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T). |

