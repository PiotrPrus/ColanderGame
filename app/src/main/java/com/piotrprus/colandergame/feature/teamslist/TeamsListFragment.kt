package com.piotrprus.colandergame.feature.teamslist

import com.piotrprus.colandergame.R
import com.piotrprus.colandergame.base.BaseVMFragment
import com.piotrprus.colandergame.common.annotation.LayoutResId
import com.piotrprus.colandergame.databinding.FragmentTeamsListBinding

@LayoutResId(R.layout.fragment_teams_list)
class TeamsListFragment : BaseVMFragment<TeamsListViewModel, FragmentTeamsListBinding>(TeamsListViewModel::class) {

    override fun start() {
        binding.viewModel = viewModel
    }

//    override val onBackPressedHandler: (() -> Boolean) = {
//    	  // handle custom back pressed or delete this
//        true
//    }

}
