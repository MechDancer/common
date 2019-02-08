package org.mechdancer.common.extension

/**
 * Casts [this] to the class represented by type parameter [T].
 * Throws an exception if the value is `null` or if it is not an instance of [T].
 *
 * 将一个实例转换到 [T] 表示的类型，其不是 [T] 实例或为 `null` 则抛出异常。
 */
inline fun <reified T> Any?.cast() = this as T

/**
 * Casts [this] to the class represented by type parameter [T].
 * Returns `null` if the value is `null` or if it is not an instance of [T].
 *
 * 将一个实例转换到 [T] 表示的类型，其不是 [T] 实例或为 `null` 则返回 `null`。
 */
inline fun <reified T> Any?.safeCast() = this as? T

/**
 * If [this] is `null`, use [value] instead.
 *
 * 如果 [this] 为 `null` 就用 [value] 替换它。
 */
fun <T> T.orDefault(value: T): T = this ?: value
