package org.mechdancer.common.concurrent

import org.mechdancer.common.extension.Optional
import org.mechdancer.common.extension.Optional.Companion.otherwise
import org.mechdancer.common.extension.toOptional
import java.util.concurrent.atomic.AtomicReference

/**
 * 计算一次
 */
class RunOnce<T, R>(
    private val strictOnce: Boolean = false,
    private val action: (T) -> R
) : (T) -> R? {
    // 原子变量不存在表示还没有计算过
    // 原子变量存在但其内容不存在表示上一次计算失败了
    // 原子变量存在且其内容也存在表示完成了一次正确的计算
    private val _value = AtomicReference<Optional<R>?>(null)

    /** 获取计算得到的值 */
    val value get() = _value.get()?.getOrNull()

    /** 进行一次计算 */
    override fun invoke(p: T) =
        _value
            .updateAndGet { last ->
                // 下述两种情况不重新进行计算：
                // 1. 之前的计算完成
                // 2. 之前的计算失败，且不允许重新计算
                last?.takeIf { it.existent || strictOnce }
                ?: runCatching { action(p).toOptional() }
                    // 无论这一次计算成功还是失败，原子变量不再为空
                    .getOrElse { otherwise() }
            }
            ?.getOrNull()
}
