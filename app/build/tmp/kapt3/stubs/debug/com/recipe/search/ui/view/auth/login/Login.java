package com.recipe.search.ui.view.auth.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/recipe/search/ui/view/auth/login/Login;", "", "myContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getMyContext", "()Landroid/content/Context;", "setMyContext", "validation", "Lcom/recipe/search/utils/ValidationUtils;", "checkSignupValidation", "", "email", "", "password", "app_debug"})
public final class Login {
    @org.jetbrains.annotations.NotNull
    private android.content.Context myContext;
    private com.recipe.search.utils.ValidationUtils validation;
    
    public Login(@org.jetbrains.annotations.NotNull
    android.content.Context myContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getMyContext() {
        return null;
    }
    
    public final void setMyContext(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    public final boolean checkSignupValidation(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return false;
    }
}