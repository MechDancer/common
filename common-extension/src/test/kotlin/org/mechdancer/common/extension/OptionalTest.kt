package org.mechdancer.common.extension

import org.junit.Assert
import org.junit.Test

class OptionalTest {
    private companion object {
        const val TEST_VALUE = 12345
    }

    @Test
    fun test() {
        val t0 = TEST_VALUE.check { it == 12345 }
        val t1 = TEST_VALUE.check { it == 23456 }

        t0.then { }.otherwise { Assert.fail() }
        t1.then { Assert.fail() }.otherwise { }

        Assert.assertEquals(TEST_VALUE, t0.getOrNull())
        Assert.assertNull(t1.getOrNull())

        Assert.assertEquals(TEST_VALUE, t0.getOrElse(100))
        Assert.assertEquals(100, t1.getOrElse(100))
    }
}
