---
title: org.mechdancer.common.extension.log4j - 
---

[org.mechdancer.common.extension.log4j](./index.html)

## Package org.mechdancer.common.extension.log4j

### Properties

| [Locate](-locate.html) | `const val Locate: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [Message](-message.html) | `const val Message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [PatternHeader](-pattern-header.html) | `const val PatternHeader: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [Stamp](-stamp.html) | `const val Stamp: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [level](level.html) | `var <ERROR CLASS>.level: <ERROR CLASS>`<br>读取/设置日志级别 |
| [logPath](log-path.html) | `var logPath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>日志路径 只能设置一次 |
| [underlying](underlying.html) | `val <ERROR CLASS>.underlying: <ERROR CLASS>`<br>在log4j中获取日志器 |

### Functions

| [pattern](pattern.html) | `fun pattern(vararg topics: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): <ERROR CLASS>`<br>构造一个模式 |
| [toConsole](to-console.html) | `fun <ERROR CLASS>.toConsole(layout: <ERROR CLASS> = DefaultLayout): <ERROR CLASS>`<br>设置日志输出到控制台 |
| [toFile](to-file.html) | `fun <ERROR CLASS>.toFile(layout: <ERROR CLASS> = DefaultLayout, period: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0x100000): <ERROR CLASS>`<br>设置日志输出到文件 |

