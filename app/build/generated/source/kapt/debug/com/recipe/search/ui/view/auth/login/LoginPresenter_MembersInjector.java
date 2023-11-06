package com.recipe.search.ui.view.auth.login;

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
public final class LoginPresenter_MembersInjector implements MembersInjector<LoginPresenter> {
  private final Provider<AppSchedulerProvider> appSchedulerProvider;

  private final Provider<Context> contextProvider;

  public LoginPresenter_MembersInjector(
      Provider<AppSchedulerProvider> appSchedulerProvider, Provider<Context> contextProvider) {
    this.appSchedulerProvider = appSchedulerProvider;
    this.contextProvider = contextProvider;
  }

  public static MembersInjector<LoginPresenter> create(
      Provider<AppSchedulerProvider> appSchedulerProvider, Provider<Context> contextProvider) {
    return new LoginPresenter_MembersInjector(appSchedulerProvider, contextProvider);
  }

  @Override
  public void injectMembers(LoginPresenter instance) {
    BasePresenter_MembersInjector.injectAppSchedulerProvider(instance, appSchedulerProvider.get());
    BasePresenter_MembersInjector.injectContext(instance, contextProvider.get());
  }
}
