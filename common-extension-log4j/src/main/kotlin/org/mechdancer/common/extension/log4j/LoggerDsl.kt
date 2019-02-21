package org.mechdancer.common.extension.log4j

import org.apache.log4j.*

/**
 * DSL supports creation of instance of type [org.apache.log4j.Logger].
 * 为创建 [org.apache.log4j.Logger] 提供 DSL 支持。
 */
class LoggerDsl {
    private var appenders = mutableListOf<(Logger) -> Appender>()

    /**
     * Get or set the minimum level of a logger
     *
     * 读取或设置日志的最低级别
     */
    var level: Level = Level.ALL

    /**
     * Config that the log will be written to the console with [layout]
     *
     * 配置日志按 [layout] 输出到控制台
     */
    fun console(layout: Layout = pattern()) {
        with(appenders) {
            removeAll { it is ConsoleAppender }
            add { ConsoleAppender(layout) }
        }
    }

    /**
     * Config that the log will be written to the console with [layout]，
     * and it will flush every [period] bytes to avoid excessive performance loss
     *
     * 配置日志按 [layout] 输出到文件，且每 [period] 字节刷新一次以避免过度损耗性能
     */
    fun file(period: Int = 0x100000, layout: Layout = pattern()) {
        println(currentLogPath)
        appenders.add {
            if (period <= 0)
                FileAppender(layout, "$currentLogPath\\${it.name}", false, false, 0)
            else
                FileAppender(layout, "$currentLogPath\\${it.name}", false, true, period)
        }
    }

    // 构造包装器
    @PublishedApi
    internal val wrapper
        get() = { origin: Logger ->
            val result = LogManager.getLogger(origin.name)
            result.level = level

            appenders
                .takeIf(Iterable<*>::any)
                ?.forEach { result.addAppender(it(origin)) }
            ?: ConsoleAppender(pattern())
                .let(result::addAppender)
        }

    // 直接构造日志
    @PublishedApi
    internal fun build(name: String) =
        LogManager
            .getLogger(name)
            .also(wrapper)
}
