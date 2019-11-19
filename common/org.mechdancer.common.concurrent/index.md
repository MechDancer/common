---
title: org.mechdancer.common.concurrent - common
---

[common](../index.html) / [org.mechdancer.common.concurrent](./index.html)

## Package org.mechdancer.common.concurrent

### Types

| [RestartableTimer](-restartable-timer/index.html) | 可重启定时器`class RestartableTimer : `[`Closeable`](https://docs.oracle.com/javase/6/docs/api/java/io/Closeable.html) |
| [RunOnce](-run-once/index.html) | 计算一次`class RunOnce<T, R> : (T) -> R?` |

### Extensions for External Classes

| [kotlinx.coroutines.CoroutineScope](kotlinx.coroutines.-coroutine-scope/index.html) |  |

### Functions

| [repeatWithTimeout](repeat-with-timeout.html) | 反复调用 [block](repeat-with-timeout.html#org.mechdancer.common.concurrent$repeatWithTimeout(kotlin.Long, kotlin.Function0((org.mechdancer.common.concurrent.repeatWithTimeout.T)))/block)，直到返回值不为空或超时`fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> repeatWithTimeout(timeout: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, block: () -> T?): T?` |
| [runBlokingWithTimeout](run-bloking-with-timeout.html) | 安全的超时`suspend fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> runBlokingWithTimeout(timeout: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, block: () -> T): T?` |

