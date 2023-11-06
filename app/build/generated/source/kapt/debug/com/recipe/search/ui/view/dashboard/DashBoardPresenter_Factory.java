package com.recipe.search.ui.view.dashboard;

import android.content.Context;
import com.recipe.search.base.BasePresenter_MembersInjector;
import com.recipe.search.rx.AppSchedulerProvider;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DashBoardPresenter_Factory implements Factory<DashBoardPresenter> {
  private final Provider<DashBoardContract.View> viewProvider;

  private final Provider<AppSchedulerProvider> appSchedulerProvider;

  private final Provider<Context> contextProvider;

  public DashBoardPresenter_Factory(
      Provider<DashBoardContract.View> viewProvider,
      Provider<AppSchedulerProvider> appSchedulerProvider,
      Provider<Context> contextProvider) {
    this.viewProvider = viewProvider;
    this.appSchedulerProvider = appSchedulerProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public DashBoardPresenter get() {
    DashBoardPresenter instance = new DashBoardPresenter(viewProvider.get());
    BasePresenter_MembersInjector.injectAppSchedulerProvider(instance, appSchedulerProvider.get());
    BasePresenter_MembersInjector.injectContext(instance, contextProvider.get());
    return instance;
  }

  public static DashBoardPresenter_Factory create(
      Provider<DashBoardContract.View> viewProvider,
      Provider<AppSchedulerProvider> appSchedulerProvider,
      Provider<Context> contextProvider) {
    return new DashBoardPresenter_Factory(viewProvider, appSchedulerProvider, contextProvider);
  }

  public static DashBoardPresenter newDashBoardPresenter(DashBoardContract.View view) {
    return new DashBoardPresenter(view);
  }
}
