package org.mechdancer.common.extension

infix fun <T, U> Optional<T>.map(f: (T) -> U) =
    getOrNull()?.run(f)?.toOptional() ?: Optional.otherwise()

infix fun <T, U> Optional<T>.ap(f: Optional<(T) -> U>) =
    getOrNull()?.let { t -> f.getOrNull()?.invoke(t) }?.toOptional() ?: Optional.otherwise()

infix fun <T, U> Optional<T>.flatMap(f: (T) -> Optional<U>) =
    getOrNull()?.let(f) ?: Optional.otherwise()

fun <T> Optional<Optional<T>>.join() = flatMap { it }