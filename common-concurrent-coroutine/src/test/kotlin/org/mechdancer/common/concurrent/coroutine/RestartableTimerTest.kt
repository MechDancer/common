package org.mechdancer.common.concurrent.coroutine

import org.junit.Test

class RestartableTimerTest {
    @Test
    fun test() {
        val timer = RestartableTimer()
        val list = mutableListOf<Long>()

        timer.use {
            var time = System.currentTimeMillis()
            for (i in 0..10) {
                it(1000) { time = System.currentTimeMillis().also { list += it - time }; }
                Thread.sleep(100)
            }
            Thread.sleep(5500)
        }

        list.forEach(::println)
//        infix fun Long.about(expectation: Long) = abs(this - expectation) < 20
//
//        Assert.assertTrue(
//            list.dropWhile { !(it about 100) }
//                .dropLastWhile { !(it about 100) }
//                .all { it about 100 })
//
//        Assert.assertTrue(
//            list.takeLast(5)
//                .all { it about 1000 })
    }
}
