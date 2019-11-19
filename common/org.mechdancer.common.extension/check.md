---
title: check - common
---

[common](../index.html) / [org.mechdancer.common.extension](index.html) / [check](./check.html)

# check

`inline fun <T> T.check(predicate: (T) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Optional`](-optional/index.html)`<T>`

Returns an instance of [Optional](-optional/index.html) encapsulated [this](check/-this-.html) if it satisfies the given [predicate](check.html#org.mechdancer.common.extension$check(org.mechdancer.common.extension.check.T, kotlin.Function1((org.mechdancer.common.extension.check.T, kotlin.Boolean)))/predicate)
or an instance of [Optional](-optional/index.html) represented `void`, if it doesn't.

如果 [this](check/-this-.html) 满足给定的 [predicate](check.html#org.mechdancer.common.extension$check(org.mechdancer.common.extension.check.T, kotlin.Function1((org.mechdancer.common.extension.check.T, kotlin.Boolean)))/predicate) 则返回一个封装了 [this](check/-this-.html) 的 [Optional](-optional/index.html) 实例，
否则返回代表`空`的 [Optional](-optional/index.html) 实例。

