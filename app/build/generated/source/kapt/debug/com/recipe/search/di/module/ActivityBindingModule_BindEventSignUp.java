package com.recipe.search.di.module;

import com.recipe.search.di.scope.ActivityScope;
import com.recipe.search.ui.view.auth.signUp.SignUpActivity;
import com.recipe.search.ui.view.auth.signUp.SignUpViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(subcomponents = ActivityBindingModule_BindEventSignUp.SignUpActivitySubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBindingModule_BindEventSignUp {
  private ActivityBindingModule_BindEventSignUp() {}

  @Binds
  @IntoMap
  @ClassKey(SignUpActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SignUpActivitySubcomponent.Builder builder);

  @Subcomponent(modules = SignUpViewModel.class)
  @ActivityScope
  public interface SignUpActivitySubcomponent extends AndroidInjector<SignUpActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SignUpActivity> {}
  }
}
