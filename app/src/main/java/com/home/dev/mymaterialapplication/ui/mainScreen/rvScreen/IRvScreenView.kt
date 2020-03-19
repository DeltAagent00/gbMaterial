package com.home.dev.mymaterialapplication.ui.mainScreen.rvScreen

import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.home.dev.mymaterialapplication.mvp.view.IBaseView

@StateStrategyType(OneExecutionStateStrategy::class)
interface IRvScreenView: IBaseView {
    fun initActionBar()
    fun initView()
    fun initRecyclerView()
    fun updateList()
}