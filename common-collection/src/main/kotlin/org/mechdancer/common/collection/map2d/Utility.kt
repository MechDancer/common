package org.mechdancer.common.collection.map2d

/** 求两离散集合的笛卡尔积 */
infix fun <A, B> Iterable<A>.descartes(other: Iterable<B>) =
    toSet().flatMap { a -> other.toSet().map { b -> a to b } }.toSet()

/** 添加或修改表项 */
operator fun <T, U, V> IMutableMap2D<T, U, V>.set(t: T, u: U, v: V) = put(t, u, v)

/** 添加或修改表项 */
operator fun <T, V> ICompleteSymmetricMap2D<T, V>.plusAssign(t: T) = put(t)

/** 构造二维映射 */
inline fun <T, U, V> map(t: Iterable<T>, u: Iterable<U>, block: (T, U) -> V): IMap2D<T, U, V> =
    PairMap2D((t.toSet() descartes u.toSet()).associateWith { block(it.first, it.second) })

/** 构造二维映射 */
inline fun <T, U, V> mapValues(t: Iterable<T>, u: Iterable<U>, block: (T, U) -> V): List<V> =
    (t.toSet() descartes u.toSet()).map { (a, b) -> block(a, b) }

/** 展开对称二维映射 */
inline fun <T, V> map(set: Iterable<T>, block: (T, T) -> V): IMap2D<T, T, V> =
    set.toSet().let { map(it, it, block) }

/** 展开可变二维映射 */
fun <T, V> stretch2D(t: Iterable<T>, block: (T, T) -> V): ICompleteSymmetricMap2D<T, V> =
    CompleteSymmetricPairMap2D(block).apply { putAll(t) }

/** 转不可变二维映射 */
fun <T, U, V> IMap2D<T, U, V>.toMap2D(): IMap2D<T, U, V> =
    PairMap2D(toPairMap())

/** 转不可变二维映射 */
fun <T, U, V> IMap2D<T, U, V>.toMutableMap2D(): IMutableMap2D<T, U, V> =
    MutablePairMap2D(toPairMap())

/** 转不可变二维映射 */
fun <T, U, V> IMap2D<T, U, V>.fillBy(block: (T, U) -> V): ICompleteMap2D<T, U, V> =
    CompletePairMap2D(block).also {
        it.putAll0(keys0)
        it.putAll1(keys1)
    }

/** 值映射到另一表 */
inline fun <T, U, V, V1> IMap2D<T, U, V>.mapValue(block: (V) -> V1): IMap2D<T, U, V1> =
    PairMap2D(toPairMap().mapValues { block(it.value) })

/** 通用转字符串 */
fun <T, U, V> IMap2D<T, U, V>.viewBy(
    f0: (T) -> String,
    f1: (U) -> String,
    f2: (V) -> String
) = StringBuilder().apply {
    val string = mapValue(f2)
    val max = (intArrayOf(
        string.keys0.map { f0(it).length }.max() ?: 1,
        string.keys1.map { f1(it).length }.max() ?: 1,
        string.toPairMap().values.map { it.length }.max() ?: 1
    ).max() ?: 1) + 1

    val displayItem = { it: String? ->
        (it ?: "").let { str ->
            append(" ".repeat(max - str.length - 1))
            append("$str ")
        }
        Unit
    }

    displayItem("+")
    string.keys0.map(f0).forEach(displayItem)
    append("\n")
    string.keys1.forEach { r ->
        displayItem(f1(r))
        string.values1(r).values.forEach(displayItem)
        append("\n")
    }
}.toString()

/** 通用转字符串 */
fun <T, U, V> IMap2D<T, U, V>.view() =
    viewBy({ it.toString() }, { it.toString() }, { it.toString() })
