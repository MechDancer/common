package org.mechdancer.common.concurrent

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.async
import kotlinx.coroutines.withTimeout

/**
 * 反复调用 [block]，直到返回值不为空或超时
 */
inline fun <T : Any> repeatWithTimeout(timeout: Long, block: () -> T?): T? {
    val start = System.currentTimeMillis()
    while (System.currentTimeMillis() - start < timeout)
        return block() ?: continue
    return null
}

/**
 * 安全的超时
 *
 * 不会因为在 [block] 内阻塞**线程**而失效，也不产生 [TimeoutCancellationException]，
 * 未能计算出的值用 `null` 表示
 */
suspend fun <T : Any> runWithTimeout(timeout: Long, block: suspend () -> T): T? {
    if (timeout <= 0) return null
    val deferred = GlobalScope.async { block() }
    return try {
        withTimeout(timeout) { deferred.await() }
    } catch (e: TimeoutCancellationException) {
        null
    }
}
