package com.home.dev.mymaterialapplication.ui.authScreen

import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.home.dev.mymaterialapplication.mvp.view.IBaseView

@StateStrategyType(OneExecutionStateStrategy::class)
interface IAuthScreenView: IBaseView {
    fun initView()
    fun showErrorAuth()
    fun showMainScreen()
    fun showSnackBarMsg()
}