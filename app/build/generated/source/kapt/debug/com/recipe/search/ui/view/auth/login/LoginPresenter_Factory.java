package com.recipe.search.ui.view.auth.login;

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
public final class LoginPresenter_Factory implements Factory<LoginPresenter> {
  private final Provider<LoginContract.View> viewProvider;

  private final Provider<AppSchedulerProvider> appSchedulerProvider;

  private final Provider<Context> contextProvider;

  public LoginPresenter_Factory(
      Provider<LoginContract.View> viewProvider,
      Provider<AppSchedulerProvider> appSchedulerProvider,
      Provider<Context> contextProvider) {
    this.viewProvider = viewProvider;
    this.appSchedulerProvider = appSchedulerProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public LoginPresenter get() {
    LoginPresenter instance = new LoginPresenter(viewProvider.get());
    BasePresenter_MembersInjector.injectAppSchedulerProvider(instance, appSchedulerProvider.get());
    BasePresenter_MembersInjector.injectContext(instance, contextProvider.get());
    return instance;
  }

  public static LoginPresenter_Factory create(
      Provider<LoginContract.View> viewProvider,
      Provider<AppSchedulerProvider> appSchedulerProvider,
      Provider<Context> contextProvider) {
    return new LoginPresenter_Factory(viewProvider, appSchedulerProvider, contextProvider);
  }

  public static LoginPresenter newLoginPresenter(LoginContract.View view) {
    return new LoginPresenter(view);
  }
}
