package com.home.dev.mymaterialapplication.ui

import com.arellomobile.mvp.MvpAppCompatFragment
import com.home.dev.mymaterialapplication.mvp.view.IBaseView


abstract class BaseFragmentAbs: MvpAppCompatFragment(), IBaseView {
    override fun closeScreen() {
        activity?.finish()
    }
}