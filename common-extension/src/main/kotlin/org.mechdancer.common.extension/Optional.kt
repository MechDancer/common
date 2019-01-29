package org.mechdancer.common.extension

/**
 * 任意的
 *
 * 表示一个值可能存在也可能不存在
 * 作为值的内联类存在，通过一系列函数安全地访问其值
 */
@Suppress("NON_PUBLIC_PRIMARY_CONSTRUCTOR_OF_INLINE_CLASS")
@SinceKotlin("1.3")
inline class Optional<out T>
@PublishedApi internal constructor(@PublishedApi internal val data: Any?) {
    @PublishedApi
    internal object Otherwise

    /** 若值存在则... */
    inline fun then(block: (T) -> Any?) =
        also { if (data !is Otherwise) block(data as T) }

    /** 若值不存在则... */
    inline fun otherwise(block: () -> Any?) =
        also { if (data is Otherwise) block() }

    /** 尝试获取值 */
    fun getOrNull(): T? =
        if (data !is Otherwise) data as T else null

    /** 尝试获取值，不存在则用[else]替换 */
    inline fun <reified U, T : U> getOrElse(`else`: U): U =
        (getOrNull() ?: `else`) as U

    companion object {
        /** 直接构造一个不存在的值 */
        val otherwise = Optional<Any?>(Otherwise)

        /** 直接构造一个具有特定类型的不存在的值 */
        fun <T> otherwise() = Optional<T>(Otherwise)
    }
}
