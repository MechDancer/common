package org.mechdancer.common.extension

import kotlin.math.max
import kotlin.math.min

/** 闭区间长度 */
val ClosedFloatingPointRange<Double>.length get() = endInclusive - start

/** 调整周期函数到区间内 */
tailrec fun ClosedFloatingPointRange<Double>.adjust(x: Double): Double =
    when {
        x < start -> adjust(x + length)
        x > endInclusive -> adjust(x - length)
        else -> x
    }

/** 限幅器 */
fun IntRange.limit(x: Int): Int =
    when {
        x < start -> start
        x > endInclusive -> endInclusive
        else -> x
    }

/** 限幅器 */
fun ClosedFloatingPointRange<Double>.limit(x: Double): Double =
    when {
        x < start -> start
        x > endInclusive -> endInclusive
        else -> x
    }

/** 根据中心[this]和半径[radius]张开区间 */
infix fun Double.extend(radius: Double) = this - radius..this + radius

/** 并集 */
operator fun ClosedFloatingPointRange<Double>.plus(other: ClosedFloatingPointRange<Double>) =
    min(start, other.start)..max(endInclusive, other.endInclusive)

/** 交集 */
operator fun ClosedFloatingPointRange<Double>.times(other: ClosedFloatingPointRange<Double>) =
    max(start, other.start)..min(endInclusive, other.endInclusive)

/**
 * 等分区间
 * @return 等分点（包括两端点）
 */
operator fun ClosedFloatingPointRange<Double>.div(t: Int): List<Double> {
    assert(start < endInclusive)
    assert(t >= 2)
    val step = length / (t - 1) //步长
    return List(t) { i -> start + i * step }
}
