package com.recipe.search.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\r\u001a\u00020\bJ \u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\fJ<\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J2\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0016\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/recipe/search/utils/MyAlertService;", "", "()V", "mAlert", "Landroid/app/AlertDialog;", "mToast", "Landroid/widget/Toast;", "createToast", "", "context", "Landroid/content/Context;", "message", "", "onDestroy", "showAlert", "title", "showConfirmationAlert", "negativeBtn", "positiveBtn", "alertListener", "Lcom/recipe/search/utils/MyAlertService$AlertListener;", "showConfirmationAlertwithOutNegitive", "showToast", "resId", "", "AlertListener", "app_debug"})
public final class MyAlertService {
    private android.widget.Toast mToast;
    private android.app.AlertDialog mAlert;
    
    public MyAlertService() {
        super();
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull
    android.content.Context context, int resId) {
    }
    
    private final void createToast(android.content.Context context, java.lang.String message) {
    }
    
    public final void showAlert(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    public final void showConfirmationAlert(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.Nullable
    java.lang.String negativeBtn, @org.jetbrains.annotations.NotNull
    java.lang.String positiveBtn, @org.jetbrains.annotations.Nullable
    com.recipe.search.utils.MyAlertService.AlertListener alertListener) {
    }
    
    public final void showConfirmationAlertwithOutNegitive(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    java.lang.String positiveBtn, @org.jetbrains.annotations.Nullable
    com.recipe.search.utils.MyAlertService.AlertListener alertListener) {
    }
    
    public final void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/recipe/search/utils/MyAlertService$AlertListener;", "", "negativeBtnDidTapped", "", "positiveBtnDidTapped", "app_debug"})
    public static abstract interface AlertListener {
        
        public abstract void negativeBtnDidTapped();
        
        public abstract void positiveBtnDidTapped();
    }
}