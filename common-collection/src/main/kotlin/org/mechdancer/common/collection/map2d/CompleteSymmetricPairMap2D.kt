package org.mechdancer.common.collection.map2d

import org.mechdancer.common.extension.then

/**
 * 完全对称表
 * 添加表头时使用 [map] 构造表项
 */
class CompleteSymmetricPairMap2D<T, V>(map: (T, T) -> V) :
    ICompleteSymmetricMap2D<T, V> by CompleteSymmetricPairMap2DCore(map) {

    // 二维表的键
    private class Key<T>(private val t0: T, private val t1: T) {
        override fun equals(other: Any?) =
            (other as? Key<*>)?.let {
                // 对称表，顺序不重要
                (t0 == it.t0 && t1 == it.t1) || (t0 == it.t1 && t1 == it.t0)
            } == true

        override fun hashCode() =
            (t0?.hashCode() ?: 0) + (t1?.hashCode() ?: 0)

        infix fun <V> toBuild(block: (T, T) -> V) = block(t0, t1)

        fun toPair() = t0 to t1
    }

    // 二维表内核
    private class CompleteSymmetricPairMap2DCore<T, V>
        (override val map: (T, T) -> V) :
        MutableMap<Key<T>, V> by hashMapOf(),
        ICompleteSymmetricMap2D<T, V> {
        override val keys0 = hashSetOf<T>()
        override val keys1 get() = keys0
        override fun values0(t: T) = keys0.associateWith { this[t, it] }
        override fun values1(u: T) = values0(u)

        override fun get(t: T, u: T) = this[Key(t, u)]

        override fun put(t: T) {
            keys0.add(t).then {
                keys0.map { Key(t, it) }.forEach { put(it, it toBuild map) }
            }
        }

        override fun remove(t: T) {
            keys0.remove(t).then {
                keys0.map { Key(t, it) }.forEach { remove(it) }
                remove(Key(t, t))
            }
        }

        override fun putAll(t: Iterable<T>) = t.forEach(::put)
        override fun removeAll(t: Iterable<T>) = t.forEach(::remove)

        override fun toPairMap() =
            this.map { it.key.toPair() to it.value }.toMutableList()
                .apply { addAll(map { it.first.second to it.first.first to it.second }) }
                .toMap()
    }
}
