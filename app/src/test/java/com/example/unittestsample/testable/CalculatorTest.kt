package com.example.unittestsample.testable

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorTest {

    @Test
    fun `multiply 2 and 2 EXPECT 4`() {
        val calculator = Calculator()

        val actual = calculator.multiply(2f, 2f)

        val expected = 4f
        assertEquals(expected, actual)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `divide by zero EXPECT illegal argument exception`() {
        val calculator = Calculator()

        calculator.divide(2f, 0f)
    }
}