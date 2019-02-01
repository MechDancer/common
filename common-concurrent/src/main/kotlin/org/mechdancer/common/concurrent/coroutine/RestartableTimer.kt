package org.mechdancer.common.concurrent.coroutine

import kotlinx.coroutines.*
import java.io.Closeable
import java.util.concurrent.atomic.AtomicReference

/**
 * 可重启定时器
 */
class RestartableTimer(
    private val scope: CoroutineScope = GlobalScope
) : Closeable {
    private val job = AtomicReference<Job?>(null)

    /**
     * 判断是否正在运行
     */
    val running get() = job.get()?.isCancelled == false

    /**
     * 立即调度一次 [block]，并按照新的 [period] 定时反复调度 [block]
     */
    operator fun invoke(
        period: Long,
        block: suspend () -> Unit
    ) {
        job.getAndUpdate { last ->
            last?.cancel()
            scope.launch {
                while (true) {
                    block()
                    delay(period)
                }
            }
        }
    }

    /**
     * 停止调度
     */
    override fun close() {
        job.getAndUpdate { last ->
            last?.cancel()
            null
        }
    }
}


