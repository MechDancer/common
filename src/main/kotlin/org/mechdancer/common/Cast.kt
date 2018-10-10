package org.mechdancer.common

inline fun <reified T> Any?.unsafeCast() = this as T

inline fun <reified T> Any?.safeCast() = this as? T