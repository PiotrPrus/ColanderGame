package com.piotrprus.colandergame.feature.teamslist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.databinding.DataBindingUtil
import com.piotrprus.colandergame.R
import com.piotrprus.colandergame.common.data.models.Team
import com.piotrprus.colandergame.databinding.ItemTeamBinding


class TeamsListAdapter : RecyclerView.Adapter<TeamsListViewHolder>() {

    var dataset = emptyList<Team>()
        set(value) {
            val old = field
            field = value
//          TODO: notify data changed, or use DiffUtil
        }

    override fun getItemCount(): Int = dataset.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamsListViewHolder {
        val binding: ItemTeamBinding =
            DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_team, parent, false)
        return TeamsListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TeamsListViewHolder, position: Int) {
        holder.bind(dataset[position])
    }
}
