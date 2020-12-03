package com.example.unittestsample.testable.presentation.rule

import com.example.unittestsample.default.presentation.PostCardPresenter
import com.example.unittestsample.default.presentation.PostCardView
import com.example.unittestsample.testable.domain.usecase.GetPostCardUseCase
import com.example.unittestsample.testrule.TestSchedulerRule
import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.junit.Rule
import org.junit.Test

class PostCardPresenterTest {

    @JvmField
    @Rule
    val testRule = TestSchedulerRule()

    @Test
    fun `on attach view EXPECT show post card`() {
        val getPostCardUseCase = GetPostCardUseCase()
        val presenter = PostCardPresenter(getPostCardUseCase)
        val view: PostCardView = mock()

        presenter.attachView(view)

        verify(view).show(any())
    }
}

