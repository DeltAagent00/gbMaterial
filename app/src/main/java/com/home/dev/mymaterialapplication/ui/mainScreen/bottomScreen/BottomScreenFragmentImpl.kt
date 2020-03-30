package com.home.dev.mymaterialapplication.ui.mainScreen.bottomScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.presenter.InjectPresenter
import com.home.dev.mymaterialapplication.R
import com.home.dev.mymaterialapplication.ui.BaseFragmentAbs


class BottomScreenFragmentImpl: BaseFragmentAbs(), IBottomScreenView {
    @InjectPresenter
    lateinit var presenter: BottomScreenPresenterImpl

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bottom_tabs, container, false)
    }

    override fun initView() {
    }
}