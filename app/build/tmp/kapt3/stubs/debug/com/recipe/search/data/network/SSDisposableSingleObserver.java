package com.recipe.search.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u000f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\nH\u0014J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000fR\u0012\u0010\u0006\u001a\u0004\u0018\u00018\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/recipe/search/data/network/SSDisposableSingleObserver;", "R", "", "V", "Lcom/recipe/search/base/BaseContract$View;", "Lio/reactivex/observers/DisposableSingleObserver;", "mView", "(Lcom/recipe/search/base/BaseContract$View;)V", "Lcom/recipe/search/base/BaseContract$View;", "onError", "", "throwable", "", "onRequestSuccess", "response", "(Ljava/lang/Object;)V", "onStart", "onSuccess", "app_debug"})
public abstract class SSDisposableSingleObserver<R extends java.lang.Object, V extends com.recipe.search.base.BaseContract.View> extends io.reactivex.observers.DisposableSingleObserver<R> {
    private final V mView = null;
    
    public SSDisposableSingleObserver(@org.jetbrains.annotations.Nullable
    V mView) {
        super();
    }
    
    public abstract void onRequestSuccess(@org.jetbrains.annotations.NotNull
    R response);
    
    @java.lang.Override
    public void onSuccess(@org.jetbrains.annotations.NotNull
    R response) {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    @java.lang.Override
    public void onError(@org.jetbrains.annotations.NotNull
    java.lang.Throwable throwable) {
    }
}