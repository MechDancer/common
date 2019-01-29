package org.mechdancer.common.concurrent

import org.mechdancer.common.extension.otherwise
import org.mechdancer.common.extension.then

class CallOnce internal constructor(
    private val failedOnException: Boolean,
    private val block: () -> Unit
) : () -> Unit {

    @Volatile
    var isCalled = false
        private set

    override fun invoke() {
        synchronized(this) {
            isCalled.otherwise {
                try {
                    block()
                    isCalled = true
                } catch (e: Exception) {
                    failedOnException.then { isCalled = false }
                    throw e
                }
            }
        }
    }
}

fun callOnce(failedOnException: Boolean = false,
             block: () -> Unit): () -> Unit = CallOnce(failedOnException, block)
