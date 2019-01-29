package org.mechdancer.common.extension

/**
 * Performs the given [action] if [this] equals `true`.
 */
fun Boolean.then(action: () -> Unit) = also { if (it) action() }

/**Performs the given [action] if [this] equals `false`.*/
fun Boolean.otherwise(action: () -> Unit) = also { if (!it) action() }

/**
 * Returns an instance that encapsulates the given [this] as [Optional].
 */
fun <T> T.toOptional() =
    Optional<T>(this)

/**
 * Returns [this] value if it satisfies the given [predicate] or `Void`, if it doesn't.
 */
inline fun <T> T.check(predicate: (T) -> Boolean) =
    if (predicate(this)) Optional<T>(this) else Optional.otherwise()
