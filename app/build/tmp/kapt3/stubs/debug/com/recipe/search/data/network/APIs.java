package com.recipe.search.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0019\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0012\u0010\bR\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/recipe/search/data/network/APIs;", "", "()V", "BASE_URL", "", "CACHING_URLs", "", "getCACHING_URLs", "()[Ljava/lang/String;", "[Ljava/lang/String;", "COMMENT_LIST", "GET_APP_VERSION", "GET_MERCHANT_PROFILE", "GET_merchant_PROFILE", "HOMEPAGE", "LOGIN", "LOGOUT", "NO_AUTH_URLs", "getNO_AUTH_URLs", "REGISTRATION", "SPLASH", "STORE_DEVICE_TOKEN", "TRANSACTION_DETAILS", "TRANSACTION_LIST", "TRANSACTION_SUMMERY", "UPDATE_ATTACHMENT", "UPDATE_BANK_DETAILS", "UPDATE_MERCHANT_DETAILS", "UPDATE_MERCHANT_PASSWORD", "UPDATE_MERCHANT_PROFILE", "UPLOAD_INVOICE", "app_debug"})
public final class APIs {
    @org.jetbrains.annotations.NotNull
    public static final com.recipe.search.data.network.APIs INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BASE_URL = "https://sandboxdev.walletmix.com/api/";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GET_APP_VERSION = "https://sandboxdev.walletmix.com/api//app-version";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GET_merchant_PROFILE = "https://sandboxdev.walletmix.com/api/get-profile-details";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LOGIN = "https://sandboxdev.walletmix.com/api/login";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REGISTRATION = "https://sandboxdev.walletmix.com/api/signup";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LOGOUT = "https://sandboxdev.walletmix.com/api/log-out";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String UPDATE_MERCHANT_PASSWORD = "https://sandboxdev.walletmix.com/api/update-merchant-password";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GET_MERCHANT_PROFILE = "https://sandboxdev.walletmix.com/api/get-profile-details";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String UPDATE_MERCHANT_DETAILS = "https://sandboxdev.walletmix.com/api/update-merchant-details";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String UPDATE_BANK_DETAILS = "https://sandboxdev.walletmix.com/api/update-merchant-bank-details";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String UPDATE_MERCHANT_PROFILE = "https://sandboxdev.walletmix.com/api/update-merchant-profile-details";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String UPDATE_ATTACHMENT = "https://sandboxdev.walletmix.com/api/update-merchant-documents";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String STORE_DEVICE_TOKEN = "https://sandboxdev.walletmix.com/api/store-device-token";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SPLASH = "https://sandboxdev.walletmix.com/api/splash";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String HOMEPAGE = "https://sandboxdev.walletmix.com/api/home-page";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TRANSACTION_LIST = "https://sandboxdev.walletmix.com/api/transaction-list";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TRANSACTION_DETAILS = "https://sandboxdev.walletmix.com/api/transaction-details";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TRANSACTION_SUMMERY = "https://sandboxdev.walletmix.com/api/transaction-summery";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String UPLOAD_INVOICE = "https://sandboxdev.walletmix.com/api/upload-invoice/{id}";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COMMENT_LIST = "https://sandboxdev.walletmix.com/api/transaction-comments";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] NO_AUTH_URLs = {"https://sandboxdev.walletmix.com/api/https://sandboxdev.walletmix.com/api//app-version", "https://sandboxdev.walletmix.com/api/https://sandboxdev.walletmix.com/api/login", "https://sandboxdev.walletmix.com/api/https://sandboxdev.walletmix.com/api/signup"};
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] CACHING_URLs = {"https://sandboxdev.walletmix.com/api/https://sandboxdev.walletmix.com/api/login"};
    
    private APIs() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] getNO_AUTH_URLs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] getCACHING_URLs() {
        return null;
    }
}