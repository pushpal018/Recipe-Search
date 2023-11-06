package com.recipe.search.di.component;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.recipe.search.base.BaseApplication;
import com.recipe.search.base.BaseApplication_MembersInjector;
import com.recipe.search.base.BasePresenter_MembersInjector;
import com.recipe.search.base.MvpBaseActivity_MembersInjector;
import com.recipe.search.data.prefs.PreferenceManager;
import com.recipe.search.di.module.ActivityBindingModule_BindEventDashBoard;
import com.recipe.search.di.module.ActivityBindingModule_BindEventLogin;
import com.recipe.search.di.module.ActivityBindingModule_BindEventSignUp;
import com.recipe.search.di.module.ActivityBindingModule_BindEventSplashActivity;
import com.recipe.search.di.module.ApplicationModule;
import com.recipe.search.di.module.ApplicationModule_ProvideAlertServiceFactory;
import com.recipe.search.di.module.ApplicationModule_ProvideAppLoggerFactory;
import com.recipe.search.di.module.ApplicationModule_ProvideAppScheduleFactory;
import com.recipe.search.di.module.ApplicationModule_ProvideContextFactory;
import com.recipe.search.di.module.ApplicationModule_ProvideNetworkUtilsFactory;
import com.recipe.search.di.module.ApplicationModule_ProvidePreferenceManagerFactory;
import com.recipe.search.rx.AppSchedulerProvider;
import com.recipe.search.ui.view.auth.login.LoginActivity;
import com.recipe.search.ui.view.auth.login.LoginPresenter;
import com.recipe.search.ui.view.auth.login.LoginPresenter_Factory;
import com.recipe.search.ui.view.auth.signUp.SignUpActivity;
import com.recipe.search.ui.view.auth.signUp.SignUpPresenter;
import com.recipe.search.ui.view.auth.signUp.SignUpPresenter_Factory;
import com.recipe.search.ui.view.dashboard.DashBoardActivity;
import com.recipe.search.ui.view.dashboard.DashBoardPresenter;
import com.recipe.search.ui.view.dashboard.DashBoardPresenter_Factory;
import com.recipe.search.ui.view.splash.SplashPresenter;
import com.recipe.search.ui.view.splash.SplashPresenter_Factory;
import com.recipe.search.ui.view.splash.SplashScreenActivity;
import com.recipe.search.utils.AppLogger;
import com.recipe.search.utils.MyAlertService;
import com.recipe.search.utils.NetworkUtils;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private final BaseApplication application;

  private final ApplicationModule applicationModule;

  private Provider<
          ActivityBindingModule_BindEventSplashActivity.SplashScreenActivitySubcomponent.Builder>
      splashScreenActivitySubcomponentBuilderProvider;

  private Provider<ActivityBindingModule_BindEventDashBoard.DashBoardActivitySubcomponent.Builder>
      dashBoardActivitySubcomponentBuilderProvider;

  private Provider<ActivityBindingModule_BindEventLogin.LoginActivitySubcomponent.Builder>
      loginActivitySubcomponentBuilderProvider;

  private Provider<ActivityBindingModule_BindEventSignUp.SignUpActivitySubcomponent.Builder>
      signUpActivitySubcomponentBuilderProvider;

  private Provider<BaseApplication> applicationProvider;

  private Provider<Context> provideContextProvider;

  private Provider<PreferenceManager> providePreferenceManagerProvider;

  private Provider<AppSchedulerProvider> provideAppScheduleProvider;

  private Provider<MyAlertService> provideAlertServiceProvider;

  private Provider<NetworkUtils> provideNetworkUtilsProvider;

  private Provider<AppLogger> provideAppLoggerProvider;

  private DaggerAppComponent(
      ApplicationModule applicationModuleParam, BaseApplication applicationParam) {
    this.application = applicationParam;
    this.applicationModule = applicationModuleParam;
    initialize(applicationModuleParam, applicationParam);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return ImmutableMap.<Class<?>, Provider<AndroidInjector.Factory<?>>>of(
        SplashScreenActivity.class,
        (Provider) splashScreenActivitySubcomponentBuilderProvider,
        DashBoardActivity.class,
        (Provider) dashBoardActivitySubcomponentBuilderProvider,
        LoginActivity.class,
        (Provider) loginActivitySubcomponentBuilderProvider,
        SignUpActivity.class,
        (Provider) signUpActivitySubcomponentBuilderProvider);
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        ImmutableMap.<String, Provider<AndroidInjector.Factory<?>>>of());
  }

  private Context getContext() {
    return ApplicationModule_ProvideContextFactory.proxyProvideContext(
        applicationModule, application);
  }

  @SuppressWarnings("unchecked")
  private void initialize(
      final ApplicationModule applicationModuleParam, final BaseApplication applicationParam) {
    this.splashScreenActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBindingModule_BindEventSplashActivity.SplashScreenActivitySubcomponent
                .Builder>() {
          @Override
          public ActivityBindingModule_BindEventSplashActivity.SplashScreenActivitySubcomponent
                  .Builder
              get() {
            return new SplashScreenActivitySubcomponentBuilder();
          }
        };
    this.dashBoardActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBindingModule_BindEventDashBoard.DashBoardActivitySubcomponent.Builder>() {
          @Override
          public ActivityBindingModule_BindEventDashBoard.DashBoardActivitySubcomponent.Builder
              get() {
            return new DashBoardActivitySubcomponentBuilder();
          }
        };
    this.loginActivitySubcomponentBuilderProvider =
        new Provider<ActivityBindingModule_BindEventLogin.LoginActivitySubcomponent.Builder>() {
          @Override
          public ActivityBindingModule_BindEventLogin.LoginActivitySubcomponent.Builder get() {
            return new LoginActivitySubcomponentBuilder();
          }
        };
    this.signUpActivitySubcomponentBuilderProvider =
        new Provider<ActivityBindingModule_BindEventSignUp.SignUpActivitySubcomponent.Builder>() {
          @Override
          public ActivityBindingModule_BindEventSignUp.SignUpActivitySubcomponent.Builder get() {
            return new SignUpActivitySubcomponentBuilder();
          }
        };
    this.applicationProvider = InstanceFactory.create(applicationParam);
    this.provideContextProvider =
        ApplicationModule_ProvideContextFactory.create(applicationModuleParam, applicationProvider);
    this.providePreferenceManagerProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvidePreferenceManagerFactory.create(
                applicationModuleParam, provideContextProvider));
    this.provideAppScheduleProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideAppScheduleFactory.create(applicationModuleParam));
    this.provideAlertServiceProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideAlertServiceFactory.create(applicationModuleParam));
    this.provideNetworkUtilsProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideNetworkUtilsFactory.create(applicationModuleParam));
    this.provideAppLoggerProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideAppLoggerFactory.create(applicationModuleParam));
  }

  @Override
  public void inject(BaseApplication app) {
    injectBaseApplication(app);
  }

  @CanIgnoreReturnValue
  private BaseApplication injectBaseApplication(BaseApplication instance) {
    BaseApplication_MembersInjector.injectMActivityInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    BaseApplication_MembersInjector.injectMPrefManager(
        instance, providePreferenceManagerProvider.get());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private ApplicationModule applicationModule;

    private BaseApplication application;

    @Override
    public Builder application(BaseApplication application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }

    @Override
    public AppComponent build() {
      if (applicationModule == null) {
        this.applicationModule = new ApplicationModule();
      }
      Preconditions.checkBuilderRequirement(application, BaseApplication.class);
      return new DaggerAppComponent(applicationModule, application);
    }
  }

  private final class SplashScreenActivitySubcomponentBuilder
      extends ActivityBindingModule_BindEventSplashActivity.SplashScreenActivitySubcomponent
          .Builder {
    private SplashScreenActivity seedInstance;

    @Override
    public void seedInstance(SplashScreenActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }

    @Override
    public ActivityBindingModule_BindEventSplashActivity.SplashScreenActivitySubcomponent build() {
      Preconditions.checkBuilderRequirement(seedInstance, SplashScreenActivity.class);
      return new SplashScreenActivitySubcomponentImpl(seedInstance);
    }
  }

  private final class SplashScreenActivitySubcomponentImpl
      implements ActivityBindingModule_BindEventSplashActivity.SplashScreenActivitySubcomponent {
    private final SplashScreenActivity seedInstance;

    private SplashScreenActivitySubcomponentImpl(SplashScreenActivity seedInstanceParam) {
      this.seedInstance = seedInstanceParam;
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          DaggerAppComponent.this.getMapOfClassOfAndProviderOfFactoryOf(),
          ImmutableMap.<String, Provider<AndroidInjector.Factory<?>>>of());
    }

    private SplashPresenter getSplashPresenter() {
      return injectSplashPresenter(SplashPresenter_Factory.newSplashPresenter(seedInstance));
    }

    @Override
    public void inject(SplashScreenActivity arg0) {
      injectSplashScreenActivity(arg0);
    }

    @CanIgnoreReturnValue
    private SplashPresenter injectSplashPresenter(SplashPresenter instance) {
      BasePresenter_MembersInjector.injectAppSchedulerProvider(
          instance, DaggerAppComponent.this.provideAppScheduleProvider.get());
      BasePresenter_MembersInjector.injectContext(instance, DaggerAppComponent.this.getContext());
      return instance;
    }

    @CanIgnoreReturnValue
    private SplashScreenActivity injectSplashScreenActivity(SplashScreenActivity instance) {
      MvpBaseActivity_MembersInjector.injectMFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      MvpBaseActivity_MembersInjector.injectMPresenter(instance, getSplashPresenter());
      MvpBaseActivity_MembersInjector.injectMAlertService(
          instance, DaggerAppComponent.this.provideAlertServiceProvider.get());
      MvpBaseActivity_MembersInjector.injectMNetworkUtils(
          instance, DaggerAppComponent.this.provideNetworkUtilsProvider.get());
      MvpBaseActivity_MembersInjector.injectMAppLogger(
          instance, DaggerAppComponent.this.provideAppLoggerProvider.get());
      MvpBaseActivity_MembersInjector.injectMPrefManager(
          instance, DaggerAppComponent.this.providePreferenceManagerProvider.get());
      return instance;
    }
  }

  private final class DashBoardActivitySubcomponentBuilder
      extends ActivityBindingModule_BindEventDashBoard.DashBoardActivitySubcomponent.Builder {
    private DashBoardActivity seedInstance;

    @Override
    public void seedInstance(DashBoardActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }

    @Override
    public ActivityBindingModule_BindEventDashBoard.DashBoardActivitySubcomponent build() {
      Preconditions.checkBuilderRequirement(seedInstance, DashBoardActivity.class);
      return new DashBoardActivitySubcomponentImpl(seedInstance);
    }
  }

  private final class DashBoardActivitySubcomponentImpl
      implements ActivityBindingModule_BindEventDashBoard.DashBoardActivitySubcomponent {
    private final DashBoardActivity seedInstance;

    private DashBoardActivitySubcomponentImpl(DashBoardActivity seedInstanceParam) {
      this.seedInstance = seedInstanceParam;
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          DaggerAppComponent.this.getMapOfClassOfAndProviderOfFactoryOf(),
          ImmutableMap.<String, Provider<AndroidInjector.Factory<?>>>of());
    }

    private DashBoardPresenter getDashBoardPresenter() {
      return injectDashBoardPresenter(
          DashBoardPresenter_Factory.newDashBoardPresenter(seedInstance));
    }

    @Override
    public void inject(DashBoardActivity arg0) {
      injectDashBoardActivity(arg0);
    }

    @CanIgnoreReturnValue
    private DashBoardPresenter injectDashBoardPresenter(DashBoardPresenter instance) {
      BasePresenter_MembersInjector.injectAppSchedulerProvider(
          instance, DaggerAppComponent.this.provideAppScheduleProvider.get());
      BasePresenter_MembersInjector.injectContext(instance, DaggerAppComponent.this.getContext());
      return instance;
    }

    @CanIgnoreReturnValue
    private DashBoardActivity injectDashBoardActivity(DashBoardActivity instance) {
      MvpBaseActivity_MembersInjector.injectMFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      MvpBaseActivity_MembersInjector.injectMPresenter(instance, getDashBoardPresenter());
      MvpBaseActivity_MembersInjector.injectMAlertService(
          instance, DaggerAppComponent.this.provideAlertServiceProvider.get());
      MvpBaseActivity_MembersInjector.injectMNetworkUtils(
          instance, DaggerAppComponent.this.provideNetworkUtilsProvider.get());
      MvpBaseActivity_MembersInjector.injectMAppLogger(
          instance, DaggerAppComponent.this.provideAppLoggerProvider.get());
      MvpBaseActivity_MembersInjector.injectMPrefManager(
          instance, DaggerAppComponent.this.providePreferenceManagerProvider.get());
      return instance;
    }
  }

  private final class LoginActivitySubcomponentBuilder
      extends ActivityBindingModule_BindEventLogin.LoginActivitySubcomponent.Builder {
    private LoginActivity seedInstance;

    @Override
    public void seedInstance(LoginActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }

    @Override
    public ActivityBindingModule_BindEventLogin.LoginActivitySubcomponent build() {
      Preconditions.checkBuilderRequirement(seedInstance, LoginActivity.class);
      return new LoginActivitySubcomponentImpl(seedInstance);
    }
  }

  private final class LoginActivitySubcomponentImpl
      implements ActivityBindingModule_BindEventLogin.LoginActivitySubcomponent {
    private final LoginActivity seedInstance;

    private LoginActivitySubcomponentImpl(LoginActivity seedInstanceParam) {
      this.seedInstance = seedInstanceParam;
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          DaggerAppComponent.this.getMapOfClassOfAndProviderOfFactoryOf(),
          ImmutableMap.<String, Provider<AndroidInjector.Factory<?>>>of());
    }

    private LoginPresenter getLoginPresenter() {
      return injectLoginPresenter(LoginPresenter_Factory.newLoginPresenter(seedInstance));
    }

    @Override
    public void inject(LoginActivity arg0) {
      injectLoginActivity(arg0);
    }

    @CanIgnoreReturnValue
    private LoginPresenter injectLoginPresenter(LoginPresenter instance) {
      BasePresenter_MembersInjector.injectAppSchedulerProvider(
          instance, DaggerAppComponent.this.provideAppScheduleProvider.get());
      BasePresenter_MembersInjector.injectContext(instance, DaggerAppComponent.this.getContext());
      return instance;
    }

    @CanIgnoreReturnValue
    private LoginActivity injectLoginActivity(LoginActivity instance) {
      MvpBaseActivity_MembersInjector.injectMFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      MvpBaseActivity_MembersInjector.injectMPresenter(instance, getLoginPresenter());
      MvpBaseActivity_MembersInjector.injectMAlertService(
          instance, DaggerAppComponent.this.provideAlertServiceProvider.get());
      MvpBaseActivity_MembersInjector.injectMNetworkUtils(
          instance, DaggerAppComponent.this.provideNetworkUtilsProvider.get());
      MvpBaseActivity_MembersInjector.injectMAppLogger(
          instance, DaggerAppComponent.this.provideAppLoggerProvider.get());
      MvpBaseActivity_MembersInjector.injectMPrefManager(
          instance, DaggerAppComponent.this.providePreferenceManagerProvider.get());
      return instance;
    }
  }

  private final class SignUpActivitySubcomponentBuilder
      extends ActivityBindingModule_BindEventSignUp.SignUpActivitySubcomponent.Builder {
    private SignUpActivity seedInstance;

    @Override
    public void seedInstance(SignUpActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }

    @Override
    public ActivityBindingModule_BindEventSignUp.SignUpActivitySubcomponent build() {
      Preconditions.checkBuilderRequirement(seedInstance, SignUpActivity.class);
      return new SignUpActivitySubcomponentImpl(seedInstance);
    }
  }

  private final class SignUpActivitySubcomponentImpl
      implements ActivityBindingModule_BindEventSignUp.SignUpActivitySubcomponent {
    private final SignUpActivity seedInstance;

    private SignUpActivitySubcomponentImpl(SignUpActivity seedInstanceParam) {
      this.seedInstance = seedInstanceParam;
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          DaggerAppComponent.this.getMapOfClassOfAndProviderOfFactoryOf(),
          ImmutableMap.<String, Provider<AndroidInjector.Factory<?>>>of());
    }

    private SignUpPresenter getSignUpPresenter() {
      return injectSignUpPresenter(SignUpPresenter_Factory.newSignUpPresenter(seedInstance));
    }

    @Override
    public void inject(SignUpActivity arg0) {
      injectSignUpActivity(arg0);
    }

    @CanIgnoreReturnValue
    private SignUpPresenter injectSignUpPresenter(SignUpPresenter instance) {
      BasePresenter_MembersInjector.injectAppSchedulerProvider(
          instance, DaggerAppComponent.this.provideAppScheduleProvider.get());
      BasePresenter_MembersInjector.injectContext(instance, DaggerAppComponent.this.getContext());
      return instance;
    }

    @CanIgnoreReturnValue
    private SignUpActivity injectSignUpActivity(SignUpActivity instance) {
      MvpBaseActivity_MembersInjector.injectMFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      MvpBaseActivity_MembersInjector.injectMPresenter(instance, getSignUpPresenter());
      MvpBaseActivity_MembersInjector.injectMAlertService(
          instance, DaggerAppComponent.this.provideAlertServiceProvider.get());
      MvpBaseActivity_MembersInjector.injectMNetworkUtils(
          instance, DaggerAppComponent.this.provideNetworkUtilsProvider.get());
      MvpBaseActivity_MembersInjector.injectMAppLogger(
          instance, DaggerAppComponent.this.provideAppLoggerProvider.get());
      MvpBaseActivity_MembersInjector.injectMPrefManager(
          instance, DaggerAppComponent.this.providePreferenceManagerProvider.get());
      return instance;
    }
  }
}
