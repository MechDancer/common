package org.mechdancer.common.concurrent

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.async
import kotlinx.coroutines.withTimeoutOrNull

/**
 * 反复调用 [block]，直到返回值不为空或超时
 */
inline fun <T : Any> repeatWithTimeout(
    timeout: Long,
    block: () -> T?
): T? {
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
suspend inline fun <T : Any> runBlokingWithTimeout(
    timeout: Long,
    crossinline block: () -> T
): T? =
    timeout.takeIf { it > 0 }?.let {
        val differed = GlobalScope.async { block() }
        withTimeoutOrNull(it) { differed.await() }
    }
