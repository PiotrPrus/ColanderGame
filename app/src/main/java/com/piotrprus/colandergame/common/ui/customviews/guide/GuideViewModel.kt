package com.piotrprus.colandergame.common.ui.customviews.guide

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.piotrprus.colandergame.R
import com.piotrprus.colandergame.common.data.GuideType

class GuideViewModel() : ViewModel() {

    val guideTextRes = MutableLiveData<Int>()

    fun setGuideTextRes(type: GuideType) {
        guideTextRes.value = when (type) {
            GuideType.CREATE_CHARS -> R.string.guide_create_teams
            else -> R.string.empty_string
        }
    }

}
