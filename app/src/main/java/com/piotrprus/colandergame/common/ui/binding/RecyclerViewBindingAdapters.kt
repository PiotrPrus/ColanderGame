package com.piotrprus.colandergame.common.ui.binding

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("adapter")
fun setAdapter(view: RecyclerView, adapter: RecyclerView.Adapter<*>) {
    view.adapter = adapter
    view.setHasFixedSize(true)
    view.layoutManager = LinearLayoutManager(view.context, RecyclerView.VERTICAL, false)
}