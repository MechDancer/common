package org.mechdancer.common.extension

import org.mechdancer.common.extension.BooleanExt.Data
import org.mechdancer.common.extension.BooleanExt.Otherwise

/** bool = true  则执行代码块 */
fun Boolean.then(block: () -> Unit) = also { if (it) block() }

/** bool = false 则执行代码块 */
fun Boolean.otherwise(block: () -> Unit) = also { if (!it) block() }

sealed class BooleanExt<out T> {
    object Otherwise : BooleanExt<Nothing>()
    class Data<out T>(val data: T) : BooleanExt<T>()
}

inline fun <T> Boolean.yes(block: () -> T) =
    if (this) Data(block())
    else Otherwise

inline fun <T> BooleanExt<T>.otherwise(block: () -> T): T = when (this) {
    is Otherwise -> block()
    is Data<T>   -> data
}
