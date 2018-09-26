package org.mechdancer.util

/** bool = true  则执行代码块 */
fun Boolean.then(block: () -> Unit) = also { if (it) block() }

/** bool = false 则执行代码块 */
fun Boolean.otherwise(block: () -> Unit) = also { if (!it) block() }
