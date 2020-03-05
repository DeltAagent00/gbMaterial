package com.home.dev.mymaterialapplication.ui.authScreen

import com.arellomobile.mvp.InjectViewState
import com.home.dev.mymaterialapplication.mvp.presenter.BasePresenterAbs

@InjectViewState
class AuthScreenPresenterImpl: BasePresenterAbs<IAuthScreenView>(), IAuthScreenPresenter {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        viewState.initView()
    }

    override fun onClickAuth(text: String) {
        if (text.isEmpty()) {
            viewState.showErrorAuth()
        } else {
            viewState.showMainScreen()
            closeScreen()
        }
    }
}