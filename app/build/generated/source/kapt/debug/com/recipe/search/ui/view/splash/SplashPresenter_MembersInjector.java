package com.recipe.search.ui.view.splash;

import android.content.Context;
import com.recipe.search.base.BasePresenter_MembersInjector;
import com.recipe.search.rx.AppSchedulerProvider;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SplashPresenter_MembersInjector implements MembersInjector<SplashPresenter> {
  private final Provider<AppSchedulerProvider> appSchedulerProvider;

  private final Provider<Context> contextProvider;

  public SplashPresenter_MembersInjector(
      Provider<AppSchedulerProvider> appSchedulerProvider, Provider<Context> contextProvider) {
    this.appSchedulerProvider = appSchedulerProvider;
    this.contextProvider = contextProvider;
  }

  public static MembersInjector<SplashPresenter> create(
      Provider<AppSchedulerProvider> appSchedulerProvider, Provider<Context> contextProvider) {
    return new SplashPresenter_MembersInjector(appSchedulerProvider, contextProvider);
  }

  @Override
  public void injectMembers(SplashPresenter instance) {
    BasePresenter_MembersInjector.injectAppSchedulerProvider(instance, appSchedulerProvider.get());
    BasePresenter_MembersInjector.injectContext(instance, contextProvider.get());
  }
}
