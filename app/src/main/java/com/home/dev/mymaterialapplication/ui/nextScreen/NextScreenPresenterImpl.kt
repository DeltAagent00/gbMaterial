package com.home.dev.mymaterialapplication.ui.nextScreen

import com.arellomobile.mvp.InjectViewState
import com.home.dev.mymaterialapplication.mvp.presenter.BasePresenterAbs

@InjectViewState
class NextScreenPresenterImpl: BasePresenterAbs<INextScreenView>(), INextScreenPresenter {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        viewState.initActionBar()
        viewState.initView()
    }

    override fun onClickBackArrow() {
        closeScreen()
    }
}