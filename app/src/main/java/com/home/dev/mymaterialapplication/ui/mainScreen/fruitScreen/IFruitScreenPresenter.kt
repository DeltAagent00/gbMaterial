package com.home.dev.mymaterialapplication.ui.mainScreen.fruitScreen

import com.home.dev.mymaterialapplication.mvp.presenter.IBasePresenter


interface IFruitScreenPresenter: IBasePresenter {
    fun onBackPressed()
    fun onClickShowBtn()
    fun onClickHideBtn()
}