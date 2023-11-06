package com.recipe.search.ui.view.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/recipe/search/ui/view/splash/SplashViewModule;", "", "()V", "provideSplashView", "Lcom/recipe/search/ui/view/splash/SplashContract$View;", "activity", "Lcom/recipe/search/ui/view/splash/SplashScreenActivity;", "app_debug"})
@dagger.Module
public abstract class SplashViewModule {
    
    public SplashViewModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract com.recipe.search.ui.view.splash.SplashContract.View provideSplashView(@org.jetbrains.annotations.NotNull
    com.recipe.search.ui.view.splash.SplashScreenActivity activity);
}