package com.recipe.search.base;

import android.app.Activity;
import com.recipe.search.data.prefs.PreferenceManager;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseApplication_MembersInjector implements MembersInjector<BaseApplication> {
  private final Provider<DispatchingAndroidInjector<Activity>> mActivityInjectorProvider;

  private final Provider<PreferenceManager> mPrefManagerProvider;

  public BaseApplication_MembersInjector(
      Provider<DispatchingAndroidInjector<Activity>> mActivityInjectorProvider,
      Provider<PreferenceManager> mPrefManagerProvider) {
    this.mActivityInjectorProvider = mActivityInjectorProvider;
    this.mPrefManagerProvider = mPrefManagerProvider;
  }

  public static MembersInjector<BaseApplication> create(
      Provider<DispatchingAndroidInjector<Activity>> mActivityInjectorProvider,
      Provider<PreferenceManager> mPrefManagerProvider) {
    return new BaseApplication_MembersInjector(mActivityInjectorProvider, mPrefManagerProvider);
  }

  @Override
  public void injectMembers(BaseApplication instance) {
    injectMActivityInjector(instance, mActivityInjectorProvider.get());
    injectMPrefManager(instance, mPrefManagerProvider.get());
  }

  public static void injectMActivityInjector(
      BaseApplication instance, DispatchingAndroidInjector<Activity> mActivityInjector) {
    instance.mActivityInjector = mActivityInjector;
  }

  public static void injectMPrefManager(BaseApplication instance, PreferenceManager mPrefManager) {
    instance.mPrefManager = mPrefManager;
  }
}
