package org.mechdancer.common.extension.log4j

import org.apache.log4j.*
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class LoggerDsl {
    private var appenders = mutableListOf<(Logger) -> Appender>()
    var level = Level.ALL

    fun console(layout: Layout = pattern()) {
        appenders.add { ConsoleAppender(layout) }
    }

    fun file(period: Int = 0x100000, layout: Layout = pattern()) {
        appenders.add { FileAppender(layout, "$currentLogPath\\${it.name}", false, true, period) }
    }

    internal val wapper
        get() = { origin: Logger ->
            val result = LogManager.getLogger(origin.name)
            result.level = level

            appenders
                .takeIf(Iterable<*>::any)
                ?.forEach { result.addAppender(it(origin)) }
            ?: ConsoleAppender(pattern())
                .let(result::addAppender)
        }

    internal fun build(name: String) =
        LoggerFactory.getLogger(name).also(wapper)
}
