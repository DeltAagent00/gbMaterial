package com.home.dev.mymaterialapplication.ui.authScreen

import android.os.Bundle
import com.arellomobile.mvp.presenter.InjectPresenter
import com.google.android.material.snackbar.Snackbar
import com.home.dev.mymaterialapplication.R
import com.home.dev.mymaterialapplication.ui.BaseActivityAbs
import com.home.dev.mymaterialapplication.ui.MainActivity
import kotlinx.android.synthetic.main.activity_auth_screen.*

class AuthScreenActivityImpl: BaseActivityAbs(), IAuthScreenView {
    @InjectPresenter
    lateinit var presenter: AuthScreenPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth_screen)
    }

    override fun initView() {
        btnView.setOnClickListener {
            presenter.onClickAuth(tietView.editableText.toString())
        }
    }

    override fun showErrorAuth() {
        Snackbar.make(rootView, R.string.not_be_empty, Snackbar.LENGTH_SHORT).show()
    }

    override fun showMainScreen() {
        MainActivity.show(this)
    }
}