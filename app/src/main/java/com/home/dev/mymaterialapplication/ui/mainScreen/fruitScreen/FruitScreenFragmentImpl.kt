package com.home.dev.mymaterialapplication.ui.mainScreen.fruitScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.presenter.InjectPresenter
import com.home.dev.mymaterialapplication.R
import com.home.dev.mymaterialapplication.ui.BaseFragmentAbs
import kotlinx.android.synthetic.main.fragment_fruit.*


class FruitScreenFragmentImpl: BaseFragmentAbs(), IFruitScreenView {

    @InjectPresenter
    lateinit var presenter: IFruitScreenPresenterImpl

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fruit, container, false)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            android.R.id.home -> {
                presenter.onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun initActionBar() {
        activity?.actionBar?.apply {
            setDisplayShowHomeEnabled(true)
        }
    }

    override fun initView() {
        showLoaderView.setOnClickListener {
            presenter.onClickShowBtn()
        }
        hideLoaderView.setOnClickListener {
            presenter.onClickHideBtn()
        }
    }

    override fun enableProgress(enabled: Boolean) {
        val visibleFlag = if (enabled) {
            View.VISIBLE
        } else {
            View.GONE
        }
        linearProgressView.visibility = visibleFlag
        circleProgressView.visibility = visibleFlag
    }
}