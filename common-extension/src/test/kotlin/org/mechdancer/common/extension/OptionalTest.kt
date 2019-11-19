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

        Assert.assertTrue(t0.existent)
        Assert.assertFalse(t0.nonexistent)

        Assert.assertFalse(t1.existent)
        Assert.assertTrue(t1.nonexistent)

        t0.then { }.otherwise { Assert.fail() }
        t1.then { Assert.fail() }.otherwise { }

        Assert.assertEquals(TEST_VALUE, t0.getOrNull())
        Assert.assertNull(t1.getOrNull())

        Assert.assertEquals(TEST_VALUE, t0.getOrElse(100))
        Assert.assertEquals(100, t1.getOrElse(100))
    }

    @Test
    fun testFunctional() {
        // Test fmap
        val a = 1.0.toOptional()
        Assert.assertEquals(2.0.toOptional(), a map (Double::inc))

        // Test <*>
        fun addOptional(o1: Optional<Int>, o2: Optional<Int>) =
            o2 ap o1.map {
                { arg2: Int ->
                    it + arg2
                }
            }
        Assert.assertEquals(3.toOptional(), addOptional(1.toOptional(), 2.toOptional()))
        Assert.assertEquals(Optional.otherwise<Int>(), addOptional(Optional.otherwise(), 2.toOptional()))

        // Test >>=
        val b = 1.0.toOptional()
        val c = 2.0.toOptional()
        Assert.assertEquals(
            3.0.toOptional(),
            b flatMap { arg1 -> c flatMap { arg2 -> (arg1 + arg2).toOptional() } })
    }
}
