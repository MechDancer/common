package org.mechdancer.common.extension.log4j

/** 对标准格式附加信息并输出到控制台 */
fun LoggerDsl.console(vararg info: String) =
    console(pattern(*info))

/** 对标准格式附加信息并输出到文件 */
fun LoggerDsl.file(period: Int = 0x100000, vararg info: String) =
    file(period, pattern(*info))

/** 构造日志器 */
fun logger(name: String, block: LoggerDsl.() -> Unit) =
    LoggerDsl()
        .apply(block)
        .build(name)

/** 构造日志修饰器 */
fun loggerWapper(block: LoggerDsl.() -> Unit) =
    LoggerDsl()
        .apply(block)
        .wapper
