package com.recipe.search.ui.view.recipe_details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/recipe/search/ui/view/recipe_details/RecipeDetailsActivity;", "Lcom/recipe/search/base/MvpBaseActivity;", "Lcom/recipe/search/ui/view/recipe_details/RecipeDetailsPresenter;", "Lcom/recipe/search/ui/view/recipe_details/RecipeDetailsContract$View;", "()V", "binding", "Lcom/recipe/search/databinding/ActivityRecipeDetailsBinding;", "recipeAdapter", "Lcom/recipe/search/ui/adapter/RecipeDetailsAdapter;", "recipesList", "Ljava/util/ArrayList;", "", "getContentView", "Landroid/view/View;", "getRecipeDetailsResponse", "", "response", "Lcom/recipe/search/data/network/api_response/RecipeDetailsResponseModel;", "onViewReady", "savedInstanceState", "Landroid/os/Bundle;", "intent", "Landroid/content/Intent;", "recycleViewAdapterSetup", "app_debug"})
public final class RecipeDetailsActivity extends com.recipe.search.base.MvpBaseActivity<com.recipe.search.ui.view.recipe_details.RecipeDetailsPresenter> implements com.recipe.search.ui.view.recipe_details.RecipeDetailsContract.View {
    private com.recipe.search.databinding.ActivityRecipeDetailsBinding binding;
    private java.util.ArrayList<java.lang.String> recipesList;
    private com.recipe.search.ui.adapter.RecipeDetailsAdapter recipeAdapter;
    
    public RecipeDetailsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View getContentView() {
        return null;
    }
    
    @java.lang.Override
    public void onViewReady(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
    
    private final void recycleViewAdapterSetup() {
    }
    
    @java.lang.Override
    public void getRecipeDetailsResponse(@org.jetbrains.annotations.NotNull
    com.recipe.search.data.network.api_response.RecipeDetailsResponseModel response) {
    }
}