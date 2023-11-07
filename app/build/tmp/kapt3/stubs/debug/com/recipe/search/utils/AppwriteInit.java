package com.recipe.search.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u0011\u0010,\u001a\u00020\'H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J)\u0010.\u001a\u00020\'2\u0006\u0010/\u001a\u00020)2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u000e\u00101\u001a\u00020\'2\u0006\u00102\u001a\u00020)R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00063"}, d2 = {"Lcom/recipe/search/utils/AppwriteInit;", "", "myContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "account", "Lio/appwrite/services/Account;", "getAccount", "()Lio/appwrite/services/Account;", "setAccount", "(Lio/appwrite/services/Account;)V", "client", "Lio/appwrite/Client;", "getClient", "()Lio/appwrite/Client;", "dialogError", "Lcom/recipe/search/ui/dialog/DialogError;", "getDialogError", "()Lcom/recipe/search/ui/dialog/DialogError;", "setDialogError", "(Lcom/recipe/search/ui/dialog/DialogError;)V", "dialogSuccess", "Lcom/recipe/search/ui/dialog/DialogSuccess;", "getDialogSuccess", "()Lcom/recipe/search/ui/dialog/DialogSuccess;", "setDialogSuccess", "(Lcom/recipe/search/ui/dialog/DialogSuccess;)V", "loader", "Landroid/app/AlertDialog;", "getLoader", "()Landroid/app/AlertDialog;", "setLoader", "(Landroid/app/AlertDialog;)V", "mPrefManager", "Lcom/recipe/search/data/prefs/PreferenceManager;", "getMyContext", "()Landroid/content/Context;", "setMyContext", "login", "", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showErrorDialog", "msz", "app_debug"})
public final class AppwriteInit {
    @org.jetbrains.annotations.Nullable
    private android.app.AlertDialog loader;
    @org.jetbrains.annotations.Nullable
    private com.recipe.search.ui.dialog.DialogError dialogError;
    @org.jetbrains.annotations.Nullable
    private com.recipe.search.ui.dialog.DialogSuccess dialogSuccess;
    private com.recipe.search.data.prefs.PreferenceManager mPrefManager;
    public android.content.Context myContext;
    @org.jetbrains.annotations.NotNull
    private final io.appwrite.Client client = null;
    @org.jetbrains.annotations.NotNull
    private io.appwrite.services.Account account;
    
    public AppwriteInit(@org.jetbrains.annotations.NotNull
    android.content.Context myContext) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.app.AlertDialog getLoader() {
        return null;
    }
    
    public final void setLoader(@org.jetbrains.annotations.Nullable
    android.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.recipe.search.ui.dialog.DialogError getDialogError() {
        return null;
    }
    
    public final void setDialogError(@org.jetbrains.annotations.Nullable
    com.recipe.search.ui.dialog.DialogError p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.recipe.search.ui.dialog.DialogSuccess getDialogSuccess() {
        return null;
    }
    
    public final void setDialogSuccess(@org.jetbrains.annotations.Nullable
    com.recipe.search.ui.dialog.DialogSuccess p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getMyContext() {
        return null;
    }
    
    public final void setMyContext(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.appwrite.Client getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.appwrite.services.Account getAccount() {
        return null;
    }
    
    public final void setAccount(@org.jetbrains.annotations.NotNull
    io.appwrite.services.Account p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object register(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object logout(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void showErrorDialog(@org.jetbrains.annotations.NotNull
    java.lang.String msz) {
    }
}