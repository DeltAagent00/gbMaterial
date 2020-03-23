package com.home.dev.mymaterialapplication.ui.mainScreen.coordiantorScreen

import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.home.dev.mymaterialapplication.mvp.view.IBaseView

@StateStrategyType(OneExecutionStateStrategy::class)
interface ICoordinatorScreenView: IBaseView {
    fun initActionBar()
    fun initView()
}