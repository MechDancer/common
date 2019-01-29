package org.mechdancer.common.collection.map2d

/**
 * 完全二维映射
 * 通过固定映射函数保证表填满
 */
interface ICompleteMap2D<T, U, V> : IMap2D<T, U, V> {
	/** 映射函数 */
	val map: (T, U) -> V

	/** 添加键[T] */
	fun put0(t: T)

	/** 添加键[U] */
	fun put1(u: U)

	/** 添加一组键[T] */
	fun putAll0(t: Iterable<T>)

	/** 添加一组键[U] */
	fun putAll1(u: Iterable<U>)

	/** 移除键[T] */
	fun remove0(t: T)

	/** 移除键[U] */
	fun remove1(u: U)

	/** 移除一组键[T] */
	fun removeAll0(t: Iterable<T>)

	/** 移除一组键[U] */
	fun removeAll1(u: Iterable<U>)
}
