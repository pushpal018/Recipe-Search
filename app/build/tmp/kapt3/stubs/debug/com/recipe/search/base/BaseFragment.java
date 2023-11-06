package com.recipe.search.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010J\u001a\u00020KH\u0016J\b\u0010L\u001a\u00020MH\u0016J$\u0010N\u001a\u00020C2\u0006\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010R2\b\u0010S\u001a\u0004\u0018\u00010TH$J\b\u0010U\u001a\u00020KH\u0002J\u0006\u0010V\u001a\u00020KJ\u0010\u0010W\u001a\u00020K2\u0006\u0010X\u001a\u00020MH\u0016J\u0012\u0010Y\u001a\u00020K2\b\u0010Z\u001a\u0004\u0018\u00010TH\u0016J&\u0010[\u001a\u0004\u0018\u00010C2\u0006\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010R2\b\u0010Z\u001a\u0004\u0018\u00010TH\u0016J\b\u0010\\\u001a\u00020KH\u0016J\b\u0010]\u001a\u00020KH\u0016J\u0010\u0010^\u001a\u00020K2\u0006\u0010_\u001a\u00020\u0007H\u0016J\b\u0010`\u001a\u00020KH\u0016J\u0010\u0010a\u001a\u00020K2\u0006\u0010b\u001a\u00020\u0007H\u0016J\b\u0010c\u001a\u00020KH\u0016J\b\u0010d\u001a\u00020KH\u0016J\b\u0010e\u001a\u00020KH\u0016J\b\u0010f\u001a\u00020KH\u0016J\u0010\u0010g\u001a\u00020K2\u0006\u0010h\u001a\u00020\u0007H\u0016J\b\u0010i\u001a\u00020KH\u0016J\u0010\u0010j\u001a\u00020K2\u0006\u0010k\u001a\u00020\u0007H\u0016J\u0010\u0010l\u001a\u00020K2\u0006\u0010k\u001a\u00020\u0007H\u0016J\u0010\u0010m\u001a\u00020K2\u0006\u0010n\u001a\u00020\u0007H\u0016J,\u0010o\u001a\u00020K2\"\u0010p\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070qj\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`rH\u0016J\u0012\u0010s\u001a\u00020K2\b\u0010t\u001a\u0004\u0018\u00010TH$J\u0010\u0010u\u001a\u00020K2\u0006\u0010v\u001a\u00020wH\u0016J\u001a\u0010x\u001a\u00020K2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\u00072\u0006\u0010_\u001a\u00020\u0007J0\u0010z\u001a\u00020K2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\u00072\b\u0010_\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010{\u001a\u00020|2\b\b\u0002\u0010}\u001a\u00020~J\u0010\u0010\u007f\u001a\u00020K2\u0006\u0010_\u001a\u00020\u0007H\u0002J\'\u0010\u0080\u0001\u001a\u00020K2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\u00072\b\u0010_\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010}\u001a\u00020~R\u001b\u0010\u0006\u001a\u00020\u00078DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\'R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010.\u001a\u00020/8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00104\u001a\u0002058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R \u0010:\u001a\u00028\u00008\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0002\u0010?\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010B\u001a\u00020CX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0010\u0010H\u001a\u0004\u0018\u00010IX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0081\u0001"}, d2 = {"Lcom/recipe/search/base/BaseFragment;", "P", "Lcom/recipe/search/base/BaseContract$Presenter;", "Landroidx/fragment/app/Fragment;", "Lcom/recipe/search/base/BaseContract$View;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "TAG$delegate", "Lkotlin/Lazy;", "dialogError", "Lcom/recipe/search/ui/view/dialog/DialogError;", "getDialogError", "()Lcom/recipe/search/ui/view/dialog/DialogError;", "setDialogError", "(Lcom/recipe/search/ui/view/dialog/DialogError;)V", "dialogSuccess", "Lcom/recipe/search/ui/view/dialog/DialogSuccess;", "getDialogSuccess", "()Lcom/recipe/search/ui/view/dialog/DialogSuccess;", "setDialogSuccess", "(Lcom/recipe/search/ui/view/dialog/DialogSuccess;)V", "loader", "Landroid/app/AlertDialog;", "getLoader", "()Landroid/app/AlertDialog;", "setLoader", "(Landroid/app/AlertDialog;)V", "mAlertService", "Lcom/recipe/search/utils/MyAlertService;", "getMAlertService", "()Lcom/recipe/search/utils/MyAlertService;", "setMAlertService", "(Lcom/recipe/search/utils/MyAlertService;)V", "mAppLanguage", "getMAppLanguage", "setMAppLanguage", "(Ljava/lang/String;)V", "mAppLogger", "Lcom/recipe/search/utils/AppLogger;", "getMAppLogger", "()Lcom/recipe/search/utils/AppLogger;", "setMAppLogger", "(Lcom/recipe/search/utils/AppLogger;)V", "mNetworkUtils", "Lcom/recipe/search/utils/NetworkUtils;", "getMNetworkUtils", "()Lcom/recipe/search/utils/NetworkUtils;", "setMNetworkUtils", "(Lcom/recipe/search/utils/NetworkUtils;)V", "mPrefManager", "Lcom/recipe/search/data/prefs/PreferenceManager;", "getMPrefManager", "()Lcom/recipe/search/data/prefs/PreferenceManager;", "setMPrefManager", "(Lcom/recipe/search/data/prefs/PreferenceManager;)V", "mPresenter", "getMPresenter", "()Lcom/recipe/search/base/BaseContract$Presenter;", "setMPresenter", "(Lcom/recipe/search/base/BaseContract$Presenter;)V", "Lcom/recipe/search/base/BaseContract$Presenter;", "progressDialog", "Landroid/app/ProgressDialog;", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "viewUnbinder", "Lbutterknife/Unbinder;", "applyForcePinReset", "", "getContext", "Landroid/content/Context;", "getFragmentView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "saveInstanceState", "Landroid/os/Bundle;", "hideProgressDialog", "loadAppLanguage", "onAttach", "context", "onCreate", "savedInstanceState", "onCreateView", "onDestroy", "onDestroyView", "onExpectationFailed", "message", "onNetworkCallEnded", "onNetworkCallStarted", "loadingMessage", "onNetworkError", "onNetworkUnavailable", "onServerError", "onSystemUpgrading", "onTestError", "error", "onTimeOutError", "onUserDidTooManyAttempts", "errorMsg", "onUserDisabled", "onUserUnauthorized", "errorMessage", "onValidationFailed", "messages", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "onViewReady", "getArguments", "setAppBar", "binding", "Lcom/recipe/search/databinding/AppBarLayoutBinding;", "showAlert", "title", "showErrorDialog", "titleFullRed", "", "animId", "", "showProgressDialog", "showSuccessDialog", "app_debug"})
public abstract class BaseFragment<P extends com.recipe.search.base.BaseContract.Presenter> extends androidx.fragment.app.Fragment implements com.recipe.search.base.BaseContract.View {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy TAG$delegate = null;
    private android.app.ProgressDialog progressDialog;
    private butterknife.Unbinder viewUnbinder;
    @javax.inject.Inject
    public P mPresenter;
    @javax.inject.Inject
    public com.recipe.search.utils.MyAlertService mAlertService;
    @javax.inject.Inject
    public com.recipe.search.utils.NetworkUtils mNetworkUtils;
    @javax.inject.Inject
    public com.recipe.search.utils.AppLogger mAppLogger;
    @javax.inject.Inject
    public com.recipe.search.data.prefs.PreferenceManager mPrefManager;
    public android.view.View rootView;
    @org.jetbrains.annotations.Nullable
    private java.lang.String mAppLanguage;
    @org.jetbrains.annotations.Nullable
    private android.app.AlertDialog loader;
    @org.jetbrains.annotations.Nullable
    private com.recipe.search.ui.view.dialog.DialogError dialogError;
    @org.jetbrains.annotations.Nullable
    private com.recipe.search.ui.view.dialog.DialogSuccess dialogSuccess;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final P getMPresenter() {
        return null;
    }
    
    public final void setMPresenter(@org.jetbrains.annotations.NotNull
    P p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.recipe.search.utils.MyAlertService getMAlertService() {
        return null;
    }
    
    public final void setMAlertService(@org.jetbrains.annotations.NotNull
    com.recipe.search.utils.MyAlertService p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.recipe.search.utils.NetworkUtils getMNetworkUtils() {
        return null;
    }
    
    public final void setMNetworkUtils(@org.jetbrains.annotations.NotNull
    com.recipe.search.utils.NetworkUtils p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.recipe.search.utils.AppLogger getMAppLogger() {
        return null;
    }
    
    public final void setMAppLogger(@org.jetbrains.annotations.NotNull
    com.recipe.search.utils.AppLogger p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.recipe.search.data.prefs.PreferenceManager getMPrefManager() {
        return null;
    }
    
    public final void setMPrefManager(@org.jetbrains.annotations.NotNull
    com.recipe.search.data.prefs.PreferenceManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.view.View getRootView() {
        return null;
    }
    
    public final void setRootView(@org.jetbrains.annotations.NotNull
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMAppLanguage() {
        return null;
    }
    
    public final void setMAppLanguage(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.app.AlertDialog getLoader() {
        return null;
    }
    
    public final void setLoader(@org.jetbrains.annotations.Nullable
    android.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.recipe.search.ui.view.dialog.DialogError getDialogError() {
        return null;
    }
    
    public final void setDialogError(@org.jetbrains.annotations.Nullable
    com.recipe.search.ui.view.dialog.DialogError p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.recipe.search.ui.view.dialog.DialogSuccess getDialogSuccess() {
        return null;
    }
    
    public final void setDialogSuccess(@org.jetbrains.annotations.Nullable
    com.recipe.search.ui.view.dialog.DialogSuccess p0) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public void setAppBar(@org.jetbrains.annotations.NotNull
    com.recipe.search.databinding.AppBarLayoutBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected abstract android.view.View getFragmentView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle saveInstanceState);
    
    protected abstract void onViewReady(@org.jetbrains.annotations.Nullable
    android.os.Bundle getArguments);
    
    public final void showSuccessDialog(@org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String message, int animId) {
    }
    
    public final void showErrorDialog(@org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String message, boolean titleFullRed, int animId) {
    }
    
    private final void showProgressDialog(java.lang.String message) {
    }
    
    private final void hideProgressDialog() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override
    public void onNetworkCallStarted(@org.jetbrains.annotations.NotNull
    java.lang.String loadingMessage) {
    }
    
    @java.lang.Override
    public void onNetworkCallEnded() {
    }
    
    @java.lang.Override
    public void onNetworkUnavailable() {
    }
    
    @java.lang.Override
    public void onTestError(@org.jetbrains.annotations.NotNull
    java.lang.String error) {
    }
    
    @java.lang.Override
    public void onServerError() {
    }
    
    @java.lang.Override
    public void onNetworkError() {
    }
    
    @java.lang.Override
    public void onTimeOutError() {
    }
    
    @java.lang.Override
    public void onUserDidTooManyAttempts(@org.jetbrains.annotations.NotNull
    java.lang.String errorMsg) {
    }
    
    @java.lang.Override
    public void onUserUnauthorized(@org.jetbrains.annotations.NotNull
    java.lang.String errorMessage) {
    }
    
    @java.lang.Override
    public void onUserDisabled(@org.jetbrains.annotations.NotNull
    java.lang.String errorMsg) {
    }
    
    @java.lang.Override
    public void applyForcePinReset() {
    }
    
    @java.lang.Override
    public void onExpectationFailed(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @java.lang.Override
    public void onValidationFailed(@org.jetbrains.annotations.NotNull
    java.util.LinkedHashMap<java.lang.String, java.lang.String> messages) {
    }
    
    public final void showAlert(@org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @java.lang.Override
    public void onSystemUpgrading() {
    }
    
    public final void loadAppLanguage() {
    }
}