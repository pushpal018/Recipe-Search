package com.recipe.search.ui.view.recipe_details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/recipe/search/ui/view/recipe_details/RecipeDetailsPresenter;", "Lcom/recipe/search/base/BasePresenter;", "Lcom/recipe/search/ui/view/recipe_details/RecipeDetailsContract$View;", "Lcom/recipe/search/ui/view/recipe_details/RecipeDetailsContract$Presenter;", "view", "(Lcom/recipe/search/ui/view/recipe_details/RecipeDetailsContract$View;)V", "recipeApiService", "Lcom/recipe/search/data/network/api_service/SearchApiService;", "getRecipeApiService", "()Lcom/recipe/search/data/network/api_service/SearchApiService;", "setRecipeApiService", "(Lcom/recipe/search/data/network/api_service/SearchApiService;)V", "recipeDetailsList", "", "rId", "", "app_debug"})
public final class RecipeDetailsPresenter extends com.recipe.search.base.BasePresenter<com.recipe.search.ui.view.recipe_details.RecipeDetailsContract.View> implements com.recipe.search.ui.view.recipe_details.RecipeDetailsContract.Presenter {
    @javax.inject.Inject
    public com.recipe.search.data.network.api_service.SearchApiService recipeApiService;
    
    @javax.inject.Inject
    public RecipeDetailsPresenter(@org.jetbrains.annotations.NotNull
    com.recipe.search.ui.view.recipe_details.RecipeDetailsContract.View view) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.recipe.search.data.network.api_service.SearchApiService getRecipeApiService() {
        return null;
    }
    
    public final void setRecipeApiService(@org.jetbrains.annotations.NotNull
    com.recipe.search.data.network.api_service.SearchApiService p0) {
    }
    
    @java.lang.Override
    public void recipeDetailsList(@org.jetbrains.annotations.NotNull
    java.lang.String rId) {
    }
}