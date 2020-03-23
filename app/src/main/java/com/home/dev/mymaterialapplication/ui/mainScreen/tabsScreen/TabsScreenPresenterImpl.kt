package com.home.dev.mymaterialapplication.ui.mainScreen.tabsScreen

import com.arellomobile.mvp.InjectViewState
import com.home.dev.mymaterialapplication.mvp.presenter.BasePresenterAbs

@InjectViewState
class TabsScreenPresenterImpl: BasePresenterAbs<ITabsScreenView>(), ITabsScreenPresenter {
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        viewState.initTabs()
    }
}