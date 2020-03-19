package com.home.dev.mymaterialapplication.ui.mainScreen.rvScreen

import com.home.dev.mymaterialapplication.mvp.presenter.IBasePresenter
import com.home.dev.mymaterialapplication.mvp.presenter.list.IImageListPresenter


interface IRvScreenPresenter: IBasePresenter {
    fun getListPresenter(): IImageListPresenter
}