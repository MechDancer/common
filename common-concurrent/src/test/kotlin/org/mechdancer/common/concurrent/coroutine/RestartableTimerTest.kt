package org.mechdancer.common.concurrent.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Test

class RestartableTimerTest {
    @Test
    fun test() = runBlocking {
        val timer = RestartableTimer()

        timer.use {
            var time = System.currentTimeMillis()
            for (i in 0..40) {
                it(1000) {
                    val now = System.currentTimeMillis()
                    val temp = now - time
                    time = now
                    println(temp)
                }
                delay(500)
            }
            delay(5500)
        }
    }
}
