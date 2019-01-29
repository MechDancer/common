package org.mechdancer.common.extension

/** bool = true  则执行代码块 */
fun Boolean.then(block: () -> Unit) = also { if (it) block() }

/** bool = false 则执行代码块 */
fun Boolean.otherwise(block: () -> Unit) = also { if (!it) block() }

/** 直接转化到可选的 */
fun <T> T.toOptional() =
    Optional<T>(this)

/** 检查一个值 */
inline fun <T> T.check(block: (T) -> Boolean) =
    if (block(this)) Optional<T>(this) else Optional.otherwise()
