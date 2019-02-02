package org.mechdancer.common.concurrent

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

fun withTimeout(timeout: Long, block: () -> Boolean): Boolean {
    if (timeout <= 0L) throw IllegalArgumentException("Timed out immediately")
    val start = System.currentTimeMillis()
    var result = false
    while (System.currentTimeMillis() - start < timeout
        && !block().also { result = it }
    );
    return result
}

suspend fun withTimeout(timeout: Long, block: suspend () -> Boolean): Boolean {
    var job: Job? = null
    kotlinx.coroutines.withTimeout(timeout) {
        job = GlobalScope.launch(Dispatchers.Default) {
            block()
        }
        job?.join()
    }
    job!!.cancel()
    return job!!.isCompleted
}