package com.piotrprus.colandergame

import android.app.Application
import com.piotrprus.colandergame.common.di.preferencesModule
import com.piotrprus.colandergame.common.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ColanderGame : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@ColanderGame)
            modules(listOf(viewModelModule, preferencesModule))
        }
    }
}