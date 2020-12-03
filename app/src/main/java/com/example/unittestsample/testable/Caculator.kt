package com.example.unittestsample.testable

class Calculator {

    fun multiply(left: Float, right: Float): Float =
        left * right

    fun divide(left: Float, right: Float): Float =
        if (right == 0f) {
            throw IllegalArgumentException()
        } else {
            left / right
        }
}