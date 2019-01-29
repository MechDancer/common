package org.mechdancer.common.collection.map2d

/**
 * 可变二维映射
 */
interface IMutableMap2D<T, U, V> : IMap2D<T, U, V> {
    /** 添加样点 (t, u) -> v */
    fun put(t: T, u: U, v: V)

    /** 添加键[T] */
    fun put0(t: T, block: (T, U) -> V)

    /** 添加键[U] */
    fun put1(u: U, block: (T, U) -> V)

    /** 添加一组键[T] */
    fun putAll0(t: Iterable<T>, block: (T, U) -> V)

    /** 添加一组键[U] */
    fun putAll1(u: Iterable<U>, block: (T, U) -> V)

    /** 移除键[T] */
    fun remove0(t: T)

    /** 移除键[U] */
    fun remove1(u: U)

    /** 移除一组键[T] */
    fun removeAll0(t: Iterable<T>)

    /** 移除一组键[U] */
    fun removeAll1(u: Iterable<U>)
}
