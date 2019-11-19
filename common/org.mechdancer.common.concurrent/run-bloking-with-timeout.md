---
title: runBlokingWithTimeout - common
---

[common](../index.html) / [org.mechdancer.common.concurrent](index.html) / [runBlokingWithTimeout](./run-bloking-with-timeout.html)

# runBlokingWithTimeout

`suspend inline fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> runBlokingWithTimeout(timeout: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, crossinline block: () -> T): T?`

安全的超时

不会因为在 [block](run-bloking-with-timeout.html#org.mechdancer.common.concurrent$runBlokingWithTimeout(kotlin.Long, kotlin.Function0((org.mechdancer.common.concurrent.runBlokingWithTimeout.T)))/block) 内阻塞**线程**而失效，也不产生 [TimeoutCancellationException](#)，
未能计算出的值用 `null` 表示

