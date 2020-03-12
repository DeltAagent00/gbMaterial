package com.home.dev.mymaterialapplication.ui.mainScreen.homeScreen

import com.arellomobile.mvp.InjectViewState
import com.home.dev.mymaterialapplication.mvp.presenter.BasePresenterAbs

@InjectViewState
class HomeScreenPresenterImpl: BasePresenterAbs<IHomeScreenView>(), IHomeScreenPresenter {
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        viewState.initView()
    }
}