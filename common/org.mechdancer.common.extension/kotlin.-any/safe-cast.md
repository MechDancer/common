---
title: safeCast - common
---

[common](../../index.html) / [org.mechdancer.common.extension](../index.html) / [kotlin.Any](index.html) / [safeCast](./safe-cast.html)

# safeCast

`fun <reified T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.safeCast(): T?`

Casts [this](safe-cast/-this-.html) to the class represented by type parameter [T](safe-cast.html#T).
Returns `null` if the value is `null` or if it is not an instance of [T](safe-cast.html#T).

将一个实例转换到 [T](safe-cast.html#T) 表示的类型，其不是 [T](safe-cast.html#T) 实例或为 `null` 则返回 `null`。

