---
title: RunOnce - common
---

[common](../../index.html) / [org.mechdancer.common.concurrent](../index.html) / [RunOnce](./index.html)

# RunOnce

`class RunOnce<T, R> : (T) -> R?`

计算一次

### Parameters

`strictOnce` - 严格一次。若为真，即使第一次计算失败产生异常也不再计算

`action` - 计算方法

### Constructors

| [&lt;init&gt;](-init-.html) | 计算一次`RunOnce(strictOnce: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, action: (T) -> R)` |

### Properties

| [value](value.html) | 获取计算得到的值`val value: R?` |

### Functions

| [invoke](invoke.html) | 进行一次计算`fun invoke(p: T): R?` |

