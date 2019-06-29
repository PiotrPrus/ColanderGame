package com.piotrprus.colandergame.feature.start

import androidx.lifecycle.ViewModel
import com.piotrprus.colandergame.utils.event.EventEmitter
import com.piotrprus.colandergame.utils.event.emit

class StartViewModel : ViewModel() {

    val onPlayButtonClickEvent = EventEmitter()
    val onGameRulesClickEvent = EventEmitter()

    fun onPlayClicked() {
        onPlayButtonClickEvent.emit()
    }

    fun onGameRulesClicked() {
        onGameRulesClickEvent.emit()
    }
}
