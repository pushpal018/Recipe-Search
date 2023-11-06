package com.recipe.search.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/recipe/search/di/module/NetworkModule;", "", "()V", "provideApiServiceBuilder", "Lcom/recipe/search/data/network/ApiServiceBuilder;", "retrofit", "Lretrofit2/Retrofit;", "provideRetrofitApiClient", "context", "Landroid/content/Context;", "networkUtils", "Lcom/recipe/search/utils/NetworkUtils;", "preferenceManager", "Lcom/recipe/search/data/prefs/PreferenceManager;", "app_debug"})
@dagger.Module
public final class NetworkModule {
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.Retrofit provideRetrofitApiClient(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.recipe.search.utils.NetworkUtils networkUtils, @org.jetbrains.annotations.NotNull
    com.recipe.search.data.prefs.PreferenceManager preferenceManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.recipe.search.data.network.ApiServiceBuilder provideApiServiceBuilder(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
}