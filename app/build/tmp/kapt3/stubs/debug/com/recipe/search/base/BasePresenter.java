package com.recipe.search.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0005J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0005\u00a8\u0006%"}, d2 = {"Lcom/recipe/search/base/BasePresenter;", "V", "Lcom/recipe/search/base/BaseContract$View;", "Lcom/recipe/search/base/BaseContract$Presenter;", "mView", "(Lcom/recipe/search/base/BaseContract$View;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "TAG$delegate", "Lkotlin/Lazy;", "appSchedulerProvider", "Lcom/recipe/search/rx/AppSchedulerProvider;", "getAppSchedulerProvider", "()Lcom/recipe/search/rx/AppSchedulerProvider;", "setAppSchedulerProvider", "(Lcom/recipe/search/rx/AppSchedulerProvider;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "setCompositeDisposable", "(Lio/reactivex/disposables/CompositeDisposable;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getMView", "()Lcom/recipe/search/base/BaseContract$View;", "setMView", "Lcom/recipe/search/base/BaseContract$View;", "clearDisposable", "", "detachView", "app_debug"})
public class BasePresenter<V extends com.recipe.search.base.BaseContract.View> implements com.recipe.search.base.BaseContract.Presenter {
    @org.jetbrains.annotations.Nullable
    private V mView;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy TAG$delegate = null;
    @javax.inject.Inject
    public com.recipe.search.rx.AppSchedulerProvider appSchedulerProvider;
    @javax.inject.Inject
    public android.content.Context context;
    @org.jetbrains.annotations.Nullable
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;
    
    public BasePresenter() {
        super();
    }
    
    public BasePresenter(@org.jetbrains.annotations.Nullable
    V mView) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final V getMView() {
        return null;
    }
    
    public final void setMView(@org.jetbrains.annotations.Nullable
    V p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.recipe.search.rx.AppSchedulerProvider getAppSchedulerProvider() {
        return null;
    }
    
    public final void setAppSchedulerProvider(@org.jetbrains.annotations.NotNull
    com.recipe.search.rx.AppSchedulerProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    protected final void setCompositeDisposable(@org.jetbrains.annotations.Nullable
    io.reactivex.disposables.CompositeDisposable p0) {
    }
    
    @java.lang.Override
    public void detachView() {
    }
    
    @java.lang.Override
    public void clearDisposable() {
    }
}