package com.recipe.search.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/recipe/search/base/BaseContract;", "", "Presenter", "View", "app_debug"})
public abstract interface BaseContract {
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\bH&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\bH&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\bH&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\bH&J,\u0010\u0018\u001a\u00020\u00032\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001aj\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\u001bH&\u00a8\u0006\u001c"}, d2 = {"Lcom/recipe/search/base/BaseContract$View;", "", "applyForcePinReset", "", "getContext", "Landroid/content/Context;", "onExpectationFailed", "message", "", "onNetworkCallEnded", "onNetworkCallStarted", "loadingMessage", "onNetworkError", "onNetworkUnavailable", "onServerError", "onSystemUpgrading", "onTestError", "error", "onTimeOutError", "onUserDidTooManyAttempts", "errorMsg", "onUserDisabled", "onUserUnauthorized", "errorMessage", "onValidationFailed", "messages", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "app_debug"})
    public static abstract interface View {
        
        public abstract void onNetworkCallStarted(@org.jetbrains.annotations.NotNull
        java.lang.String loadingMessage);
        
        public abstract void onNetworkCallEnded();
        
        public abstract void onServerError();
        
        public abstract void onNetworkError();
        
        public abstract void onTestError(@org.jetbrains.annotations.NotNull
        java.lang.String error);
        
        public abstract void onTimeOutError();
        
        public abstract void onNetworkUnavailable();
        
        public abstract void onUserUnauthorized(@org.jetbrains.annotations.NotNull
        java.lang.String errorMessage);
        
        public abstract void onUserDisabled(@org.jetbrains.annotations.NotNull
        java.lang.String errorMsg);
        
        public abstract void applyForcePinReset();
        
        public abstract void onSystemUpgrading();
        
        public abstract void onUserDidTooManyAttempts(@org.jetbrains.annotations.NotNull
        java.lang.String errorMsg);
        
        public abstract void onValidationFailed(@org.jetbrains.annotations.NotNull
        java.util.LinkedHashMap<java.lang.String, java.lang.String> messages);
        
        public abstract void onExpectationFailed(@org.jetbrains.annotations.NotNull
        java.lang.String message);
        
        @org.jetbrains.annotations.NotNull
        public abstract android.content.Context getContext();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/recipe/search/base/BaseContract$Presenter;", "", "clearDisposable", "", "detachView", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void detachView();
        
        public abstract void clearDisposable();
    }
}