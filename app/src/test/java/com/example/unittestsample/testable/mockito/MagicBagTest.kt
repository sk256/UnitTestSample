package com.example.unittestsample.testable.mockito

import com.example.unittestsample.testable.MagicBag
import com.example.unittestsample.testable.RandomGenerator
import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import org.junit.Assert
import org.junit.Test

class MagicBagTest {

    @Test
    fun `get gold coins EXPECTED get zero coins`() {
        val randomGenerator: RandomGenerator = mock()
        whenever(randomGenerator.getNextInt(any(), any())).thenReturn(0)
        val bag = MagicBag(randomGenerator)

        val actual = bag.getGoldCoins()

        val expected = 0
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `get gold coins EXPECTED get 25 coins`() {
        val randomGenerator: RandomGenerator = mock()
        whenever(randomGenerator.getNextInt(any(), any())).thenReturn(5)
        val bag = MagicBag(randomGenerator)

        val actual = bag.getGoldCoins()

        val expected = 25
        Assert.assertEquals(expected, actual)
    }
}