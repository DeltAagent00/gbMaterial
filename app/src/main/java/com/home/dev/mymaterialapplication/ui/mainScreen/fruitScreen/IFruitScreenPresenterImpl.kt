package com.home.dev.mymaterialapplication.ui.mainScreen.fruitScreen

import com.arellomobile.mvp.InjectViewState
import com.home.dev.mymaterialapplication.mvp.presenter.BasePresenterAbs

@InjectViewState
class IFruitScreenPresenterImpl: BasePresenterAbs<IFruitScreenView>(), IFruitScreenPresenter {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        viewState.initActionBar()
        viewState.initView()
        viewState.enableProgress(false)
    }

    override fun onBackPressed() {
        closeScreen()
    }

    override fun onClickShowBtn() {
        viewState.enableProgress(true)
    }

    override fun onClickHideBtn() {
        viewState.enableProgress(false)
    }
}