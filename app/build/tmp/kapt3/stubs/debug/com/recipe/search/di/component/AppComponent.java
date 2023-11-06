package com.recipe.search.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/recipe/search/di/component/AppComponent;", "", "inject", "", "app", "Lcom/recipe/search/base/BaseApplication;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.recipe.search.di.module.NetworkModule.class, com.recipe.search.di.module.ApplicationModule.class, com.recipe.search.di.module.ActivityBindingModule.class})
@javax.inject.Singleton
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.recipe.search.base.BaseApplication app);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/recipe/search/di/component/AppComponent$Builder;", "", "application", "Lcom/recipe/search/base/BaseApplication;", "build", "Lcom/recipe/search/di/component/AppComponent;", "app_debug"})
    @dagger.Component.Builder
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull
        @dagger.BindsInstance
        public abstract com.recipe.search.di.component.AppComponent.Builder application(@org.jetbrains.annotations.NotNull
        com.recipe.search.base.BaseApplication application);
        
        @org.jetbrains.annotations.NotNull
        public abstract com.recipe.search.di.component.AppComponent build();
    }
}