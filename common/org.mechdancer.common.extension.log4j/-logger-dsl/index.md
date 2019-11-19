---
title: LoggerDsl - common
---

[common](../../index.html) / [org.mechdancer.common.extension.log4j](../index.html) / [LoggerDsl](./index.html)

# LoggerDsl

`class LoggerDsl`

DSL supports creation of instance of type [org.apache.log4j.Logger](#).
为创建 [org.apache.log4j.Logger](#) 提供 DSL 支持。

### Constructors

| [&lt;init&gt;](-init-.html) | DSL supports creation of instance of type [org.apache.log4j.Logger](#). 为创建 [org.apache.log4j.Logger](#) 提供 DSL 支持。`LoggerDsl()` |

### Properties

| [level](level.html) | Get or set the minimum level of a logger`var level: Level` |

### Functions

| [console](console.html) | Config that the log will be written to the console with [layout](console.html#org.mechdancer.common.extension.log4j.LoggerDsl$console(org.apache.log4j.Layout)/layout)`fun console(layout: Layout = pattern()): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [file](file.html) | Config that the log will be written to the console with [layout](file.html#org.mechdancer.common.extension.log4j.LoggerDsl$file(kotlin.Int, org.apache.log4j.Layout)/layout)， and it will flush every [period](file.html#org.mechdancer.common.extension.log4j.LoggerDsl$file(kotlin.Int, org.apache.log4j.Layout)/period) bytes to avoid excessive performance loss`fun file(period: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0x100000, layout: Layout = pattern()): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Extension Functions

| [console](../console.html) | 对标准格式附加信息并输出到控制台`fun `[`LoggerDsl`](./index.html)`.console(vararg info: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [file](../file.html) | 对标准格式附加信息并输出到文件`fun `[`LoggerDsl`](./index.html)`.file(period: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0x100000, vararg info: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

