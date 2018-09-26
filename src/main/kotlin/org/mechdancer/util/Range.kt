package org.mechdancer.util

import kotlin.math.max
import kotlin.math.min

/** 并集 */
operator fun ClosedFloatingPointRange<Double>.plus(other: ClosedFloatingPointRange<Double>) =
	min(start, other.start)..max(endInclusive, other.endInclusive)

/** 交集 */
operator fun ClosedFloatingPointRange<Double>.times(other: ClosedFloatingPointRange<Double>) =
	max(start, other.start)..min(endInclusive, other.endInclusive)

/**
 * 在区间中等间隔采样
 * @param n 样点数量
 * @return 等分点（包括两端点）
 */
infix fun ClosedFloatingPointRange<Double>.sample(n: Int): List<Double> {
	assert(start < endInclusive)
	assert(n >= 2)
	val step = (endInclusive - start) / (n - 1) //步长
	return List(n) { i -> start + i * step }
}
