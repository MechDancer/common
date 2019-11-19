package org.mechdancer.common.extension

/**
 * A discriminated union that encapsulates a value of type [T]
 * or void represented by `Void`.
 */
@Suppress("NON_PUBLIC_PRIMARY_CONSTRUCTOR_OF_INLINE_CLASS", "UNCHECKED_CAST")
inline class Optional<out T>
@PublishedApi internal constructor(@PublishedApi internal val data: Any?) {

    @PublishedApi
    internal object Void

    /**
     * Returns `true` if this instance has a value.
     * In this case [nonexistent] returns `false`.
     */
    val existent get() = data !is Void

    /**
     * Returns `true` if this instance has no value.
     * In this case [existent] returns `false`.
     */
    val nonexistent get() = data is Void

    /**
     * Performs the given [action] on encapsulated value if this instance [existent].
     * Returns the original `Optional` unchanged.
     */
    inline fun then(action: (T) -> Any?) =
        also { if (data !is Void) action(data as T) }

    /**
     * Performs the given [action] on encapsulated exception if this instance [nonexistent].
     * Returns the original `Optional` unchanged.
     */
    inline fun otherwise(action: () -> Any?) =
        also { if (data is Void) action() }

    /**
     * Returns the encapsulated value if this instance [existent]
     * or throw an [UnsupportedOperationException] if it is [nonexistent].
     */
    fun get(): T =
        if (data !is Void) data as T
        else throw UnsupportedOperationException("void")

    /**
     * Returns the encapsulated value if this instance [existent]
     * or `null` if it is [nonexistent].
     */
    fun getOrNull(): T? =
        if (data !is Void) data as T
        else null

    /**
     * Returns the encapsulated value if this instance [existent]
     * or [otherwise] if it is [nonexistent].
     */
    inline fun <reified U, T : U> getOrElse(otherwise: U): U =
        if (data !is Void) data as T
        else otherwise

    companion object {
        /**
         * Returns a encapsulated `Void`.
         */
        val otherwise = Optional<Any?>(Void)

        /**
         * Returns a encapsulated `Void` with specific type [T].
         */
        fun <T> otherwise() = Optional<T>(Void)
    }
}
