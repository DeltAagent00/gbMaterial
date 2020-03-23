package com.home.dev.mymaterialapplication.ui.mainScreen.fruitScreen

import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.home.dev.mymaterialapplication.mvp.view.IBaseView

@StateStrategyType(OneExecutionStateStrategy::class)
interface IFruitScreenView: IBaseView {
    fun initActionBar()
    fun initView()

    fun enableProgress(enabled: Boolean)
}