package com.home.dev.mymaterialapplication.ui.mainScreen.rvScreen

import com.arellomobile.mvp.InjectViewState
import com.home.dev.mymaterialapplication.mvp.presenter.BasePresenterAbs
import com.home.dev.mymaterialapplication.mvp.presenter.list.BaseListPresenter
import com.home.dev.mymaterialapplication.mvp.presenter.list.IImageListPresenter
import com.home.dev.mymaterialapplication.mvp.view.list.IImageListRowView

@InjectViewState
class RvScreenPresenterImpl: BasePresenterAbs<IRvScreenView>(), IRvScreenPresenter {
    private val imagePresenter = ImageListPresenterImpl()

    class ImageListPresenterImpl: BaseListPresenter<Int>(), IImageListPresenter {
        override fun bind(view: IImageListRowView) {
            val item = getItemByPosition(view.getPos())
            view.setImage(item)
        }

        override fun onClick(position: Int) {
        }
    }

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        viewState.initActionBar()
        viewState.initView()
        viewState.initRecyclerView()

        initListData()
    }

    private fun initListData() {
        imagePresenter.list.addAll(listOf(0, 1, 2, 3, 4, 5, 6, 7, 8))
        viewState.updateList()
    }

    override fun getListPresenter(): IImageListPresenter {
        return imagePresenter
    }
}