package com.home.dev.mymaterialapplication.ui.mainScreen.coordiantorScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.home.dev.mymaterialapplication.R
import com.home.dev.mymaterialapplication.ui.BaseFragmentAbs
import kotlinx.android.synthetic.main.fragment_coordinator_screen.*


class CoordinatorScreenFragmentImpl: BaseFragmentAbs(), ICoordinatorScreenView {
    @InjectPresenter
    lateinit var presenter: CoordinatorScreenPresenterImpl

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_coordinator_screen, container, false)
    }

    override fun initActionBar() {
        (activity as AppCompatActivity).supportActionBar?.hide()
        toolbarView.setTitle(R.string.fruit_coordinator)
    }

    override fun initView() {

    }

    override fun onDestroyView() {
        super.onDestroyView()
        (activity as AppCompatActivity).supportActionBar?.show()
    }
}