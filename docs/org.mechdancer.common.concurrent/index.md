---
title: org.mechdancer.common.concurrent - 
---

[org.mechdancer.common.concurrent](./index.html)

## Package org.mechdancer.common.concurrent

### Types

| [RestartableTimer](-restartable-timer/index.html) | `class RestartableTimer : `[`Closeable`](http://docs.oracle.com/javase/6/docs/api/java/io/Closeable.html)<br>可重启定时器 |
| [RunOnce](-run-once/index.html) | `class RunOnce<T, R> : (`[`T`](-run-once/index.html#T)`) -> `[`R`](-run-once/index.html#R)`?`<br>计算一次 |

### Functions

| [restartableTimer](restartable-timer.html) | `fun <ERROR CLASS>.restartableTimer(period: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, block: suspend () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): <ERROR CLASS>`<br>在协程作用域开启一个 [RestartableTimer](-restartable-timer/index.html) |
| [withTimeout](with-timeout.html) | `fun withTimeout(timeout: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, block: () -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>`suspend fun withTimeout(timeout: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, block: suspend () -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

