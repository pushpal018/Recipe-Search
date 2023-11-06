package com.recipe.search.ui.view.splash;

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
public final class SplashPresenter_Factory implements Factory<SplashPresenter> {
  private final Provider<SplashContract.View> viewProvider;

  private final Provider<AppSchedulerProvider> appSchedulerProvider;

  private final Provider<Context> contextProvider;

  public SplashPresenter_Factory(
      Provider<SplashContract.View> viewProvider,
      Provider<AppSchedulerProvider> appSchedulerProvider,
      Provider<Context> contextProvider) {
    this.viewProvider = viewProvider;
    this.appSchedulerProvider = appSchedulerProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public SplashPresenter get() {
    SplashPresenter instance = new SplashPresenter(viewProvider.get());
    BasePresenter_MembersInjector.injectAppSchedulerProvider(instance, appSchedulerProvider.get());
    BasePresenter_MembersInjector.injectContext(instance, contextProvider.get());
    return instance;
  }

  public static SplashPresenter_Factory create(
      Provider<SplashContract.View> viewProvider,
      Provider<AppSchedulerProvider> appSchedulerProvider,
      Provider<Context> contextProvider) {
    return new SplashPresenter_Factory(viewProvider, appSchedulerProvider, contextProvider);
  }

  public static SplashPresenter newSplashPresenter(SplashContract.View view) {
    return new SplashPresenter(view);
  }
}
