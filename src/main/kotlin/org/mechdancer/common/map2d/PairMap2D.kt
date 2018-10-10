package org.mechdancer.common.map2d

/** 二维映射 */
class PairMap2D<T, U, V>(map: Map<Pair<T, U>, V>) :
		Map<Pair<T, U>, V> by map,
		IMap2D<T, U, V> {
	override fun values0(t: T) = keys1.associate { it to this[t, it] }
	override fun values1(u: U) = keys0.associate { it to this[it, u] }
	override val keys0 = keys.map { it.first }.toSet()
	override val keys1 = keys.map { it.second }.toSet()
	override fun get(t: T, u: U) = this[t to u]
	override fun toPairMap() = this
}
