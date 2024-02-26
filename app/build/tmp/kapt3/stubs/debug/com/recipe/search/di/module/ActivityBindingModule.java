package com.recipe.search.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/recipe/search/di/module/ActivityBindingModule;", "", "()V", "bindEventAppWriteRegistration", "Lcom/recipe/search/ui/view/auth/appwrite_auth/AppwriteRegistrationActivity;", "bindEventDashBoard", "Lcom/recipe/search/ui/view/dashboard/DashBoardActivity;", "bindEventDetails", "Lcom/recipe/search/ui/view/recipe_details/RecipeDetailsActivity;", "bindEventLogin", "Lcom/recipe/search/ui/view/auth/login/LoginActivity;", "bindEventSignUp", "Lcom/recipe/search/ui/view/auth/signUp/SignUpActivity;", "bindEventSplashActivity", "Lcom/recipe/search/ui/view/splash/SplashScreenActivity;", "app_debug"})
@dagger.Module(includes = {com.recipe.search.di.module.FragmentBindingModule.class})
public abstract class ActivityBindingModule {
    
    public ActivityBindingModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector(modules = {com.recipe.search.ui.view.splash.SplashViewModule.class})
    @com.recipe.search.di.scope.ActivityScope
    public abstract com.recipe.search.ui.view.splash.SplashScreenActivity bindEventSplashActivity();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector(modules = {com.recipe.search.ui.view.dashboard.DashBoardViewModel.class})
    @com.recipe.search.di.scope.ActivityScope
    public abstract com.recipe.search.ui.view.dashboard.DashBoardActivity bindEventDashBoard();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector(modules = {com.recipe.search.ui.view.auth.login.LoginViewModule.class})
    @com.recipe.search.di.scope.ActivityScope
    public abstract com.recipe.search.ui.view.auth.login.LoginActivity bindEventLogin();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector(modules = {com.recipe.search.ui.view.auth.signUp.SignUpViewModel.class})
    @com.recipe.search.di.scope.ActivityScope
    public abstract com.recipe.search.ui.view.auth.signUp.SignUpActivity bindEventSignUp();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector(modules = {com.recipe.search.ui.view.recipe_details.RecipeDetailsModule.class})
    @com.recipe.search.di.scope.ActivityScope
    public abstract com.recipe.search.ui.view.recipe_details.RecipeDetailsActivity bindEventDetails();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector(modules = {com.recipe.search.ui.view.auth.appwrite_auth.AppwriteRegistrationModule.class})
    @com.recipe.search.di.scope.ActivityScope
    public abstract com.recipe.search.ui.view.auth.appwrite_auth.AppwriteRegistrationActivity bindEventAppWriteRegistration();
}