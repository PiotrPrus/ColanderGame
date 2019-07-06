package com.piotrprus.colandergame.feature.teamslist

import androidx.recyclerview.widget.RecyclerView
import com.piotrprus.colandergame.common.data.models.Team
import com.piotrprus.colandergame.databinding.ItemTeamBinding

class TeamsListViewHolder(
    private val binding: ItemTeamBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Team) {
        binding.item = item
    }

}
