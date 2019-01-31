---
title: RunOnce.<init> - 
---

[org.mechdancer.common.concurrent](../index.html) / [RunOnce](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`RunOnce(strictOnce: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, action: (`[`T`](index.html#T)`) -> `[`R`](index.html#R)`)`

计算一次

### Parameters

`strictOnce` - 严格一次。若为真，即使第一次计算失败产生异常也不再计算

`action` - 计算方法