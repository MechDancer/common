package org.mechdancer.common.extension

/**
 * Performs the given [action] if [this] equals `true`.
 *
 * 如果 [this] 为`真`则执行给定的 [action]。
 */
inline fun Boolean.then(action: () -> Unit) = also { if (it) action() }

/**
 * Performs the given [action] if [this] equals `false`.
 *
 * 如果 [this] 为`假`则执行给定的 [action]。
 */
inline fun Boolean.otherwise(action: () -> Unit) = also { if (!it) action() }

/**
 * Returns an instance of [Optional] encapsulated [this].
 *
 * 返回一个封装了 [this] 的 [Optional] 实例。
 */
fun <T> T.toOptional() = Optional<T>(this)

/**
 * Returns an instance of [Optional] encapsulated [this] if it satisfies the given [predicate]
 * or an instance of [Optional] represented `void`, if it doesn't.
 *
 * 如果 [this] 满足给定的 [predicate] 则返回一个封装了 [this] 的 [Optional] 实例，
 * 否则返回代表`空`的 [Optional] 实例。
 */
inline fun <T> T.check(predicate: (T) -> Boolean) =
    if (predicate(this)) Optional<T>(this) else Optional.otherwise()
