package org.mechdancer.common.extension.log4j

import org.apache.log4j.LogManager

/** 对标准格式附加信息并输出到控制台 */
fun LoggerDsl.console(vararg info: String) =
    console(pattern(*info))

/** 对标准格式附加信息并输出到文件 */
fun LoggerDsl.file(period: Int = 0x100000, vararg info: String) =
    file(period, pattern(*info))

/** 构造或获取构造器，不进行任何修饰 */
fun logger(name: String) =
    LogManager.getLogger(name)

/** 构造日志器 */
inline fun logger(name: String, block: LoggerDsl.() -> Unit) =
    LoggerDsl()
        .apply(block)
        .build(name)

/** 构造日志修饰器 */
inline fun loggerWrapper(block: LoggerDsl.() -> Unit) =
    LoggerDsl()
        .apply(block)
        .wrapper
