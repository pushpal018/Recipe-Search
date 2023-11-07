package com.recipe.search.data.network.api_response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u00c6\u0003J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lcom/recipe/search/data/network/api_response/GetSearchResponse;", "", "count", "", "recipes", "Ljava/util/ArrayList;", "Lcom/recipe/search/data/network/api_response/Recipes;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/Integer;Ljava/util/ArrayList;)V", "getCount", "()Ljava/lang/Integer;", "setCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRecipes", "()Ljava/util/ArrayList;", "setRecipes", "(Ljava/util/ArrayList;)V", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/ArrayList;)Lcom/recipe/search/data/network/api_response/GetSearchResponse;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class GetSearchResponse {
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "count")
    @com.google.gson.annotations.Expose
    private java.lang.Integer count;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "recipes")
    @com.google.gson.annotations.Expose
    private java.util.ArrayList<com.recipe.search.data.network.api_response.Recipes> recipes;
    
    @org.jetbrains.annotations.NotNull
    public final com.recipe.search.data.network.api_response.GetSearchResponse copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer count, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.recipe.search.data.network.api_response.Recipes> recipes) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public GetSearchResponse() {
        super();
    }
    
    public GetSearchResponse(@org.jetbrains.annotations.Nullable
    java.lang.Integer count, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.recipe.search.data.network.api_response.Recipes> recipes) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCount() {
        return null;
    }
    
    public final void setCount(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.recipe.search.data.network.api_response.Recipes> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.recipe.search.data.network.api_response.Recipes> getRecipes() {
        return null;
    }
    
    public final void setRecipes(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.recipe.search.data.network.api_response.Recipes> p0) {
    }
}