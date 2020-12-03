package com.example.unittestsample.testable.presentation

import com.example.unittestsample.testable.system.AppSchedulers
import com.example.unittestsample.testable.domain.usecase.GetPostCardUseCase
import io.reactivex.disposables.CompositeDisposable

class PostCardPresenter(
    private val getPostCardUseCase: GetPostCardUseCase,
    private val schedulers: AppSchedulers
) {
    private var view: PostCardView? = null
    private val disposables = CompositeDisposable()

    fun attachView(postCardView: PostCardView) {
        view = postCardView

        val disposable = getPostCardUseCase()
            .observeOn(schedulers.getMainThread())
            .subscribeOn(schedulers.getIOScheduler())
            .subscribe({
                view?.show(it)
            }, {
                view?.showError()
            })

        disposables.add(disposable)
    }

    fun onDestroy() {
        disposables.dispose()
    }
}
