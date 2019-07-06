package com.piotrprus.colandergame.common.di

import com.piotrprus.colandergame.common.ui.customviews.guide.GuideViewModel
import com.piotrprus.colandergame.feature.main.MainViewModel
import com.piotrprus.colandergame.feature.start.StartViewModel
import com.piotrprus.colandergame.feature.teamslist.TeamsListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel() }
    viewModel { StartViewModel() }
    viewModel { GuideViewModel() }
    viewModel { TeamsListViewModel() }
}