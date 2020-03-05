package com.home.dev.mymaterialapplication.ui.authScreen

import com.home.dev.mymaterialapplication.mvp.presenter.IBasePresenter

interface IAuthScreenPresenter: IBasePresenter {
    fun onClickAuth(text: String)
}