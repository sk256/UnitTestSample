package com.example.unittestsample.default.presentation

import com.example.unittestsample.testable.domain.usecase.GetPostCardUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class PostCardPresenter(private val getPostCardUseCase: GetPostCardUseCase){
    private var view : PostCardView? = null
    private val disposables = CompositeDisposable()

    fun attachView(postCardView: PostCardView){
        view = postCardView

        val disposable = getPostCardUseCase()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                view?.show(it)
            },{
                view?.showError()
            })

        disposables.add(disposable)
    }

    fun onDestroy(){
        disposables.dispose()
    }
}
