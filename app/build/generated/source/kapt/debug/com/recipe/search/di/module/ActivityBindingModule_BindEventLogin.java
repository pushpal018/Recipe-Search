package com.recipe.search.di.module;

import com.recipe.search.di.scope.ActivityScope;
import com.recipe.search.ui.view.auth.login.LoginActivity;
import com.recipe.search.ui.view.auth.login.LoginViewModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(subcomponents = ActivityBindingModule_BindEventLogin.LoginActivitySubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBindingModule_BindEventLogin {
  private ActivityBindingModule_BindEventLogin() {}

  @Binds
  @IntoMap
  @ClassKey(LoginActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LoginActivitySubcomponent.Builder builder);

  @Subcomponent(modules = LoginViewModule.class)
  @ActivityScope
  public interface LoginActivitySubcomponent extends AndroidInjector<LoginActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LoginActivity> {}
  }
}
