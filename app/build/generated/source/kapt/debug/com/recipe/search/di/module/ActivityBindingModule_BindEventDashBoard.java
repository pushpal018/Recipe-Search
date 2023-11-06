package com.recipe.search.di.module;

import com.recipe.search.di.scope.ActivityScope;
import com.recipe.search.ui.view.dashboard.DashBoardActivity;
import com.recipe.search.ui.view.dashboard.DashBoardViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = ActivityBindingModule_BindEventDashBoard.DashBoardActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBindingModule_BindEventDashBoard {
  private ActivityBindingModule_BindEventDashBoard() {}

  @Binds
  @IntoMap
  @ClassKey(DashBoardActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DashBoardActivitySubcomponent.Builder builder);

  @Subcomponent(modules = DashBoardViewModel.class)
  @ActivityScope
  public interface DashBoardActivitySubcomponent extends AndroidInjector<DashBoardActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DashBoardActivity> {}
  }
}
