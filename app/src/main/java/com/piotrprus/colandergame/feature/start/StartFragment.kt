package com.piotrprus.colandergame.feature.start

import androidx.navigation.fragment.findNavController
import com.piotrprus.colandergame.R
import com.piotrprus.colandergame.base.BaseVMFragment
import com.piotrprus.colandergame.common.annotation.LayoutResId
import com.piotrprus.colandergame.common.data.GuideType
import com.piotrprus.colandergame.common.ui.customviews.guide.GuideFragmentArgs
import com.piotrprus.colandergame.databinding.FragmentStartBinding

@LayoutResId(R.layout.fragment_start)
class StartFragment : BaseVMFragment<StartViewModel, FragmentStartBinding>(StartViewModel::class) {

    override fun start() {
        binding.viewModel = viewModel
        viewModel.onPlayButtonClickEvent.observeEvent {
            //TODO: Open second screen or guide
            val args = GuideFragmentArgs.Builder(GuideType.CREATE_CHARS).build().toBundle()
            findNavController().navigate(R.id.guideFragment, args)
        }
        viewModel.onGameRulesClickEvent.observeEvent {
            //TODO: Open game rules
        }
    }

//    override val onBackPressedHandler: (() -> Boolean) = {
//    	  // handle custom back pressed or delete this
//        true
//    }

}
