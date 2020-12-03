package com.example.unittestsample.testable.domain.usecase

import com.example.unittestsample.testable.domain.entity.PostCard
import io.reactivex.Single

class GetPostCardUseCase {
    operator fun invoke(): Single<PostCard> =
        Single.just(PostCard("", ""))
}