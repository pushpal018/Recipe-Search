package com.recipe.search.di.module;

import com.recipe.search.di.scope.ActivityScope;
import com.recipe.search.ui.view.recipe_details.RecipeDetailsActivity;
import com.recipe.search.ui.view.recipe_details.RecipeDetailsModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = ActivityBindingModule_BindEventDetails.RecipeDetailsActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBindingModule_BindEventDetails {
  private ActivityBindingModule_BindEventDetails() {}

  @Binds
  @IntoMap
  @ClassKey(RecipeDetailsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RecipeDetailsActivitySubcomponent.Builder builder);

  @Subcomponent(modules = RecipeDetailsModule.class)
  @ActivityScope
  public interface RecipeDetailsActivitySubcomponent
      extends AndroidInjector<RecipeDetailsActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RecipeDetailsActivity> {}
  }
}
