package com.example.unittestsample.testable.presentation

import com.example.unittestsample.testable.domain.entity.PostCard

interface PostCardView {
    fun show(card: PostCard)
    fun showError()
}