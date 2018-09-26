package org.mechdancer.map2d

/**
 * 自动填充对称二维映射
 * 保证表是填满的正方形
 */
interface ICompleteSymmetricMap2D<T, V> : IMap2D<T, T, V> {
	/** 映射函数 */
	val map: (T, T) -> V

	/** 添加键[T] */
	fun put(t: T)

	/** 添加一组键[T] */
	fun putAll(t: Iterable<T>)

	/** 移除键[T] */
	fun remove(t: T)

	/** 移除一组键[T] */
	fun removeAll(t: Iterable<T>)
}
