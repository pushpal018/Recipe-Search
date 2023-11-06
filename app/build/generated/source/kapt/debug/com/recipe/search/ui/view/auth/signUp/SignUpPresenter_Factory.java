package com.recipe.search.ui.view.auth.signUp;

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
public final class SignUpPresenter_Factory implements Factory<SignUpPresenter> {
  private final Provider<SignUpContract.View> viewProvider;

  private final Provider<AppSchedulerProvider> appSchedulerProvider;

  private final Provider<Context> contextProvider;

  public SignUpPresenter_Factory(
      Provider<SignUpContract.View> viewProvider,
      Provider<AppSchedulerProvider> appSchedulerProvider,
      Provider<Context> contextProvider) {
    this.viewProvider = viewProvider;
    this.appSchedulerProvider = appSchedulerProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public SignUpPresenter get() {
    SignUpPresenter instance = new SignUpPresenter(viewProvider.get());
    BasePresenter_MembersInjector.injectAppSchedulerProvider(instance, appSchedulerProvider.get());
    BasePresenter_MembersInjector.injectContext(instance, contextProvider.get());
    return instance;
  }

  public static SignUpPresenter_Factory create(
      Provider<SignUpContract.View> viewProvider,
      Provider<AppSchedulerProvider> appSchedulerProvider,
      Provider<Context> contextProvider) {
    return new SignUpPresenter_Factory(viewProvider, appSchedulerProvider, contextProvider);
  }

  public static SignUpPresenter newSignUpPresenter(SignUpContract.View view) {
    return new SignUpPresenter(view);
  }
}
