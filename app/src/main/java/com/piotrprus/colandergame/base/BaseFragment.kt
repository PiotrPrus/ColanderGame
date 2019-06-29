package com.piotrprus.colandergame.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.piotrprus.colandergame.common.annotation.LayoutResId
import com.piotrprus.colandergame.utils.event.Event
import com.piotrprus.colandergame.utils.event.EventObserver

abstract class BaseFragment<VDB : ViewDataBinding> : Fragment() {

    lateinit var binding: VDB
        private set

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        (this::class.annotations
            .find { it is LayoutResId } as? LayoutResId)!!
            .let {
                binding = DataBindingUtil.inflate(inflater, it.resId, container, false)
                binding.setLifecycleOwner(this)
            }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        start()
    }

    protected abstract fun start()

    fun <T> LiveData<T>.observe(observe: ((value: T) -> Unit)) {
        this.observe(this@BaseFragment, Observer { value -> observe(value) })
    }

    fun <T> LiveData<Event<T>>.observeEvent(observe: ((value: T) -> Unit)) {
        this.observe(this@BaseFragment, EventObserver { value -> observe(value) })
    }
}