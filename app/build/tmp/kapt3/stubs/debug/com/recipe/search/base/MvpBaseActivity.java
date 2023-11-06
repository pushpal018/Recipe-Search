package com.recipe.search.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00ce\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010X\u001a\u00020YH\u0016J\b\u0010Z\u001a\u00020[H&J\b\u0010\\\u001a\u00020]H\u0016J\b\u0010^\u001a\u00020YH\u0004J\u0006\u0010_\u001a\u00020YJ\u0012\u0010`\u001a\u00020Y2\b\u0010a\u001a\u0004\u0018\u00010bH\u0014J\b\u0010c\u001a\u00020YH\u0014J\u0010\u0010d\u001a\u00020Y2\u0006\u0010e\u001a\u00020\bH\u0016J\b\u0010f\u001a\u00020YH\u0016J\u0010\u0010g\u001a\u00020Y2\u0006\u0010h\u001a\u00020\bH\u0016J\b\u0010i\u001a\u00020YH\u0016J\b\u0010j\u001a\u00020YH\u0016J\u0010\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020nH\u0016J\b\u0010o\u001a\u00020YH\u0016J\b\u0010p\u001a\u00020YH\u0016J\u0010\u0010q\u001a\u00020Y2\u0006\u0010r\u001a\u00020\bH\u0016J\b\u0010s\u001a\u00020YH\u0016J\u0010\u0010t\u001a\u00020Y2\u0006\u0010u\u001a\u00020\bH\u0016J\u0010\u0010v\u001a\u00020Y2\u0006\u0010u\u001a\u00020\bH\u0016J\u0010\u0010w\u001a\u00020Y2\u0006\u0010x\u001a\u00020\bH\u0016J,\u0010y\u001a\u00020Y2\"\u0010z\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0{j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`|H\u0016J\u001a\u0010}\u001a\u00020Y2\b\u0010a\u001a\u0004\u0018\u00010b2\u0006\u0010~\u001a\u00020\u007fH&J\u0012\u0010\u0080\u0001\u001a\u00020Y2\u0007\u0010\u0081\u0001\u001a\u00020\u000eH\u0016J\u001e\u0010\u0082\u0001\u001a\u00020Y2\u000b\b\u0002\u0010\u0083\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010e\u001a\u00020\bH\u0004J6\u0010\u0084\u0001\u001a\u00020Y2\u000b\b\u0002\u0010\u0083\u0001\u001a\u0004\u0018\u00010\b2\b\u0010e\u001a\u0004\u0018\u00010\b2\t\b\u0002\u0010\u0085\u0001\u001a\u00020l2\t\b\u0002\u0010\u0086\u0001\u001a\u00020 H\u0004J\u0011\u0010\u0087\u0001\u001a\u00020Y2\u0006\u0010e\u001a\u00020\bH\u0004J+\u0010\u0088\u0001\u001a\u00020Y2\u000b\b\u0002\u0010\u0083\u0001\u001a\u0004\u0018\u00010\b2\b\u0010e\u001a\u0004\u0018\u00010\b2\t\b\u0002\u0010\u0086\u0001\u001a\u00020 H\u0004J0\u0010\u0089\u0001\u001a\u00020Y2\u000b\b\u0002\u0010\u0083\u0001\u001a\u0004\u0018\u00010\b2\b\u0010e\u001a\u0004\u0018\u00010\b2\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00030\u008b\u0001H\u0004JD\u0010\u008c\u0001\u001a\u00020Y2\u000b\b\u0002\u0010\u0083\u0001\u001a\u0004\u0018\u00010\b2\b\u0010e\u001a\u0004\u0018\u00010\b2\f\u0010\u008a\u0001\u001a\u0007\u0012\u0002\b\u00030\u008b\u00012\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010\b2\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010bH\u0004J\u0010\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020=0\u0090\u0001H\u0016R\u001b\u0010\u0007\u001a\u00020\b8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\n\"\u0004\b3\u00104R\u001e\u00105\u001a\u0002068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010B\u001a\u00020C8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010H\u001a\u00020I8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR \u0010N\u001a\u00028\u00008\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0002\u0010S\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0010\u0010T\u001a\u0004\u0018\u00010UX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010V\u001a\u0004\u0018\u00010WX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0091\u0001"}, d2 = {"Lcom/recipe/search/base/MvpBaseActivity;", "P", "Lcom/recipe/search/base/BaseContract$Presenter;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/recipe/search/base/BaseContract$View;", "Ldagger/android/support/HasSupportFragmentInjector;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "TAG$delegate", "Lkotlin/Lazy;", "appBarLayoutBinding", "Lcom/recipe/search/databinding/AppBarLayoutBinding;", "getAppBarLayoutBinding", "()Lcom/recipe/search/databinding/AppBarLayoutBinding;", "setAppBarLayoutBinding", "(Lcom/recipe/search/databinding/AppBarLayoutBinding;)V", "dialogError", "Lcom/recipe/search/ui/view/dialog/DialogError;", "getDialogError", "()Lcom/recipe/search/ui/view/dialog/DialogError;", "setDialogError", "(Lcom/recipe/search/ui/view/dialog/DialogError;)V", "dialogSuccess", "Lcom/recipe/search/ui/view/dialog/DialogSuccess;", "getDialogSuccess", "()Lcom/recipe/search/ui/view/dialog/DialogSuccess;", "setDialogSuccess", "(Lcom/recipe/search/ui/view/dialog/DialogSuccess;)V", "flag", "", "getFlag", "()I", "setFlag", "(I)V", "loader", "Landroid/app/AlertDialog;", "getLoader", "()Landroid/app/AlertDialog;", "setLoader", "(Landroid/app/AlertDialog;)V", "mAlertService", "Lcom/recipe/search/utils/MyAlertService;", "getMAlertService", "()Lcom/recipe/search/utils/MyAlertService;", "setMAlertService", "(Lcom/recipe/search/utils/MyAlertService;)V", "mAppLanguage", "getMAppLanguage", "setMAppLanguage", "(Ljava/lang/String;)V", "mAppLogger", "Lcom/recipe/search/utils/AppLogger;", "getMAppLogger", "()Lcom/recipe/search/utils/AppLogger;", "setMAppLogger", "(Lcom/recipe/search/utils/AppLogger;)V", "mFragmentInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroidx/fragment/app/Fragment;", "getMFragmentInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setMFragmentInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "mNetworkUtils", "Lcom/recipe/search/utils/NetworkUtils;", "getMNetworkUtils", "()Lcom/recipe/search/utils/NetworkUtils;", "setMNetworkUtils", "(Lcom/recipe/search/utils/NetworkUtils;)V", "mPrefManager", "Lcom/recipe/search/data/prefs/PreferenceManager;", "getMPrefManager", "()Lcom/recipe/search/data/prefs/PreferenceManager;", "setMPrefManager", "(Lcom/recipe/search/data/prefs/PreferenceManager;)V", "mPresenter", "getMPresenter", "()Lcom/recipe/search/base/BaseContract$Presenter;", "setMPresenter", "(Lcom/recipe/search/base/BaseContract$Presenter;)V", "Lcom/recipe/search/base/BaseContract$Presenter;", "progressDialog", "Landroid/app/ProgressDialog;", "unBinder", "Lbutterknife/Unbinder;", "applyForcePinReset", "", "getContentView", "Landroid/view/View;", "getContext", "Landroid/content/Context;", "hideProgressDialog", "loadAppLanguage", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onExpectationFailed", "message", "onNetworkCallEnded", "onNetworkCallStarted", "loadingMessage", "onNetworkError", "onNetworkUnavailable", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onServerError", "onSystemUpgrading", "onTestError", "error", "onTimeOutError", "onUserDidTooManyAttempts", "errorMsg", "onUserDisabled", "onUserUnauthorized", "errorMessage", "onValidationFailed", "messages", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "onViewReady", "intent", "Landroid/content/Intent;", "setAppBar", "binding", "showAlert", "title", "showErrorDialog", "titleFullRed", "animId", "showProgressDialog", "showSuccessDialog", "showSuccessWithNavigateDialog", "destination_activity", "Ljava/lang/Class;", "showSuccessWithNavigateDialogWithBundle", "bundle_key", "bundle", "supportFragmentInjector", "Ldagger/android/AndroidInjector;", "app_debug"})
public abstract class MvpBaseActivity<P extends com.recipe.search.base.BaseContract.Presenter> extends androidx.appcompat.app.AppCompatActivity implements com.recipe.search.base.BaseContract.View, dagger.android.support.HasSupportFragmentInjector {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy TAG$delegate = null;
    private android.app.ProgressDialog progressDialog;
    private butterknife.Unbinder unBinder;
    private int flag = 0;
    @javax.inject.Inject
    public dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> mFragmentInjector;
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
    public com.recipe.search.databinding.AppBarLayoutBinding appBarLayoutBinding;
    @org.jetbrains.annotations.Nullable
    private java.lang.String mAppLanguage;
    @org.jetbrains.annotations.Nullable
    private android.app.AlertDialog loader;
    @org.jetbrains.annotations.Nullable
    private com.recipe.search.ui.view.dialog.DialogError dialogError;
    @org.jetbrains.annotations.Nullable
    private com.recipe.search.ui.view.dialog.DialogSuccess dialogSuccess;
    
    public MvpBaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final java.lang.String getTAG() {
        return null;
    }
    
    public final int getFlag() {
        return 0;
    }
    
    public final void setFlag(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> getMFragmentInjector() {
        return null;
    }
    
    public final void setMFragmentInjector(@org.jetbrains.annotations.NotNull
    dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> p0) {
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
    public final com.recipe.search.databinding.AppBarLayoutBinding getAppBarLayoutBinding() {
        return null;
    }
    
    public final void setAppBarLayoutBinding(@org.jetbrains.annotations.NotNull
    com.recipe.search.databinding.AppBarLayoutBinding p0) {
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
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public void setAppBar(@org.jetbrains.annotations.NotNull
    com.recipe.search.databinding.AppBarLayoutBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract android.view.View getContentView();
    
    public abstract void onViewReady(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.NotNull
    android.content.Intent intent);
    
    protected final void showProgressDialog(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    protected final void showSuccessDialog(@org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String message, int animId) {
    }
    
    protected final void showSuccessWithNavigateDialog(@org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String message, @org.jetbrains.annotations.NotNull
    java.lang.Class<androidx.appcompat.app.AppCompatActivity> destination_activity) {
    }
    
    protected final void showSuccessWithNavigateDialogWithBundle(@org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String message, @org.jetbrains.annotations.NotNull
    java.lang.Class<?> destination_activity, @org.jetbrains.annotations.Nullable
    java.lang.String bundle_key, @org.jetbrains.annotations.Nullable
    android.os.Bundle bundle) {
    }
    
    protected final void showErrorDialog(@org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String message, boolean titleFullRed, int animId) {
    }
    
    protected final void hideProgressDialog() {
    }
    
    protected final void showAlert(@org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    protected void onDestroy() {
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
    public void onSystemUpgrading() {
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
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dagger.android.AndroidInjector<androidx.fragment.app.Fragment> supportFragmentInjector() {
        return null;
    }
    
    public final void loadAppLanguage() {
    }
}