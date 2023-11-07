package com.recipe.search.service.sms_retriver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/recipe/search/service/sms_retriver/SMSReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "OTP_REGEX", "", "getOTP_REGEX", "()Ljava/lang/String;", "otpListener", "Lcom/recipe/search/service/sms_retriver/SMSReceiver$OTPReceiveListener;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "setOTPListener", "OTPReceiveListener", "app_debug"})
public final class SMSReceiver extends android.content.BroadcastReceiver {
    private com.recipe.search.service.sms_retriver.SMSReceiver.OTPReceiveListener otpListener;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String OTP_REGEX = "(?<!\\d)\\d{6}(?!\\d)";
    
    public SMSReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOTP_REGEX() {
        return null;
    }
    
    public final void setOTPListener(@org.jetbrains.annotations.Nullable
    com.recipe.search.service.sms_retriver.SMSReceiver.OTPReceiveListener otpListener) {
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/recipe/search/service/sms_retriver/SMSReceiver$OTPReceiveListener;", "", "onOTPReceived", "", "otp", "", "app_debug"})
    public static abstract interface OTPReceiveListener {
        
        public abstract void onOTPReceived(@org.jetbrains.annotations.Nullable
        java.lang.String otp);
    }
}