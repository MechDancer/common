package org.mechdancer.common

fun runForever(block: () -> Unit) = {
	while (true)
		block()
}