package com.home.dev.mymaterialapplication.mvp.presenter

import com.arellomobile.mvp.MvpPresenter
import com.home.dev.mymaterialapplication.mvp.view.IBaseView

abstract class BasePresenterAbs<T: IBaseView>: MvpPresenter<T>(), IBasePresenter {
    override fun closeScreen() {
        viewState.closeScreen()
    }
}