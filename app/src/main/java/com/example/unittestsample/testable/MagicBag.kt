package com.example.unittestsample.testable

class MagicBag(private val random : RandomGenerator) {
    companion object{
        const val MIN_GOLD_PIECES = 0
        const val MAX_GOLD_PIECES = 5
        const val COINS_IN_PIECE = 5
    }

    fun getGoldCoins():Int {
        val pieces = random.getNextInt(MIN_GOLD_PIECES, MAX_GOLD_PIECES +1)
        return  pieces * COINS_IN_PIECE
    }
}