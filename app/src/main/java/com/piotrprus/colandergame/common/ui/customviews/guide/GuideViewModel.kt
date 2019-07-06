package com.piotrprus.colandergame.common.ui.customviews.guide

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.piotrprus.colandergame.R
import com.piotrprus.colandergame.common.data.GuideType
import com.piotrprus.colandergame.utils.event.DataEventEmitter
import com.piotrprus.colandergame.utils.event.emit

class GuideViewModel() : ViewModel() {

    val guideTextRes = MutableLiveData<Int>()
    val guideShowStateCheck = MutableLiveData<Boolean>()
    val okButtonClickEvent = DataEventEmitter<Boolean>()

    fun setGuideTextRes(type: GuideType) {
        guideTextRes.value = when (type) {
            GuideType.CREATE_CHARS -> R.string.guide_create_teams
            else -> R.string.empty_string
        }
    }

    fun okButtonClicked() {
        guideShowStateCheck.value?.let {
            okButtonClickEvent.emit(it)
        }
    }
}
