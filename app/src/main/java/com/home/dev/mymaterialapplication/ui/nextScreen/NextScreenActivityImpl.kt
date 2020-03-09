package com.home.dev.mymaterialapplication.ui.nextScreen

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import com.arellomobile.mvp.presenter.InjectPresenter
import com.home.dev.mymaterialapplication.R
import com.home.dev.mymaterialapplication.ui.BaseActivityAbs
import kotlinx.android.synthetic.main.activity_next_screen.*


class NextScreenActivityImpl: BaseActivityAbs(), INextScreenView {
    companion object {
        fun show(context: Context) {
            val intent = Intent(context, NextScreenActivityImpl::class.java)
            context.startActivity(intent)
        }
    }

    @InjectPresenter
    lateinit var presenter: NextScreenPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_screen)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            android.R.id.home -> {
                presenter.onClickBackArrow()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun initActionBar() {
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = null
            setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun initView() {
    }
}