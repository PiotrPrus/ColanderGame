package com.piotrprus.colandergame.feature.main

import com.piotrprus.colandergame.R
import com.piotrprus.colandergame.base.BaseVMActivity
import com.piotrprus.colandergame.common.annotation.LayoutResId
import com.piotrprus.colandergame.databinding.ActivityMainBinding

@LayoutResId(R.layout.activity_main)
class MainActivity : BaseVMActivity<MainViewModel, ActivityMainBinding>(MainViewModel::class) {
    override fun start() {
        super.start()

    }
}