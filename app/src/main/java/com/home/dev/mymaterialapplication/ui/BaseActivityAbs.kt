package com.home.dev.mymaterialapplication.ui

import com.arellomobile.mvp.MvpAppCompatActivity
import com.home.dev.mymaterialapplication.mvp.view.IBaseView

abstract class BaseActivityAbs: MvpAppCompatActivity(), IBaseView {
    override fun closeScreen() {
        finish()
    }
}