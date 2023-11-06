package com.recipe.search.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 X2\u00020\u0001:\u0001XB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000eH\u0007J\u0016\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000eJ\"\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000eJ\u0010\u0010!\u001a\u00020\"2\b\b\u0001\u0010\u000f\u001a\u00020\u0010J\u0012\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010\u000eJ\u0016\u0010&\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020\"J\u0012\u0010(\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J\u000e\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u000eJ\u0018\u0010+\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u000eJ\u0010\u0010-\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010J\u0018\u0010.\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u00020\"J\u0006\u00102\u001a\u00020\"J\u000e\u00103\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u00104\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u00105\u001a\u00020\u00142\u0006\u00106\u001a\u000207J\u0006\u00108\u001a\u00020\u0004J&\u00109\u001a\u00020\u0004\"\b\b\u0000\u0010:*\u00020;2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010<\u001a\b\u0012\u0004\u0012\u0002H:0=J\u001a\u0010>\u001a\u00020\u00142\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010?\u001a\u00020\u000eJ\u001e\u0010@\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010A\u001a\u0002002\u0006\u0010B\u001a\u00020\"J\u0016\u0010@\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\"J\u0016\u0010C\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u000eJ\u0016\u0010E\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\"J\u0016\u0010F\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010G\u001a\u00020\u000eJ\u0016\u0010H\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010I\u001a\u00020\u001cJ\u001e\u0010J\u001a\u00020\u00142\u0006\u0010K\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u000eJ\u0016\u0010N\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010O\u001a\u00020PJ \u0010Q\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010R\u001a\u00020SJ\u0016\u0010T\u001a\u00020\u00142\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\"R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006Y"}, d2 = {"Lcom/recipe/search/utils/AppUtils;", "", "()V", "isDebug", "", "()Z", "mLastClickTime", "", "getMLastClickTime", "()J", "setMLastClickTime", "(J)V", "appInstalledOrNot", "uri", "", "context", "Landroid/content/Context;", "packageManager", "Landroid/content/pm/PackageManager;", "call", "", "phoneNumber", "dial", "downloadPdf", "baseActivity", "url", "title", "dpFromPx", "", "px", "fromHtml", "Landroid/text/Spanned;", "html", "getAppVersion", "", "getBitmapFromURL", "Landroid/graphics/Bitmap;", "src", "getBitmapFromVectorDrawable", "drawableId", "getDeviceId", "getInBangla", "string", "getJsonDataFromAsset", "fileName", "getLauncherActivity", "getRealPathFromURI", "contentUri", "Landroid/net/Uri;", "getScreenHeight", "getScreenWidth", "getVersionName", "goToSettings", "hideKeyboard", "activity", "Landroid/app/Activity;", "isOpenRecently", "isServiceRunning", "S", "Landroid/app/Service;", "serviceClass", "Ljava/lang/Class;", "openAppOnPlayStore", "packageName", "openCamera", "imageUri", "REQUEST_CODE", "openFacebookPage", "FB_PAGE_URL", "openGallery", "openLinkOnExternalBrowser", "link", "pxFromDp", "dp", "sendSMS", "mContext", "phoneNo", "messageInfo", "setLocale", "appLanguage", "Lcom/walletmix/merchant/utils/Keys/AppLanguage;", "showImage", "imageView", "Landroid/widget/ImageView;", "showIntegerValueWithAnim", "textView", "Landroid/widget/TextView;", "value", "Companion", "app_debug"})
public final class AppUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.recipe.search.utils.AppUtils.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final com.recipe.search.utils.AppUtils shared = null;
    private long mLastClickTime = 0L;
    
    private AppUtils() {
        super();
    }
    
    public final long getMLastClickTime() {
        return 0L;
    }
    
    public final void setMLastClickTime(long p0) {
    }
    
    public final boolean isDebug() {
        return false;
    }
    
    public final boolean isOpenRecently() {
        return false;
    }
    
    public final int getAppVersion(@org.jetbrains.annotations.NotNull
    @androidx.annotation.NonNull
    android.content.Context context) {
        return 0;
    }
    
    public final int getScreenWidth() {
        return 0;
    }
    
    public final int getScreenHeight() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVersionName(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    public final void openAppOnPlayStore(@org.jetbrains.annotations.NotNull
    @androidx.annotation.NonNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String packageName) {
    }
    
    public final boolean appInstalledOrNot(@org.jetbrains.annotations.NotNull
    java.lang.String uri, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.content.pm.PackageManager packageManager) {
        return false;
    }
    
    public final long downloadPdf(@org.jetbrains.annotations.NotNull
    android.content.Context baseActivity, @org.jetbrains.annotations.Nullable
    java.lang.String url, @org.jetbrains.annotations.Nullable
    java.lang.String title) {
        return 0L;
    }
    
    public final void showImage(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String url, @org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView) {
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    public final float dpFromPx(@org.jetbrains.annotations.NotNull
    android.content.Context context, float px) {
        return 0.0F;
    }
    
    public final float pxFromDp(@org.jetbrains.annotations.NotNull
    android.content.Context context, float dp) {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    public final java.lang.String getDeviceId(@org.jetbrains.annotations.NotNull
    @androidx.annotation.NonNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLauncherActivity(@org.jetbrains.annotations.NotNull
    @androidx.annotation.NonNull
    android.content.Context context) {
        return null;
    }
    
    public final <S extends android.app.Service>boolean isServiceRunning(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.Class<S> serviceClass) {
        return false;
    }
    
    public final void setLocale(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.walletmix.merchant.utils.Keys.AppLanguage appLanguage) {
    }
    
    public final void dial(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNumber) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void call(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNumber) {
    }
    
    public final void openCamera(@org.jetbrains.annotations.NotNull
    android.content.Context context, int REQUEST_CODE) {
    }
    
    public final void openCamera(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.net.Uri imageUri, int REQUEST_CODE) {
    }
    
    public final void openGallery(@org.jetbrains.annotations.NotNull
    android.content.Context context, int REQUEST_CODE) {
    }
    
    public final void goToSettings(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void openLinkOnExternalBrowser(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String link) {
    }
    
    public final void openFacebookPage(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String FB_PAGE_URL) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Bitmap getBitmapFromVectorDrawable(@org.jetbrains.annotations.NotNull
    android.content.Context context, int drawableId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.SuppressWarnings(value = {"deprecation"})
    public final android.text.Spanned fromHtml(@org.jetbrains.annotations.NotNull
    java.lang.String html) {
        return null;
    }
    
    public final void showIntegerValueWithAnim(@org.jetbrains.annotations.NotNull
    android.widget.TextView textView, int value) {
    }
    
    public final void sendSMS(@org.jetbrains.annotations.NotNull
    android.content.Context mContext, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNo, @org.jetbrains.annotations.NotNull
    java.lang.String messageInfo) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getJsonDataFromAsset(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String fileName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getInBangla(@org.jetbrains.annotations.NotNull
    java.lang.String string) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRealPathFromURI(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.net.Uri contentUri) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.Bitmap getBitmapFromURL(@org.jetbrains.annotations.Nullable
    java.lang.String src) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/recipe/search/utils/AppUtils$Companion;", "", "()V", "shared", "Lcom/recipe/search/utils/AppUtils;", "getShared", "()Lcom/recipe/search/utils/AppUtils;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.recipe.search.utils.AppUtils getShared() {
            return null;
        }
    }
}