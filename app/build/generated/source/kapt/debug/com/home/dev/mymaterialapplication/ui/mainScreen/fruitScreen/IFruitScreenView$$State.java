package com.home.dev.mymaterialapplication.ui.mainScreen.fruitScreen;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy;
import java.lang.Override;

public class IFruitScreenView$$State extends MvpViewState<IFruitScreenView> implements IFruitScreenView {
	@Override
	public void initActionBar() {
		InitActionBarCommand initActionBarCommand = new InitActionBarCommand();
		mViewCommands.beforeApply(initActionBarCommand);

		if (hasNotView()) {
			return;
		}

		for (IFruitScreenView view : mViews) {
			view.initActionBar();
		}

		mViewCommands.afterApply(initActionBarCommand);
	}

	@Override
	public void initView() {
		InitViewCommand initViewCommand = new InitViewCommand();
		mViewCommands.beforeApply(initViewCommand);

		if (hasNotView()) {
			return;
		}

		for (IFruitScreenView view : mViews) {
			view.initView();
		}

		mViewCommands.afterApply(initViewCommand);
	}

	@Override
	public void enableProgress(boolean enabled) {
		EnableProgressCommand enableProgressCommand = new EnableProgressCommand(enabled);
		mViewCommands.beforeApply(enableProgressCommand);

		if (hasNotView()) {
			return;
		}

		for (IFruitScreenView view : mViews) {
			view.enableProgress(enabled);
		}

		mViewCommands.afterApply(enableProgressCommand);
	}

	@Override
	public void closeScreen() {
		CloseScreenCommand closeScreenCommand = new CloseScreenCommand();
		mViewCommands.beforeApply(closeScreenCommand);

		if (hasNotView()) {
			return;
		}

		for (IFruitScreenView view : mViews) {
			view.closeScreen();
		}

		mViewCommands.afterApply(closeScreenCommand);
	}

	public class InitActionBarCommand extends ViewCommand<IFruitScreenView> {
		InitActionBarCommand() {
			super("initActionBar", OneExecutionStateStrategy.class);
		}

		@Override
		public void apply(IFruitScreenView mvpView) {
			mvpView.initActionBar();
		}
	}

	public class InitViewCommand extends ViewCommand<IFruitScreenView> {
		InitViewCommand() {
			super("initView", OneExecutionStateStrategy.class);
		}

		@Override
		public void apply(IFruitScreenView mvpView) {
			mvpView.initView();
		}
	}

	public class EnableProgressCommand extends ViewCommand<IFruitScreenView> {
		public final boolean enabled;

		EnableProgressCommand(boolean enabled) {
			super("enableProgress", OneExecutionStateStrategy.class);

			this.enabled = enabled;
		}

		@Override
		public void apply(IFruitScreenView mvpView) {
			mvpView.enableProgress(enabled);
		}
	}

	public class CloseScreenCommand extends ViewCommand<IFruitScreenView> {
		CloseScreenCommand() {
			super("closeScreen", OneExecutionStateStrategy.class);
		}

		@Override
		public void apply(IFruitScreenView mvpView) {
			mvpView.closeScreen();
		}
	}
}
