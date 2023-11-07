package com.recipe.search.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/recipe/search/data/network/APIs;", "", "()V", "BASE_URL", "", "CACHING_URLs", "", "getCACHING_URLs", "()[Ljava/lang/String;", "[Ljava/lang/String;", "DETAILS", "LOGIN", "SEARCH", "app_debug"})
public final class APIs {
    @org.jetbrains.annotations.NotNull
    public static final com.recipe.search.data.network.APIs INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BASE_URL = "https://forkify-api.herokuapp.com/api/";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SEARCH = "https://forkify-api.herokuapp.com/api/search";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DETAILS = "https://forkify-api.herokuapp.com/api/get";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LOGIN = "https://forkify-api.herokuapp.com/api/login";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] CACHING_URLs = {"https://forkify-api.herokuapp.com/api/https://forkify-api.herokuapp.com/api/login"};
    
    private APIs() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] getCACHING_URLs() {
        return null;
    }
}