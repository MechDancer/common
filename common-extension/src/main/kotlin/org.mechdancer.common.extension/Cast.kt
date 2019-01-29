package org.mechdancer.common.extension

inline fun <reified T> Any?.cast() = this as T
inline fun <reified T> Any?.safeCast() = this as? T
