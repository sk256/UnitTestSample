package com.example.unittestsample.testable.presentation

import com.example.unittestsample.testable.domain.usecase.GetPostCardUseCase
import com.example.unittestsample.testable.system.AppSchedulers
import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import io.reactivex.schedulers.Schedulers
import org.junit.Test


class TestSchedulers : AppSchedulers {
    override fun getIOScheduler() =
        Schedulers.trampoline()

    override fun getMainThread() =
        Schedulers.trampoline()
}

class PostCardPresenterTest {

    @Test
    fun `on attach view EXPECT show post card`() {
        val getPostCardUseCase = GetPostCardUseCase()
        val schedulers = TestSchedulers()
        val presenter = PostCardPresenter(getPostCardUseCase, schedulers)
        val view: PostCardView = mock()

        presenter.attachView(view)

        verify(view).show(any())
    }
}