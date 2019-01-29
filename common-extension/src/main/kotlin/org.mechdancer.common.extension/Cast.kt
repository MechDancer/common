package org.mechdancer.common.extension

/**
 * Casts [this] to the class represented by type parameter [T].
 * Throws an exception if the value is `null` or if it is not an instance of [T].
 */
inline fun <reified T> Any?.cast() = this as T

/**
 * Casts [this] to the class represented by type parameter [T].
 * Returns `null` if the value is `null` or if it is not an instance of [T].
 */
inline fun <reified T> Any?.safeCast() = this as? T
