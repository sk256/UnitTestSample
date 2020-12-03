package com.example.unittestsample.testable.domain.usecase

import com.example.unittestsample.testable.domain.entity.PostCard
import com.example.unittestsample.testrule.TestSchedulerRule
import org.junit.Rule
import org.junit.Test

class GetPostCardUseCaseTest {
    @get:Rule
    var testRule = TestSchedulerRule()

    @Test
    fun `on invoke EXPECT complete`() {
        val useCase = GetPostCardUseCase()

        useCase()
            .test()
            .assertComplete()
    }

    @Test
    fun `on invoke EXPECT get post card`() {
        val useCase = GetPostCardUseCase()

        useCase()
            .test()
            .assertValue(PostCard("", ""))
    }
}