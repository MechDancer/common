package org.mechdancer.common.collection.map2d

/**
 * 二维映射
 * @param T 第一种键类型
 * @param U 第二种键类型
 * @param V 值类型
 */
interface IMap2D<T, U, V> {
    /** 按键[T]查找 */
    fun values0(t: T): Map<U, V?>

    /** 按键[U]查找 */
    fun values1(u: U): Map<T, V?>

    /** 获取键[T]集合 */
    val keys0: Set<T>

    /** 获取键[U]集合 */
    val keys1: Set<U>

    /** 判断是否包含某个键[T] */
    fun containsKey0(key: T) = key in keys0

    /** 判断是否包含某个键[U] */
    fun containsKey1(key: U) = key in keys1

    /** 获取值 */
    operator fun get(t: T, u: U): V?

    /** 转键对映射 */
    fun toPairMap(): Map<Pair<T, U>, V>
}
