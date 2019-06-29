package com.piotrprus.colandergame.feature.start

import com.piotrprus.colandergame.R
import com.piotrprus.colandergame.base.BaseVMFragment
import com.piotrprus.colandergame.common.annotation.LayoutResId
import com.piotrprus.colandergame.databinding.FragmentStartBinding

@LayoutResId(R.layout.fragment_start)
class StartFragment : BaseVMFragment<StartViewModel, FragmentStartBinding>(StartViewModel::class) {

    override fun start() {
        binding.viewModel = viewModel
    }

//    override val onBackPressedHandler: (() -> Boolean) = {
//    	  // handle custom back pressed or delete this
//        true
//    }

}
