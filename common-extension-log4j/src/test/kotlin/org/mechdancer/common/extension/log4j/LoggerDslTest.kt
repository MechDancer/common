package org.mechdancer.common.extension.log4j

import org.apache.log4j.Level
import org.junit.Test

class LogTest {
    /** 定义并使用日志器 */
    @Test
    fun test1() {
        val logger = logger("log test") {
            level = Level.ALL
            console(Locate)
            file()
        }

        with(logger) {
            "1".let(::trace)
            "2".let(::debug)
            "3".let(::info)
            "4".let(::warn)
            "5".let(::error)
        }
    }

    /** 重复定义多次同名日志时，行为是不正确的 */
    @Test
    fun test2() {
        run {
            val logger = logger("log test") {
                level = Level.ALL
                console(Locate)
                file()
            }

            with(logger) {
                "1".let(::trace)
                "2".let(::debug)
                "3".let(::info)
                "4".let(::warn)
                "5".let(::error)
            }
        }

        run {
            val logger = logger("log test") {
                level = Level.ALL
                console(Locate)
                file()
            }

            with(logger) {
                "6".let(::trace)
                "7".let(::debug)
                "8".let(::info)
                "9".let(::warn)
                "0".let(::error)
            }
        }
    }

    /** 获取，而不是定义，则行为是正确的 */
    @Test
    fun test3() {
        run {
            val logger = logger("log test") {
                level = Level.ALL
                console(Locate)
                file()
            }

            with(logger) {
                "1".let(::trace)
                "2".let(::debug)
                "3".let(::info)
                "4".let(::warn)
                "5".let(::error)
            }
        }

        run {
            val logger = logger("log test")
            with(logger) {
                "6".let(::trace)
                "7".let(::debug)
                "8".let(::info)
                "9".let(::warn)
                "0".let(::error)
            }
        }
    }
}
