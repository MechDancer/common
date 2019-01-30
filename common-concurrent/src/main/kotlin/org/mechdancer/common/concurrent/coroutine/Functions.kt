package org.mechdancer.common.concurrent.coroutine

import kotlinx.coroutines.CoroutineScope

fun CoroutineScope.restartableTimer(
    period: Long,
    block: suspend () -> Unit
) = RestartableTimer(this)(period, block)

