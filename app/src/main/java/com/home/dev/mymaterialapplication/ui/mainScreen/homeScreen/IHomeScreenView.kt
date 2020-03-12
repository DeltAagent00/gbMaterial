package com.home.dev.mymaterialapplication.ui.mainScreen.homeScreen

import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.home.dev.mymaterialapplication.mvp.view.IBaseView

@StateStrategyType(OneExecutionStateStrategy::class)
interface IHomeScreenView: IBaseView {
    fun initView()
}