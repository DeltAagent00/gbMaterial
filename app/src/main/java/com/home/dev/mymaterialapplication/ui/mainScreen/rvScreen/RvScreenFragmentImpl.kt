package com.home.dev.mymaterialapplication.ui.mainScreen.rvScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arellomobile.mvp.presenter.InjectPresenter
import com.home.dev.mymaterialapplication.R
import com.home.dev.mymaterialapplication.ui.BaseFragmentAbs
import com.home.dev.mymaterialapplication.ui.adapter.ImageRvAdapter
import kotlinx.android.synthetic.main.fragment_recycler_view.*


class RvScreenFragmentImpl: BaseFragmentAbs(), IRvScreenView {
    @InjectPresenter
    lateinit var presenter: RvScreenPresenterImpl

    private var adapter: ImageRvAdapter? = null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_recycler_view, container, false)
    }

    override fun initActionBar() {
    }

    override fun initView() {
    }

    override fun initRecyclerView() {
        context?.let {
            val recyclerViewManager = LinearLayoutManager(it, RecyclerView.VERTICAL, false)
            recyclerView.layoutManager = recyclerViewManager
            adapter = ImageRvAdapter(presenter.getListPresenter())
            recyclerView.adapter = adapter
        }
    }

    override fun updateList() {
        adapter?.notifyDataSetChanged()
    }
}