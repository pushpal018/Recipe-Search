package com.recipe.search.di.module;

import com.recipe.search.di.scope.ActivityScope;
import com.recipe.search.ui.view.splash.SplashScreenActivity;
import com.recipe.search.ui.view.splash.SplashViewModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      ActivityBindingModule_BindEventSplashActivity.SplashScreenActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBindingModule_BindEventSplashActivity {
  private ActivityBindingModule_BindEventSplashActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SplashScreenActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SplashScreenActivitySubcomponent.Builder builder);

  @Subcomponent(modules = SplashViewModule.class)
  @ActivityScope
  public interface SplashScreenActivitySubcomponent extends AndroidInjector<SplashScreenActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SplashScreenActivity> {}
  }
}
