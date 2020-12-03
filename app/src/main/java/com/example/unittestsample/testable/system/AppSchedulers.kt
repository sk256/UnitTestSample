package com.example.unittestsample.testable.system

import io.reactivex.Scheduler

interface AppSchedulers {

    fun getIOScheduler(): Scheduler

    fun getMainThread(): Scheduler
}