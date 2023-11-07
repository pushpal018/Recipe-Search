package com.recipe.search.ui.view.recipe_details;

import android.content.Context;
import com.recipe.search.base.BasePresenter_MembersInjector;
import com.recipe.search.data.network.api_service.SearchApiService;
import com.recipe.search.rx.AppSchedulerProvider;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RecipeDetailsPresenter_MembersInjector
    implements MembersInjector<RecipeDetailsPresenter> {
  private final Provider<AppSchedulerProvider> appSchedulerProvider;

  private final Provider<Context> contextProvider;

  private final Provider<SearchApiService> recipeApiServiceProvider;

  public RecipeDetailsPresenter_MembersInjector(
      Provider<AppSchedulerProvider> appSchedulerProvider,
      Provider<Context> contextProvider,
      Provider<SearchApiService> recipeApiServiceProvider) {
    this.appSchedulerProvider = appSchedulerProvider;
    this.contextProvider = contextProvider;
    this.recipeApiServiceProvider = recipeApiServiceProvider;
  }

  public static MembersInjector<RecipeDetailsPresenter> create(
      Provider<AppSchedulerProvider> appSchedulerProvider,
      Provider<Context> contextProvider,
      Provider<SearchApiService> recipeApiServiceProvider) {
    return new RecipeDetailsPresenter_MembersInjector(
        appSchedulerProvider, contextProvider, recipeApiServiceProvider);
  }

  @Override
  public void injectMembers(RecipeDetailsPresenter instance) {
    BasePresenter_MembersInjector.injectAppSchedulerProvider(instance, appSchedulerProvider.get());
    BasePresenter_MembersInjector.injectContext(instance, contextProvider.get());
    injectRecipeApiService(instance, recipeApiServiceProvider.get());
  }

  public static void injectRecipeApiService(
      RecipeDetailsPresenter instance, SearchApiService recipeApiService) {
    instance.recipeApiService = recipeApiService;
  }
}
