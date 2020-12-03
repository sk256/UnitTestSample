package com.example.unittestsample.testable

class GoldKeeper(private val storage: Storage) {

    private companion object{
        const val MAX_COINS = 100
    }

    private var currentCoins = 0

    fun addCoins( newCoins: Int) {
        currentCoins += newCoins
        if (currentCoins > MAX_COINS){
            storage.saveGold(currentCoins)
            currentCoins = 0
        }
    }
}
