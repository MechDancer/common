package org.mechdancer.common.concurrent

import org.mechdancer.common.extension.otherwise

@Suppress("FunctionName")
fun <R> CallOnce(
    strictOnce: Boolean = false,
    action: () -> R
) = object : () -> R? {
    @Volatile
    var isCalled = false
        private set

    override fun invoke(): R? =
        synchronized(this) {
            if (!isCalled)
                runCatching { action() }
                    .onSuccess { isCalled = true }
                    .onFailure { strictOnce.otherwise { isCalled = false } }
                    .getOrThrow()
            else
                null

        }
}
