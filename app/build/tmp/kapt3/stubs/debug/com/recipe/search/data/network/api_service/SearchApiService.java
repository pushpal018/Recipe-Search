package com.recipe.search.data.network.api_service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032$\b\u0001\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\bH\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0007H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/recipe/search/data/network/api_service/SearchApiService;", "", "doSignUp", "Lio/reactivex/Single;", "Lcom/recipe/search/data/network/api_response/SignUpResponseModel;", "signupData", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getRecipesDetails", "Lcom/recipe/search/data/network/api_response/RecipeDetailsResponseModel;", "recipe", "getRecipesList", "Lcom/recipe/search/data/network/api_response/GetSearchResponse;", "page", "app_debug"})
public abstract interface SearchApiService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "https://forkify-api.herokuapp.com/api/search")
    public abstract io.reactivex.Single<com.recipe.search.data.network.api_response.GetSearchResponse> getRecipesList(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "q")
    java.lang.String page);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "https://forkify-api.herokuapp.com/api/get")
    public abstract io.reactivex.Single<com.recipe.search.data.network.api_response.RecipeDetailsResponseModel> getRecipesDetails(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "rId")
    java.lang.String recipe);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "https://forkify-api.herokuapp.com/api/account")
    @retrofit2.http.FormUrlEncoded
    public abstract io.reactivex.Single<com.recipe.search.data.network.api_response.SignUpResponseModel> doSignUp(@org.jetbrains.annotations.NotNull
    @retrofit2.http.FieldMap
    java.util.HashMap<java.lang.String, java.lang.String> signupData);
}