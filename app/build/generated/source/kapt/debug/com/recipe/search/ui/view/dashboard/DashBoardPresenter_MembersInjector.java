package com.recipe.search.ui.view.dashboard;

import android.content.Context;
import com.recipe.search.base.BasePresenter_MembersInjector;
import com.recipe.search.data.network.api_service.SearchApiService;
import com.recipe.search.rx.AppSchedulerProvider;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DashBoardPresenter_MembersInjector
    implements MembersInjector<DashBoardPresenter> {
  private final Provider<AppSchedulerProvider> appSchedulerProvider;

  private final Provider<Context> contextProvider;

  private final Provider<SearchApiService> searchApiServiceProvider;

  public DashBoardPresenter_MembersInjector(
      Provider<AppSchedulerProvider> appSchedulerProvider,
      Provider<Context> contextProvider,
      Provider<SearchApiService> searchApiServiceProvider) {
    this.appSchedulerProvider = appSchedulerProvider;
    this.contextProvider = contextProvider;
    this.searchApiServiceProvider = searchApiServiceProvider;
  }

  public static MembersInjector<DashBoardPresenter> create(
      Provider<AppSchedulerProvider> appSchedulerProvider,
      Provider<Context> contextProvider,
      Provider<SearchApiService> searchApiServiceProvider) {
    return new DashBoardPresenter_MembersInjector(
        appSchedulerProvider, contextProvider, searchApiServiceProvider);
  }

  @Override
  public void injectMembers(DashBoardPresenter instance) {
    BasePresenter_MembersInjector.injectAppSchedulerProvider(instance, appSchedulerProvider.get());
    BasePresenter_MembersInjector.injectContext(instance, contextProvider.get());
    injectSearchApiService(instance, searchApiServiceProvider.get());
  }

  public static void injectSearchApiService(
      DashBoardPresenter instance, SearchApiService searchApiService) {
    instance.searchApiService = searchApiService;
  }
}
