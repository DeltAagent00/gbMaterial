package com.home.dev.mymaterialapplication.mvp.presenter.list

import com.home.dev.mymaterialapplication.mvp.view.list.IBaseListRowView


interface IBaseListPresenter<T: IBaseListRowView> {
    fun getCount(): Int
    fun bind(view: T)
    fun onClick(position: Int)
}