package com.recipe.search.ui.view.auth.login;

import androidx.fragment.app.Fragment;
import com.recipe.search.base.MvpBaseActivity_MembersInjector;
import com.recipe.search.data.prefs.PreferenceManager;
import com.recipe.search.utils.AppLogger;
import com.recipe.search.utils.MyAlertService;
import com.recipe.search.utils.NetworkUtils;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> mFragmentInjectorProvider;

  private final Provider<LoginPresenter> mPresenterProvider;

  private final Provider<MyAlertService> mAlertServiceProvider;

  private final Provider<NetworkUtils> mNetworkUtilsProvider;

  private final Provider<AppLogger> mAppLoggerProvider;

  private final Provider<PreferenceManager> mPrefManagerProvider;

  public LoginActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> mFragmentInjectorProvider,
      Provider<LoginPresenter> mPresenterProvider,
      Provider<MyAlertService> mAlertServiceProvider,
      Provider<NetworkUtils> mNetworkUtilsProvider,
      Provider<AppLogger> mAppLoggerProvider,
      Provider<PreferenceManager> mPrefManagerProvider) {
    this.mFragmentInjectorProvider = mFragmentInjectorProvider;
    this.mPresenterProvider = mPresenterProvider;
    this.mAlertServiceProvider = mAlertServiceProvider;
    this.mNetworkUtilsProvider = mNetworkUtilsProvider;
    this.mAppLoggerProvider = mAppLoggerProvider;
    this.mPrefManagerProvider = mPrefManagerProvider;
  }

  public static MembersInjector<LoginActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> mFragmentInjectorProvider,
      Provider<LoginPresenter> mPresenterProvider,
      Provider<MyAlertService> mAlertServiceProvider,
      Provider<NetworkUtils> mNetworkUtilsProvider,
      Provider<AppLogger> mAppLoggerProvider,
      Provider<PreferenceManager> mPrefManagerProvider) {
    return new LoginActivity_MembersInjector(
        mFragmentInjectorProvider,
        mPresenterProvider,
        mAlertServiceProvider,
        mNetworkUtilsProvider,
        mAppLoggerProvider,
        mPrefManagerProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    MvpBaseActivity_MembersInjector.injectMFragmentInjector(
        instance, mFragmentInjectorProvider.get());
    MvpBaseActivity_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
    MvpBaseActivity_MembersInjector.injectMAlertService(instance, mAlertServiceProvider.get());
    MvpBaseActivity_MembersInjector.injectMNetworkUtils(instance, mNetworkUtilsProvider.get());
    MvpBaseActivity_MembersInjector.injectMAppLogger(instance, mAppLoggerProvider.get());
    MvpBaseActivity_MembersInjector.injectMPrefManager(instance, mPrefManagerProvider.get());
  }
}
