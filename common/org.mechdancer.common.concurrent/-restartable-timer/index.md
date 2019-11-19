---
title: RestartableTimer - common
---

[common](../../index.html) / [org.mechdancer.common.concurrent](../index.html) / [RestartableTimer](./index.html)

# RestartableTimer

`class RestartableTimer : `[`Closeable`](https://docs.oracle.com/javase/6/docs/api/java/io/Closeable.html)

可重启定时器

### Constructors

| [&lt;init&gt;](-init-.html) | 可重启定时器`RestartableTimer(scope: CoroutineScope = GlobalScope)` |

### Properties

| [running](running.html) | 判断是否正在运行`val running: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Functions

| [close](close.html) | 停止调度`fun close(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [invoke](invoke.html) | 立即调度一次 [block](invoke.html#org.mechdancer.common.concurrent.RestartableTimer$invoke(kotlin.Long, kotlin.coroutines.SuspendFunction0((kotlin.Unit)))/block)，并按照新的 [period](invoke.html#org.mechdancer.common.concurrent.RestartableTimer$invoke(kotlin.Long, kotlin.coroutines.SuspendFunction0((kotlin.Unit)))/period) 定时反复调度 [block](invoke.html#org.mechdancer.common.concurrent.RestartableTimer$invoke(kotlin.Long, kotlin.coroutines.SuspendFunction0((kotlin.Unit)))/block)`operator fun invoke(period: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, block: suspend () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

