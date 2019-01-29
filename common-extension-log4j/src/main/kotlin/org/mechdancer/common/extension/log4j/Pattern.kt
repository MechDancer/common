package org.mechdancer.common.extension.log4j

import org.apache.log4j.PatternLayout

// 日志模板组件
const val PatternHeader = "[%p]\t%d{HH:mm:ss:SSS}"
const val Message = "%m"
const val Stamp = "%r"
const val Locate = "%l"

/** 构造一个模式 */
fun pattern(vararg topics: String) =
    PatternLayout("$PatternHeader\t${topics.joinToString("\t")}%n")

/** 默认模式 */
internal val DefaultLayout = pattern(Message)
