package com.home.dev.mymaterialapplication.ui.mainScreen.fruitScreen;

import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import java.lang.Override;
import java.util.ArrayList;
import java.util.List;

public class FruitScreenFragmentImpl$$PresentersBinder extends PresenterBinder<FruitScreenFragmentImpl> {
	@Override
	public List<PresenterField<FruitScreenFragmentImpl>> getPresenterFields() {
		List<PresenterField<FruitScreenFragmentImpl>> presenters = new ArrayList<>(1);
		presenters.add(new presenterBinder());
		return presenters;
	}

	public class presenterBinder extends PresenterField<FruitScreenFragmentImpl> {
		public presenterBinder() {
			super("presenter", null, IFruitScreenPresenterImpl.class);
		}

		@Override
		public void bind(FruitScreenFragmentImpl target, MvpPresenter presenter) {
			target.presenter = (IFruitScreenPresenterImpl) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(FruitScreenFragmentImpl delegated) {
			return new IFruitScreenPresenterImpl();
		}
	}
}
