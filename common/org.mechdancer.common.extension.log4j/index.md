---
title: org.mechdancer.common.extension.log4j - common
---

[common](../index.html) / [org.mechdancer.common.extension.log4j](./index.html)

## Package org.mechdancer.common.extension.log4j

### Types

| [LoggerDsl](-logger-dsl/index.html) | DSL supports creation of instance of type [org.apache.log4j.Logger](#). 为创建 [org.apache.log4j.Logger](#) 提供 DSL 支持。`class LoggerDsl` |

### Properties

| [Locate](-locate.html) | `const val Locate: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [logPath](log-path.html) | 日志路径 只能设置一次`var logPath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [Message](-message.html) | `const val Message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [PatternHeader](-pattern-header.html) | `const val PatternHeader: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [Stamp](-stamp.html) | `const val Stamp: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| [console](console.html) | 对标准格式附加信息并输出到控制台`fun `[`LoggerDsl`](-logger-dsl/index.html)`.console(vararg info: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [file](file.html) | 对标准格式附加信息并输出到文件`fun `[`LoggerDsl`](-logger-dsl/index.html)`.file(period: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0x100000, vararg info: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [logger](logger.html) | 构造或获取构造器，不进行任何修饰`fun logger(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Logger!`<br>构造日志器`fun logger(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, block: `[`LoggerDsl`](-logger-dsl/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): Logger!` |
| [loggerWrapper](logger-wrapper.html) | 构造日志修饰器`fun loggerWrapper(block: `[`LoggerDsl`](-logger-dsl/index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): (Logger) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [pattern](pattern.html) | 构造一个模式`fun pattern(vararg topics: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): PatternLayout` |

