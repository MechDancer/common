---
title: LoggerDsl.file - common
---

[common](../../index.html) / [org.mechdancer.common.extension.log4j](../index.html) / [LoggerDsl](index.html) / [file](./file.html)

# file

`fun file(period: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0x100000, layout: Layout = pattern()): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Config that the log will be written to the console with [layout](file.html#org.mechdancer.common.extension.log4j.LoggerDsl$file(kotlin.Int, org.apache.log4j.Layout)/layout)，
and it will flush every [period](file.html#org.mechdancer.common.extension.log4j.LoggerDsl$file(kotlin.Int, org.apache.log4j.Layout)/period) bytes to avoid excessive performance loss

配置日志按 [layout](file.html#org.mechdancer.common.extension.log4j.LoggerDsl$file(kotlin.Int, org.apache.log4j.Layout)/layout) 输出到文件，且每 [period](file.html#org.mechdancer.common.extension.log4j.LoggerDsl$file(kotlin.Int, org.apache.log4j.Layout)/period) 字节刷新一次以避免过度损耗性能

