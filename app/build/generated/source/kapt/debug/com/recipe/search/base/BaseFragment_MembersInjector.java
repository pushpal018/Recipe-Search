package com.recipe.search.base;

import com.recipe.search.data.prefs.PreferenceManager;
import com.recipe.search.utils.AppLogger;
import com.recipe.search.utils.MyAlertService;
import com.recipe.search.utils.NetworkUtils;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseFragment_MembersInjector<P extends BaseContract.Presenter>
    implements MembersInjector<BaseFragment<P>> {
  private final Provider<P> mPresenterProvider;

  private final Provider<MyAlertService> mAlertServiceProvider;

  private final Provider<NetworkUtils> mNetworkUtilsProvider;

  private final Provider<AppLogger> mAppLoggerProvider;

  private final Provider<PreferenceManager> mPrefManagerProvider;

  public BaseFragment_MembersInjector(
      Provider<P> mPresenterProvider,
      Provider<MyAlertService> mAlertServiceProvider,
      Provider<NetworkUtils> mNetworkUtilsProvider,
      Provider<AppLogger> mAppLoggerProvider,
      Provider<PreferenceManager> mPrefManagerProvider) {
    this.mPresenterProvider = mPresenterProvider;
    this.mAlertServiceProvider = mAlertServiceProvider;
    this.mNetworkUtilsProvider = mNetworkUtilsProvider;
    this.mAppLoggerProvider = mAppLoggerProvider;
    this.mPrefManagerProvider = mPrefManagerProvider;
  }

  public static <P extends BaseContract.Presenter> MembersInjector<BaseFragment<P>> create(
      Provider<P> mPresenterProvider,
      Provider<MyAlertService> mAlertServiceProvider,
      Provider<NetworkUtils> mNetworkUtilsProvider,
      Provider<AppLogger> mAppLoggerProvider,
      Provider<PreferenceManager> mPrefManagerProvider) {
    return new BaseFragment_MembersInjector<P>(
        mPresenterProvider,
        mAlertServiceProvider,
        mNetworkUtilsProvider,
        mAppLoggerProvider,
        mPrefManagerProvider);
  }

  @Override
  public void injectMembers(BaseFragment<P> instance) {
    injectMPresenter(instance, mPresenterProvider.get());
    injectMAlertService(instance, mAlertServiceProvider.get());
    injectMNetworkUtils(instance, mNetworkUtilsProvider.get());
    injectMAppLogger(instance, mAppLoggerProvider.get());
    injectMPrefManager(instance, mPrefManagerProvider.get());
  }

  public static <P extends BaseContract.Presenter> void injectMPresenter(
      BaseFragment<P> instance, P mPresenter) {
    instance.mPresenter = mPresenter;
  }

  public static <P extends BaseContract.Presenter> void injectMAlertService(
      BaseFragment<P> instance, MyAlertService mAlertService) {
    instance.mAlertService = mAlertService;
  }

  public static <P extends BaseContract.Presenter> void injectMNetworkUtils(
      BaseFragment<P> instance, NetworkUtils mNetworkUtils) {
    instance.mNetworkUtils = mNetworkUtils;
  }

  public static <P extends BaseContract.Presenter> void injectMAppLogger(
      BaseFragment<P> instance, AppLogger mAppLogger) {
    instance.mAppLogger = mAppLogger;
  }

  public static <P extends BaseContract.Presenter> void injectMPrefManager(
      BaseFragment<P> instance, PreferenceManager mPrefManager) {
    instance.mPrefManager = mPrefManager;
  }
}
