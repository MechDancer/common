---
title: repeatWithTimeout - common
---

[common](../index.html) / [org.mechdancer.common.concurrent](index.html) / [repeatWithTimeout](./repeat-with-timeout.html)

# repeatWithTimeout

`inline fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> repeatWithTimeout(timeout: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, block: () -> T?): T?`

反复调用 [block](repeat-with-timeout.html#org.mechdancer.common.concurrent$repeatWithTimeout(kotlin.Long, kotlin.Function0((org.mechdancer.common.concurrent.repeatWithTimeout.T)))/block)，直到返回值不为空或超时

