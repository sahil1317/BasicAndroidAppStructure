package com.sahil.baseapp.base

import android.app.Application
import timber.log.Timber


class MyApp : Application(){

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())

        Timber.e("App Created")
    }
}