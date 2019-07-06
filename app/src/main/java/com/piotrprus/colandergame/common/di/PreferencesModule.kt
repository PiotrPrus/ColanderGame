package com.piotrprus.colandergame.common.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val preferencesModule = module {
    single { provideUserPreferences(androidApplication()) }
}

private const val PREFERENCES_FILE_KEY = "user_action_preferences"

private fun provideUserPreferences(app: Application): SharedPreferences =
    app.getSharedPreferences(PREFERENCES_FILE_KEY, Context.MODE_PRIVATE)