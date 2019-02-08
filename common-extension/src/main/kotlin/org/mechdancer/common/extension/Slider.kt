package org.mechdancer.common.extension

import java.util.concurrent.atomic.AtomicReference
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * 容纳 [T] 的滑块，[size] 次不变视作稳定
 */
class Slider<T>(
    private val size: Int,
    init: T? = null
) : ReadWriteProperty<Any?, T?> {
    private var count = init?.let { 0 } ?: size
    private val _field = AtomicReference(init)

    init {
        assert(size > 0)
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>) =
        _field.takeIf { count <= 0 }?.get()

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T?) {
        _field.updateAndGet {
            count = if (it == value) count - 1 else size
            value
        }
    }
}
