package org.mechdancer.common.extension.log4j

import org.apache.log4j.Level
import org.junit.Test
import org.slf4j.LoggerFactory

class LoggerDslTest {
    @Test
    fun test1() {
        val logger = logger("hello") {
            level = Level.ALL
            console(Locate)
        }

        with(logger) {
            "1".let(::trace)
            "2".let(::debug)
            "3".let(::info)
            "4".let(::warn)
            "5".let(::error)
        }
    }

    @Test
    fun test2() {
        val wapper = loggerWapper {
            level = Level.ALL
            console(Locate)
        }

        with(LoggerFactory.getLogger("hello")) {
            wapper(this)
            "1".let(::trace)
            "2".let(::debug)
            "3".let(::info)
            "4".let(::warn)
            "5".let(::error)
        }
    }
}
