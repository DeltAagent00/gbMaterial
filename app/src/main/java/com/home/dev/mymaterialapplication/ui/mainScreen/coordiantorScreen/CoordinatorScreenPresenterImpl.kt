package com.home.dev.mymaterialapplication.ui.mainScreen.coordiantorScreen

import com.arellomobile.mvp.InjectViewState
import com.home.dev.mymaterialapplication.mvp.presenter.BasePresenterAbs

@InjectViewState
class CoordinatorScreenPresenterImpl: BasePresenterAbs<ICoordinatorScreenView>(), ICoordinatorScreenPresenter {
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        viewState.initActionBar()
        viewState.initView()
    }
}