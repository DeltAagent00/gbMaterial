package com.home.dev.mymaterialapplication.ui.mainScreen.fruitScreen;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.ViewStateProvider;
import com.arellomobile.mvp.viewstate.MvpViewState;
import java.lang.Override;

public class IFruitScreenPresenterImpl$$ViewStateProvider extends ViewStateProvider {
	@Override
	public MvpViewState<? extends MvpView> getViewState() {
		return new IFruitScreenView$$State();
	}
}
