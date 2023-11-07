package com.recipe.search.ui.view.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/recipe/search/ui/view/dashboard/DashBoardActivity;", "Lcom/recipe/search/base/MvpBaseActivity;", "Lcom/recipe/search/ui/view/dashboard/DashBoardPresenter;", "Lcom/recipe/search/ui/view/dashboard/DashBoardContract$View;", "()V", "binding", "Lcom/recipe/search/databinding/ActivityDashBoardBinding;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "recipesList", "Ljava/util/ArrayList;", "Lcom/recipe/search/data/network/api_response/Recipes;", "searchAdapter", "Lcom/recipe/search/ui/adapter/SearchAdapter;", "getContentView", "Landroid/view/View;", "getRecipeSearchResponse", "", "response", "Lcom/recipe/search/data/network/api_response/GetSearchResponse;", "noDataFound", "message", "", "onViewReady", "savedInstanceState", "Landroid/os/Bundle;", "intent", "Landroid/content/Intent;", "recycleViewAdapterSetup", "app_debug"})
public final class DashBoardActivity extends com.recipe.search.base.MvpBaseActivity<com.recipe.search.ui.view.dashboard.DashBoardPresenter> implements com.recipe.search.ui.view.dashboard.DashBoardContract.View {
    @org.jetbrains.annotations.NotNull
    private final android.os.Handler handler = null;
    private com.recipe.search.databinding.ActivityDashBoardBinding binding;
    private java.util.ArrayList<com.recipe.search.data.network.api_response.Recipes> recipesList;
    private com.recipe.search.ui.adapter.SearchAdapter searchAdapter;
    
    public DashBoardActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.os.Handler getHandler() {
        return null;
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
    public void getRecipeSearchResponse(@org.jetbrains.annotations.NotNull
    com.recipe.search.data.network.api_response.GetSearchResponse response) {
    }
    
    @java.lang.Override
    public void noDataFound(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
}