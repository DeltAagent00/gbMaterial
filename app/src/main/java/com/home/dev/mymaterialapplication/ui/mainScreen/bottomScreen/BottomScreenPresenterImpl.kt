package com.home.dev.mymaterialapplication.ui.mainScreen.bottomScreen

import com.arellomobile.mvp.InjectViewState
import com.home.dev.mymaterialapplication.mvp.presenter.BasePresenterAbs

@InjectViewState
class BottomScreenPresenterImpl: BasePresenterAbs<IBottomScreenView>(), IBottomScreenPresenter {
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        viewState.initView()
    }
}