package com.home.dev.mymaterialapplication.ui.mainScreen.bottomScreen

import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.home.dev.mymaterialapplication.mvp.view.IBaseView

@StateStrategyType(OneExecutionStateStrategy::class)
interface IBottomScreenView: IBaseView {
    fun initView()
}