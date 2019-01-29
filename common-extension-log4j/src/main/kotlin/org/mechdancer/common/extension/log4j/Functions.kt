package org.mechdancer.common.extension.log4j

import org.apache.log4j.ConsoleAppender
import org.apache.log4j.FileAppender
import org.apache.log4j.Layout
import org.apache.log4j.LogManager
import org.slf4j.Logger

/** 在log4j中获取日志器 */
val Logger.underlying: org.apache.log4j.Logger
    get() = LogManager.getLogger(name)

/** 设置日志输出到控制台 */
fun Logger.toConsole(layout: Layout = DefaultLayout) =
    underlying.addAppender(ConsoleAppender(layout))

/** 设置日志输出到文件 */
fun Logger.toFile(
    layout: Layout = DefaultLayout,
    period: Int = 0x100000
) = underlying.addAppender(
    FileAppender(layout, "$currentLogPath\\$name", false, true, period))

/** 读取/设置日志级别 */
var Logger.level
    get() = underlying.level!!
    set(value) {
        underlying.level = value
    }
