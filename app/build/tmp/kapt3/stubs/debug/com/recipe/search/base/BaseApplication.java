package com.recipe.search.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u001dH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006&"}, d2 = {"Lcom/recipe/search/base/BaseApplication;", "Landroid/app/Application;", "Ldagger/android/HasActivityInjector;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "mActivityInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/app/Activity;", "getMActivityInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setMActivityInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "mPrefManager", "Lcom/recipe/search/data/prefs/PreferenceManager;", "getMPrefManager", "()Lcom/recipe/search/data/prefs/PreferenceManager;", "setMPrefManager", "(Lcom/recipe/search/data/prefs/PreferenceManager;)V", "sInstance", "getSInstance", "()Lcom/recipe/search/base/BaseApplication;", "setSInstance", "(Lcom/recipe/search/base/BaseApplication;)V", "activityInjector", "Ldagger/android/AndroidInjector;", "attachBaseContext", "", "base", "Landroid/content/Context;", "genHexStringForSmsRetrieverAPI", "initDagger", "loadAppLanguage", "onCreate", "onTerminate", "Companion", "app_debug"})
public final class BaseApplication extends android.app.Application implements dagger.android.HasActivityInjector, androidx.lifecycle.LifecycleObserver {
    @org.jetbrains.annotations.NotNull
    public static final com.recipe.search.base.BaseApplication.Companion Companion = null;
    private static boolean islogindta = false;
    @javax.inject.Inject
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> mActivityInjector;
    private final java.lang.String TAG = null;
    @javax.inject.Inject
    public com.recipe.search.data.prefs.PreferenceManager mPrefManager;
    @org.jetbrains.annotations.NotNull
    private com.recipe.search.base.BaseApplication sInstance;
    
    public BaseApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dagger.android.DispatchingAndroidInjector<android.app.Activity> getMActivityInjector() {
        return null;
    }
    
    public final void setMActivityInjector(@org.jetbrains.annotations.NotNull
    dagger.android.DispatchingAndroidInjector<android.app.Activity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.recipe.search.data.prefs.PreferenceManager getMPrefManager() {
        return null;
    }
    
    public final void setMPrefManager(@org.jetbrains.annotations.NotNull
    com.recipe.search.data.prefs.PreferenceManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.recipe.search.base.BaseApplication getSInstance() {
        return null;
    }
    
    public final void setSInstance(@org.jetbrains.annotations.NotNull
    com.recipe.search.base.BaseApplication p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    private final void genHexStringForSmsRetrieverAPI() {
    }
    
    private final void initDagger() {
    }
    
    @java.lang.Override
    public void onTerminate() {
    }
    
    @java.lang.Override
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable
    android.content.Context base) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dagger.android.AndroidInjector<android.app.Activity> activityInjector() {
        return null;
    }
    
    private final void loadAppLanguage() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/recipe/search/base/BaseApplication$Companion;", "", "()V", "islogindta", "", "getIslogindta", "()Z", "setIslogindta", "(Z)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean getIslogindta() {
            return false;
        }
        
        public final void setIslogindta(boolean p0) {
        }
    }
}