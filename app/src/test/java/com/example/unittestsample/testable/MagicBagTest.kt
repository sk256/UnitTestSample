package com.example.unittestsample.testable

import org.junit.Assert.assertEquals
import org.junit.Test

class MagicBagTest {

    private class TestRandomGenerator(private val value: Int) : RandomGenerator {

        override fun getNextInt(from: Int, until: Int): Int {
            return value
        }
    }

    @Test
    fun `get gold coins EXPECTED get zero coins`() {
        val testRandomGenerator = TestRandomGenerator(0)
        val bag = MagicBag(testRandomGenerator)

        val actual = bag.getGoldCoins()

        val expected = 0
        assertEquals(expected, actual)
    }

    @Test
    fun `get gold coins EXPECTED get 25 coins`() {
        val testRandomGenerator = TestRandomGenerator(5)
        val bag = MagicBag(testRandomGenerator)

        val actual = bag.getGoldCoins()

        val expected = 25
        assertEquals(expected, actual)
    }
}