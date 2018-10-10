package org.mechdancer.common

import java.io.File
import java.io.FileInputStream
import java.net.URL
import java.util.*
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.isSubclassOf
import kotlin.reflect.jvm.jvmErasure

annotation class PropertyDelegate(val name: String = ""/*, val type: KClass<*> = PropertyDelegate::class*/)


private fun <T> properties(path: String) = object : ReadWriteProperty<Any?, T> {

	private lateinit var url: URL

	private val properties by lazy {
		Properties().also { p ->
			url = try {
				javaClass.getResourceAsStream(path).use { p.load(it) }
				javaClass.getResource(path)
			} catch (ignore: Exception) {
				try {
					ClassLoader.getSystemClassLoader()
							.getResourceAsStream(path).use { p.load(it) }
					ClassLoader.getSystemResource(path)
				} catch (ignore: Exception) {
					FileInputStream(path).use { p.load(it) }
					File(path).toURI().toURL()
				}
			}
		}
	}


	override fun getValue(thisRef: Any?, property: KProperty<*>): T {
		val annotation = property.findAnnotation<PropertyDelegate>()
		val name = annotation
				?.name
				?.takeIf { it.isNotBlank() }
				?: property.name
//		val type=anno
//				?.type
//				?.takeIf { it!=PropertyDelegate::class }
//		?:property.returnType.jvmErasure
		val type = property.returnType.jvmErasure
		val value = properties[name]
		@Suppress("UNCHECKED_CAST")
		return when {
			type == Boolean::class           -> value.toString().toBoolean()
			type.isSubclassOf(Number::class) -> type.javaObjectType
					.getDeclaredMethod("parse${type.simpleName}", String::class.java)(type)
			else                             -> value
		} as T
	}

	override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
		val annotation = property.findAnnotation<PropertyDelegate>()
		val name = annotation
				?.name
				?.takeIf { it.isNotBlank() }
				?: property.name
		properties[name] = value.toString()
		File(url.toURI()).outputStream().use { properties.store(it, "") }
	}

}


abstract class PropertyList<T>(path: String) {
	protected val delegate = properties<T>(path)
}