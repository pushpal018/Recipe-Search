package com.recipe.search.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"J$\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010)H$J\u0006\u0010*\u001a\u00020\u001fJ&\u0010+\u001a\u0004\u0018\u00010\u00192\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010,\u001a\u0004\u0018\u00010)H\u0016J\b\u0010-\u001a\u00020\u001fH\u0016J\u0012\u0010.\u001a\u00020\u001f2\b\u0010/\u001a\u0004\u0018\u00010)H$J\b\u00100\u001a\u00020\u001fH\u0016J\u001a\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u00192\b\u0010,\u001a\u0004\u0018\u00010)H\u0016J\b\u00103\u001a\u00020\u001fH\u0016J&\u00104\u001a\u00020\u001f2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00042\b\u00106\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u00107\u001a\u000208J\u0006\u00109\u001a\u00020\u001fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006:"}, d2 = {"Lcom/recipe/search/base/BaseDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "appVersionCode", "", "getAppVersionCode", "()Ljava/lang/String;", "setAppVersionCode", "(Ljava/lang/String;)V", "deviceId", "getDeviceId", "setDeviceId", "imei", "getImei", "setImei", "loader", "Landroid/app/AlertDialog;", "getLoader", "()Landroid/app/AlertDialog;", "setLoader", "(Landroid/app/AlertDialog;)V", "macAddress", "getMacAddress", "setMacAddress", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "BaseDialogFragment", "", "_getHeaderData", "mPrefs", "Lcom/recipe/search/data/prefs/PreferenceManager;", "getDialogView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "saveInstanceState", "Landroid/os/Bundle;", "hideProgressDialog", "onCreateView", "savedInstanceState", "onDestroyView", "onDialogViewReady", "getArguments", "onPause", "onViewCreated", "view", "runAnimatedIcon", "showErrorDialog", "title", "message", "titleFullRed", "", "showProgressDialog", "app_debug"})
public abstract class BaseDialogFragment extends androidx.fragment.app.DialogFragment {
    public android.view.View rootView;
    @org.jetbrains.annotations.Nullable
    private android.app.AlertDialog loader;
    @org.jetbrains.annotations.NotNull
    private java.lang.String deviceId = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String appVersionCode = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String imei = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String macAddress = "";
    
    public BaseDialogFragment() {
        super();
    }
    
    public void BaseDialogFragment() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.view.View getRootView() {
        return null;
    }
    
    public final void setRootView(@org.jetbrains.annotations.NotNull
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.app.AlertDialog getLoader() {
        return null;
    }
    
    public final void setLoader(@org.jetbrains.annotations.Nullable
    android.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDeviceId() {
        return null;
    }
    
    public final void setDeviceId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAppVersionCode() {
        return null;
    }
    
    public final void setAppVersionCode(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImei() {
        return null;
    }
    
    public final void setImei(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMacAddress() {
        return null;
    }
    
    public final void setMacAddress(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected abstract android.view.View getDialogView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle saveInstanceState);
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    protected abstract void onDialogViewReady(@org.jetbrains.annotations.Nullable
    android.os.Bundle getArguments);
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    public final void showProgressDialog() {
    }
    
    public final void hideProgressDialog() {
    }
    
    public final void showErrorDialog(@org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String message, boolean titleFullRed) {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    public final void _getHeaderData(@org.jetbrains.annotations.NotNull
    com.recipe.search.data.prefs.PreferenceManager mPrefs) {
    }
    
    public void runAnimatedIcon() {
    }
}