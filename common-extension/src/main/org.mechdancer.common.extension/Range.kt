package org.mechdancer.common.ext

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
fun ClosedFloatingPointRange<Double>.sampleOrNull(n: Int): List<Double>? =
	takeIf { start < endInclusive && n >= 2 }
		?.run {
			val step = ((endInclusive - start) / (n - 1))
			List(n) { i -> start + i * step }
		}

/**
 * 将不会返回 null
 */
infix fun ClosedFloatingPointRange<Double>.sample(n: Int) =
	sampleOrNull(n) ?: throw IllegalArgumentException("some thing wrong")
