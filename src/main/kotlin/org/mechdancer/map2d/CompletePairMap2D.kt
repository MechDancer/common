package org.mechdancer.map2d

/** 自填充二维映射 */
class CompletePairMap2D<T, U, V>(map: (T, U) -> V) :
	ICompleteMap2D<T, U, V> by CompletePairMap2DCore(map) {
	private class CompletePairMap2DCore<T, U, V>(
		override val map: (T, U) -> V
	) : IMutableMap2D<T, U, V> by MutablePairMap2D(),
		ICompleteMap2D<T, U, V> {
		override fun put0(t: T) = put0(t, map)
		override fun put1(u: U) = put1(u, map)
		override fun putAll0(t: Iterable<T>) = putAll0(t, map)
		override fun putAll1(u: Iterable<U>) = putAll1(u, map)
	}
}
