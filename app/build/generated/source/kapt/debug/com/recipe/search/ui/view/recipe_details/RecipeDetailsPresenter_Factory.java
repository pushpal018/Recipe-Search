package com.recipe.search.ui.view.recipe_details;

import android.content.Context;
import com.recipe.search.base.BasePresenter_MembersInjector;
import com.recipe.search.data.network.api_service.SearchApiService;
import com.recipe.search.rx.AppSchedulerProvider;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RecipeDetailsPresenter_Factory implements Factory<RecipeDetailsPresenter> {
  private final Provider<RecipeDetailsContract.View> viewProvider;

  private final Provider<AppSchedulerProvider> appSchedulerProvider;

  private final Provider<Context> contextProvider;

  private final Provider<SearchApiService> recipeApiServiceProvider;

  public RecipeDetailsPresenter_Factory(
      Provider<RecipeDetailsContract.View> viewProvider,
      Provider<AppSchedulerProvider> appSchedulerProvider,
      Provider<Context> contextProvider,
      Provider<SearchApiService> recipeApiServiceProvider) {
    this.viewProvider = viewProvider;
    this.appSchedulerProvider = appSchedulerProvider;
    this.contextProvider = contextProvider;
    this.recipeApiServiceProvider = recipeApiServiceProvider;
  }

  @Override
  public RecipeDetailsPresenter get() {
    RecipeDetailsPresenter instance = new RecipeDetailsPresenter(viewProvider.get());
    BasePresenter_MembersInjector.injectAppSchedulerProvider(instance, appSchedulerProvider.get());
    BasePresenter_MembersInjector.injectContext(instance, contextProvider.get());
    RecipeDetailsPresenter_MembersInjector.injectRecipeApiService(
        instance, recipeApiServiceProvider.get());
    return instance;
  }

  public static RecipeDetailsPresenter_Factory create(
      Provider<RecipeDetailsContract.View> viewProvider,
      Provider<AppSchedulerProvider> appSchedulerProvider,
      Provider<Context> contextProvider,
      Provider<SearchApiService> recipeApiServiceProvider) {
    return new RecipeDetailsPresenter_Factory(
        viewProvider, appSchedulerProvider, contextProvider, recipeApiServiceProvider);
  }

  public static RecipeDetailsPresenter newRecipeDetailsPresenter(RecipeDetailsContract.View view) {
    return new RecipeDetailsPresenter(view);
  }
}
