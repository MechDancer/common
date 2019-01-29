package org.mechdancer.common.extension

@Suppress("NON_PUBLIC_PRIMARY_CONSTRUCTOR_OF_INLINE_CLASS")
inline class Optional<out T>
@PublishedApi internal constructor(@PublishedApi internal val data: Any?) {
    object Otherwise

    inline fun then(block: (T) -> Any?) =
        also { if (data !is Otherwise) block(data as T) }

    inline fun otherwise(block: () -> Any?) =
        also { if (data is Otherwise) block() }

    fun getOrNull(): T? =
        if (data !is Otherwise) data as T else null

    inline fun <reified U, T : U> getOrElse(`else`: U): U =
        (getOrNull() ?: `else`) as U
}
