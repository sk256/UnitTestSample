package com.example.unittestsample.testable

import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.never
import com.nhaarman.mockito_kotlin.verify
import org.junit.Test

class GoldKeeperTest {

    @Test
    fun `add more than 100 coins EXPECT save gold in storage `() {
        val storage: Storage = mock()
        val keeper = GoldKeeper(storage)

        keeper.addCoins(101)

        verify(storage).saveGold(101)
    }

    @Test
    fun `add less than  100 coins EXPECT never save gold in storage `() {
        val storage: Storage = mock()
        val keeper = GoldKeeper(storage)

        keeper.addCoins(99)

        verify(storage, never()).saveGold(any())
    }
}
