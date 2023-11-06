package com.recipe.search.ui.view.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\u001a\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006!"}, d2 = {"Lcom/recipe/search/ui/view/splash/SplashScreenActivity;", "Lcom/recipe/search/base/MvpBaseActivity;", "Lcom/recipe/search/ui/view/splash/SplashPresenter;", "Lcom/recipe/search/ui/view/splash/SplashContract$View;", "()V", "binding", "Lcom/recipe/search/databinding/ActivitySplashScreenBinding;", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "setBundle", "(Landroid/os/Bundle;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "getContentView", "Landroid/view/View;", "onNetworkCallStarted", "", "loadingMessage", "", "onNetworkUnavailable", "onServerError", "onSystemUpgrading", "onTimeOutError", "onUserDidTooManyAttempts", "errorMsg", "onViewReady", "savedInstanceState", "intent", "Landroid/content/Intent;", "app_debug"})
public final class SplashScreenActivity extends com.recipe.search.base.MvpBaseActivity<com.recipe.search.ui.view.splash.SplashPresenter> implements com.recipe.search.ui.view.splash.SplashContract.View {
    @org.jetbrains.annotations.NotNull
    private final android.os.Handler handler = null;
    @org.jetbrains.annotations.NotNull
    private android.os.Bundle bundle;
    private com.recipe.search.databinding.ActivitySplashScreenBinding binding;
    
    public SplashScreenActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.os.Handler getHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.os.Bundle getBundle() {
        return null;
    }
    
    public final void setBundle(@org.jetbrains.annotations.NotNull
    android.os.Bundle p0) {
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
    
    @java.lang.Override
    public void onNetworkCallStarted(@org.jetbrains.annotations.NotNull
    java.lang.String loadingMessage) {
    }
    
    @java.lang.Override
    public void onServerError() {
    }
    
    @java.lang.Override
    public void onTimeOutError() {
    }
    
    @java.lang.Override
    public void onNetworkUnavailable() {
    }
    
    @java.lang.Override
    public void onSystemUpgrading() {
    }
    
    @java.lang.Override
    public void onUserDidTooManyAttempts(@org.jetbrains.annotations.NotNull
    java.lang.String errorMsg) {
    }
}