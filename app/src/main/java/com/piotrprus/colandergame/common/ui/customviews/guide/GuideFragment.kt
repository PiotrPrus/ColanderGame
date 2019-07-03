package com.piotrprus.colandergame.common.ui.customviews.guide

import com.piotrprus.colandergame.R
import com.piotrprus.colandergame.base.BaseVMFragment
import com.piotrprus.colandergame.common.annotation.LayoutResId
import com.piotrprus.colandergame.databinding.FragmentGuideBinding

@LayoutResId(R.layout.fragment_guide)
class GuideFragment : BaseVMFragment<GuideViewModel, FragmentGuideBinding>(GuideViewModel::class) {

    override fun start() {
        binding.viewModel = viewModel
        val guideType = GuideFragmentArgs.fromBundle(requireArguments()).guideType
        viewModel.setGuideTextRes(guideType)
    }

//    override val onBackPressedHandler: (() -> Boolean) = {
//    	  // handle custom back pressed or delete this
//        true
//    }

}
