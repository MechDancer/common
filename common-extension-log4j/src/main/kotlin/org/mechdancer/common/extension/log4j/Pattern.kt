package org.mechdancer.common.extension.log4j

import org.apache.log4j.PatternLayout

// 日志模板组件
const val PatternHeader = "[%p]\t%d{yyyy/MM/dd HH:mm:ss:SSS}"
const val Message = "%m"
const val Stamp = "%r"
const val Locate = "%l"

/** 构造一个模式 */
fun pattern(vararg topics: String) =
    PatternLayout("$PatternHeader\t${topics.joinToString("\t")}\t$Message%n")
