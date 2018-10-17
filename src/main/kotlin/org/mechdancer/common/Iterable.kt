package org.mechdancer.common

inline fun <T, R> with(vararg iterables: Iterable<T>,
                       block: Iterable<T>.() -> R): R =
		iterables.toList().flatten().run(block)

infix fun <T> Iterable<T>.with(iterable: Iterable<T>) =
		(iterable + this).asIterable()