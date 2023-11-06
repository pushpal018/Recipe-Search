package com.recipe.search.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/recipe/search/data/network/RetrofitApiClient;", "", "()V", "CACHE_SIZE", "", "HEADER_CACHE_CONTROL", "", "HEADER_PRAGMA", "MAX_AGE", "MAX_STALE", "i", "getI", "()I", "setI", "(I)V", "getRetrofit", "Lretrofit2/Retrofit;", "context", "Landroid/content/Context;", "networkUtils", "Lcom/recipe/search/utils/NetworkUtils;", "pref", "Lcom/recipe/search/data/prefs/PreferenceManager;", "getUnsafeOkHttpClient", "Lokhttp3/OkHttpClient$Builder;", "app_debug"})
public final class RetrofitApiClient {
    @org.jetbrains.annotations.NotNull
    public static final com.recipe.search.data.network.RetrofitApiClient INSTANCE = null;
    private static final java.lang.String HEADER_CACHE_CONTROL = "Cache-Control";
    private static final java.lang.String HEADER_PRAGMA = "Pragma";
    private static final int CACHE_SIZE = 10485760;
    private static final int MAX_AGE = 10;
    private static final int MAX_STALE = 1;
    private static int i = 0;
    
    private RetrofitApiClient() {
        super();
    }
    
    public final int getI() {
        return 0;
    }
    
    public final void setI(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit getRetrofit(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.recipe.search.utils.NetworkUtils networkUtils, @org.jetbrains.annotations.NotNull
    com.recipe.search.data.prefs.PreferenceManager pref) {
        return null;
    }
    
    private final okhttp3.OkHttpClient.Builder getUnsafeOkHttpClient() {
        return null;
    }
}