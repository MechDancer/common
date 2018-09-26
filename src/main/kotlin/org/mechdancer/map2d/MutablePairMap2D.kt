package org.mechdancer.map2d

import org.mechdancer.util.then

/** 可变二维映射 */
class MutablePairMap2D<T, U, V>(map: Map<Pair<T, U>, V> = mapOf()) :
	IMutableMap2D<T, U, V> by MutablePairMap2DCore(map) {
	private class MutablePairMap2DCore<T, U, V>
	(map: Map<Pair<T, U>, V>) :
		MutableMap<Pair<T, U>, V> by map.toMutableMap(),
		IMutableMap2D<T, U, V> {
		override fun values0(t: T) = keys1.associate { it to this[t, it] }
		override fun values1(u: U) = keys0.associate { it to this[it, u] }
		override val keys0 = keys.map { it.first }.toMutableSet()
		override val keys1 = keys.map { it.second }.toMutableSet()
		override fun get(t: T, u: U) = this[t to u]

		override fun put(t: T, u: U, v: V) {
			keys0.add(t)
			keys1.add(u)
			put(t to u, v)
		}

		override fun put0(t: T, block: (T, U) -> V) {
			keys0.add(t)
			keys1.forEach { put(t to it, block(t, it)) }
		}

		override fun put1(u: U, block: (T, U) -> V) {
			keys1.add(u)
			keys0.forEach { put(it to u, block(it, u)) }
		}

		override fun remove0(t: T) {
			keys0.remove(t).then { keys1.forEach { remove(t to it) } }
		}

		override fun remove1(u: U) {
			keys1.remove(u).then { keys0.forEach { remove(it to u) } }
		}

		override fun putAll0(t: Iterable<T>, block: (T, U) -> V) = t.forEach { put0(it, block) }
		override fun putAll1(u: Iterable<U>, block: (T, U) -> V) = u.forEach { put1(it, block) }
		override fun removeAll0(t: Iterable<T>) = t.forEach(::remove0)
		override fun removeAll1(u: Iterable<U>) = u.forEach(::remove1)

		override fun toPairMap() = this
	}
}
