package com.recipe.search.ui.view.auth.signUp;

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
public final class SignUpPresenter_MembersInjector implements MembersInjector<SignUpPresenter> {
  private final Provider<AppSchedulerProvider> appSchedulerProvider;

  private final Provider<Context> contextProvider;

  public SignUpPresenter_MembersInjector(
      Provider<AppSchedulerProvider> appSchedulerProvider, Provider<Context> contextProvider) {
    this.appSchedulerProvider = appSchedulerProvider;
    this.contextProvider = contextProvider;
  }

  public static MembersInjector<SignUpPresenter> create(
      Provider<AppSchedulerProvider> appSchedulerProvider, Provider<Context> contextProvider) {
    return new SignUpPresenter_MembersInjector(appSchedulerProvider, contextProvider);
  }

  @Override
  public void injectMembers(SignUpPresenter instance) {
    BasePresenter_MembersInjector.injectAppSchedulerProvider(instance, appSchedulerProvider.get());
    BasePresenter_MembersInjector.injectContext(instance, contextProvider.get());
  }
}
