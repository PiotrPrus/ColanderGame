package com.piotrprus.colandergame.common.ui.customviews.guide

import android.content.SharedPreferences
import androidx.navigation.fragment.findNavController
import com.piotrprus.colandergame.R
import com.piotrprus.colandergame.base.BaseVMFragment
import com.piotrprus.colandergame.common.annotation.LayoutResId
import com.piotrprus.colandergame.common.data.GuideType
import com.piotrprus.colandergame.common.data.constants.UserConstants
import com.piotrprus.colandergame.common.extensions.set
import com.piotrprus.colandergame.databinding.FragmentGuideBinding
import org.koin.android.ext.android.inject

@LayoutResId(R.layout.fragment_guide)
class GuideFragment : BaseVMFragment<GuideViewModel, FragmentGuideBinding>(GuideViewModel::class) {

    private val preferences: SharedPreferences by inject()

    override fun start() {
        binding.viewModel = viewModel
        val guideType = GuideFragmentArgs.fromBundle(requireArguments()).guideType
        viewModel.setGuideTextRes(guideType)
        viewModel.okButtonClickEvent.observeEvent { isChecked ->
            if (isChecked) doNotShowGuideAgain(guideType)
            findNavController().navigate(R.id.teamsListFragment)
        }
    }

    private fun doNotShowGuideAgain(guideType: GuideType) {
        when (guideType) {
            GuideType.FIRST -> preferences.set(UserConstants.SHOW_FIRST_GUIDE, false)
        }
    }

//    override val onBackPressedHandler: (() -> Boolean) = {
//    	  // handle custom back pressed or delete this
//        true
//    }

}
