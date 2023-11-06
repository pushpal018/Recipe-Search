package com.recipe.search.base;

import androidx.fragment.app.Fragment;
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
public final class MvpBaseActivity_MembersInjector<P extends BaseContract.Presenter>
    implements MembersInjector<MvpBaseActivity<P>> {
  private final Provider<DispatchingAndroidInjector<Fragment>> mFragmentInjectorProvider;

  private final Provider<P> mPresenterProvider;

  private final Provider<MyAlertService> mAlertServiceProvider;

  private final Provider<NetworkUtils> mNetworkUtilsProvider;

  private final Provider<AppLogger> mAppLoggerProvider;

  private final Provider<PreferenceManager> mPrefManagerProvider;

  public MvpBaseActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> mFragmentInjectorProvider,
      Provider<P> mPresenterProvider,
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

  public static <P extends BaseContract.Presenter> MembersInjector<MvpBaseActivity<P>> create(
      Provider<DispatchingAndroidInjector<Fragment>> mFragmentInjectorProvider,
      Provider<P> mPresenterProvider,
      Provider<MyAlertService> mAlertServiceProvider,
      Provider<NetworkUtils> mNetworkUtilsProvider,
      Provider<AppLogger> mAppLoggerProvider,
      Provider<PreferenceManager> mPrefManagerProvider) {
    return new MvpBaseActivity_MembersInjector<P>(
        mFragmentInjectorProvider,
        mPresenterProvider,
        mAlertServiceProvider,
        mNetworkUtilsProvider,
        mAppLoggerProvider,
        mPrefManagerProvider);
  }

  @Override
  public void injectMembers(MvpBaseActivity<P> instance) {
    injectMFragmentInjector(instance, mFragmentInjectorProvider.get());
    injectMPresenter(instance, mPresenterProvider.get());
    injectMAlertService(instance, mAlertServiceProvider.get());
    injectMNetworkUtils(instance, mNetworkUtilsProvider.get());
    injectMAppLogger(instance, mAppLoggerProvider.get());
    injectMPrefManager(instance, mPrefManagerProvider.get());
  }

  public static <P extends BaseContract.Presenter> void injectMFragmentInjector(
      MvpBaseActivity<P> instance, DispatchingAndroidInjector<Fragment> mFragmentInjector) {
    instance.mFragmentInjector = mFragmentInjector;
  }

  public static <P extends BaseContract.Presenter> void injectMPresenter(
      MvpBaseActivity<P> instance, P mPresenter) {
    instance.mPresenter = mPresenter;
  }

  public static <P extends BaseContract.Presenter> void injectMAlertService(
      MvpBaseActivity<P> instance, MyAlertService mAlertService) {
    instance.mAlertService = mAlertService;
  }

  public static <P extends BaseContract.Presenter> void injectMNetworkUtils(
      MvpBaseActivity<P> instance, NetworkUtils mNetworkUtils) {
    instance.mNetworkUtils = mNetworkUtils;
  }

  public static <P extends BaseContract.Presenter> void injectMAppLogger(
      MvpBaseActivity<P> instance, AppLogger mAppLogger) {
    instance.mAppLogger = mAppLogger;
  }

  public static <P extends BaseContract.Presenter> void injectMPrefManager(
      MvpBaseActivity<P> instance, PreferenceManager mPrefManager) {
    instance.mPrefManager = mPrefManager;
  }
}
