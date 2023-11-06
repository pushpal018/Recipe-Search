package com.recipe.search.base;

import android.content.Context;
import com.recipe.search.rx.AppSchedulerProvider;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BasePresenter_MembersInjector<V extends BaseContract.View>
    implements MembersInjector<BasePresenter<V>> {
  private final Provider<AppSchedulerProvider> appSchedulerProvider;

  private final Provider<Context> contextProvider;

  public BasePresenter_MembersInjector(
      Provider<AppSchedulerProvider> appSchedulerProvider, Provider<Context> contextProvider) {
    this.appSchedulerProvider = appSchedulerProvider;
    this.contextProvider = contextProvider;
  }

  public static <V extends BaseContract.View> MembersInjector<BasePresenter<V>> create(
      Provider<AppSchedulerProvider> appSchedulerProvider, Provider<Context> contextProvider) {
    return new BasePresenter_MembersInjector<V>(appSchedulerProvider, contextProvider);
  }

  @Override
  public void injectMembers(BasePresenter<V> instance) {
    injectAppSchedulerProvider(instance, appSchedulerProvider.get());
    injectContext(instance, contextProvider.get());
  }

  public static <V extends BaseContract.View> void injectAppSchedulerProvider(
      BasePresenter<V> instance, AppSchedulerProvider appSchedulerProvider) {
    instance.appSchedulerProvider = appSchedulerProvider;
  }

  public static <V extends BaseContract.View> void injectContext(
      BasePresenter<V> instance, Context context) {
    instance.context = context;
  }
}
