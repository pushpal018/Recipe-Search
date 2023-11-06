package com.recipe.search.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\nH\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/recipe/search/di/module/ApplicationModule;", "", "()V", "provideAlertService", "Lcom/recipe/search/utils/MyAlertService;", "provideAppLogger", "Lcom/recipe/search/utils/AppLogger;", "provideAppSchedule", "Lcom/recipe/search/rx/AppSchedulerProvider;", "provideContext", "Landroid/content/Context;", "baseApp", "Lcom/recipe/search/base/BaseApplication;", "provideNavigator", "Lcom/recipe/search/utils/Navigator;", "provideNetworkUtils", "Lcom/recipe/search/utils/NetworkUtils;", "providePermissionUtils", "Lcom/recipe/search/utils/PermissionUtils;", "preferenceManager", "Lcom/recipe/search/data/prefs/PreferenceManager;", "providePreferenceManager", "context", "app_debug"})
@dagger.Module
public final class ApplicationModule {
    
    public ApplicationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull
    com.recipe.search.base.BaseApplication baseApp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.recipe.search.data.prefs.PreferenceManager providePreferenceManager(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.recipe.search.utils.PermissionUtils providePermissionUtils(@org.jetbrains.annotations.NotNull
    com.recipe.search.data.prefs.PreferenceManager preferenceManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.recipe.search.utils.MyAlertService provideAlertService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.recipe.search.rx.AppSchedulerProvider provideAppSchedule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.recipe.search.utils.Navigator provideNavigator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.recipe.search.utils.AppLogger provideAppLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.recipe.search.utils.NetworkUtils provideNetworkUtils() {
        return null;
    }
}