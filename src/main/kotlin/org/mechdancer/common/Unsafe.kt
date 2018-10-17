package org.mechdancer.common

import sun.misc.Unsafe
import java.lang.reflect.Field

private typealias SunUnsafe = Unsafe

object Unsafe {

	@PublishedApi
	internal val unsafe by lazy {
		SunUnsafe::class.java
				.getDeclaredField("theUnsafe")
				.apply { isAccessible = true }[null]
				.unsafeCast<SunUnsafe>()
	}

	object Class {

		fun objectFieldOffset(field: Field) = unsafe.objectFieldOffset(field)
		fun staticFieldOffset(field: Field) = unsafe.staticFieldOffset(field)

		inline fun <reified T : Any> newInstance() =
				unsafe.allocateInstance(T::class.java)
						.unsafeCast<T>()

		fun <T> put(obj: Any, field: Field, value: T) = with(unsafe) {
			when (value) {
				is Char    -> putChar(obj, objectFieldOffset(field), value)
				is Byte    -> putByte(obj, objectFieldOffset(field), value)
				is Boolean -> putBoolean(obj, objectFieldOffset(field), value)
				is Short   -> putShort(obj, objectFieldOffset(field), value)
				is Long    -> putLong(obj, objectFieldOffset(field), value)
				is Double  -> putDouble(obj, objectFieldOffset(field), value)
				is Int     -> putInt(obj, objectFieldOffset(field), value)
				else       -> throw UnsupportedOperationException()
			}
		}
	}

	object Memory {
		fun free(address: Long) = unsafe.freeMemory(address)
		fun allocate(address: Long) = unsafe.allocateMemory(address)
		fun reallocate(address: Long, size: Long) = unsafe.reallocateMemory(address, size)

		fun <T> put(address: Long, value: T) =
				with(unsafe) {
					when (value) {
						is Char    -> putChar(address, value)
						is Byte    -> putByte(address, value)
						is Short   -> putShort(address, value)
						is Long    -> putLong(address, value)
						is Double  -> putDouble(address, value)
						is Int     -> putInt(address, value)
						else       -> throw UnsupportedOperationException()
					}
				}
	}

	object Array {
		fun baseOffset(clazz: java.lang.Class<*>) = unsafe.arrayBaseOffset(clazz)
		fun setMemory(address: Long, size: Long, byte: Byte) = unsafe.setMemory(address, size, byte)
	}


}