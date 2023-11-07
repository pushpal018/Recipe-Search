package com.recipe.search.ui.view.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/recipe/search/ui/view/dashboard/DashBoardContract;", "", "Presenter", "View", "app_debug"})
public abstract interface DashBoardContract {
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/recipe/search/ui/view/dashboard/DashBoardContract$View;", "Lcom/recipe/search/base/BaseContract$View;", "getRecipeSearchResponse", "", "response", "Lcom/recipe/search/data/network/api_response/GetSearchResponse;", "noDataFound", "message", "", "app_debug"})
    public static abstract interface View extends com.recipe.search.base.BaseContract.View {
        
        public abstract void getRecipeSearchResponse(@org.jetbrains.annotations.NotNull
        com.recipe.search.data.network.api_response.GetSearchResponse response);
        
        public abstract void noDataFound(@org.jetbrains.annotations.NotNull
        java.lang.String message);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/recipe/search/ui/view/dashboard/DashBoardContract$Presenter;", "Lcom/recipe/search/base/BaseContract$Presenter;", "recipeSearchList", "", "search", "", "app_debug"})
    public static abstract interface Presenter extends com.recipe.search.base.BaseContract.Presenter {
        
        public abstract void recipeSearchList(@org.jetbrains.annotations.NotNull
        java.lang.String search);
    }
}