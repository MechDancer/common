---
title: RestartableTimer.invoke - 
---

[org.mechdancer.common.concurrent.coroutine](../index.html) / [RestartableTimer](index.html) / [invoke](./invoke.html)

# invoke

`operator fun invoke(period: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, block: suspend () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

立即调度一次 [block](invoke.html#org.mechdancer.common.concurrent.coroutine.RestartableTimer$invoke(kotlin.Long, kotlin.SuspendFunction0((kotlin.Unit)))/block)，并按照新的 [period](invoke.html#org.mechdancer.common.concurrent.coroutine.RestartableTimer$invoke(kotlin.Long, kotlin.SuspendFunction0((kotlin.Unit)))/period) 定时反复调度 [block](invoke.html#org.mechdancer.common.concurrent.coroutine.RestartableTimer$invoke(kotlin.Long, kotlin.SuspendFunction0((kotlin.Unit)))/block)

