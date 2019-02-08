package org.mechdancer.common.extension

import java.util.concurrent.atomic.AtomicReference
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * 容纳[T]的滑块，[time]ms 不变视作稳定
 */
class TimedSlider<T>(
    private val time: Long,
    init: T? = null
) : ReadWriteProperty<Any?, T?> {
    private var stamp = System.currentTimeMillis()
    private val _field = AtomicReference(init)

    init {
        assert(time > 0)
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>) =
        _field.takeIf { System.currentTimeMillis() - stamp > time }?.get()

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T?) {
        _field.updateAndGet {
            if (it != value) stamp = System.currentTimeMillis()
            value
        }
    }
}
