package com.piotrprus.colandergame.common.ui.binding

import android.os.Build
import android.text.Html
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("htmlStyled")
fun TextView.htmlStyled(coloredString: String) {
    text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) Html.fromHtml(coloredString, 0) else Html.fromHtml(coloredString)
}

@BindingAdapter("textRes")
fun TextView.textFromResources(textRes: Int) {
    setText(textRes)
}

@BindingAdapter("htmlTextRes")
fun TextView.htmlTextFromResources(htmlTextRes: Int) {
    val stringEquivalent = resources.getString(htmlTextRes)
    text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) Html.fromHtml(stringEquivalent, 0) else Html.fromHtml(stringEquivalent)
}