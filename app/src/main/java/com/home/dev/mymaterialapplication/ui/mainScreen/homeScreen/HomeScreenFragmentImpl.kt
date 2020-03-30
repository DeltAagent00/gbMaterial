package com.home.dev.mymaterialapplication.ui.mainScreen.homeScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.presenter.InjectPresenter
import com.google.android.material.snackbar.Snackbar
import com.home.dev.mymaterialapplication.R
import com.home.dev.mymaterialapplication.ui.BaseFragmentAbs
import kotlinx.android.synthetic.main.fragment_home.*

class HomeScreenFragmentImpl : BaseFragmentAbs(), IHomeScreenView {
    @InjectPresenter
    lateinit var presenter: HomeScreenPresenterImpl

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun initView() {
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
}