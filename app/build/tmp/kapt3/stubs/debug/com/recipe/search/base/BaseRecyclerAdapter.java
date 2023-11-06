package com.recipe.search.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001;B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010/J\"\u00100\u001a\u00020-2\u001a\u0010\u0015\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0016j\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0017J\u0006\u00101\u001a\u00020-J\u0006\u00102\u001a\u00020-J\u0015\u00103\u001a\u0004\u0018\u00018\u00002\u0006\u00104\u001a\u00020\u000e\u00a2\u0006\u0002\u00105J\b\u00106\u001a\u00020\u000eH\u0016J\u0010\u00107\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u000eH\u0016J\u0015\u00108\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010/J\u000e\u00108\u001a\u00020-2\u0006\u00104\u001a\u00020\u000eJ\u0006\u00109\u001a\u00020-J\"\u0010:\u001a\u00020-2\u001a\u0010\u0015\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0016j\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0017R\u001b\u0010\u0007\u001a\u00020\b8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R.\u0010\u0015\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0016j\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u0006<"}, d2 = {"Lcom/recipe/search/base/BaseRecyclerAdapter;", "D", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/recipe/search/base/BaseViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "TAG$delegate", "Lkotlin/Lazy;", "VIEW_TYPE_FOOTER", "", "getVIEW_TYPE_FOOTER", "()I", "VIEW_TYPE_ITEM", "getVIEW_TYPE_ITEM", "getContext", "()Landroid/content/Context;", "dataList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getDataList", "()Ljava/util/ArrayList;", "setDataList", "(Ljava/util/ArrayList;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "getLayoutInflater", "()Landroid/view/LayoutInflater;", "setLayoutInflater", "(Landroid/view/LayoutInflater;)V", "mAppLanguage", "getMAppLanguage", "setMAppLanguage", "(Ljava/lang/String;)V", "mPrefs", "Lcom/recipe/search/data/prefs/PreferenceManager;", "getMPrefs", "()Lcom/recipe/search/data/prefs/PreferenceManager;", "setMPrefs", "(Lcom/recipe/search/data/prefs/PreferenceManager;)V", "add", "", "singleData", "(Ljava/lang/Object;)V", "addAll", "addLoadingFooter", "clearAdapter", "getItem", "position", "(I)Ljava/lang/Object;", "getItemCount", "getItemViewType", "remove", "removeLoadingFooter", "setData", "FooterViewHolder", "app_debug"})
public abstract class BaseRecyclerAdapter<D extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.recipe.search.base.BaseViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy TAG$delegate = null;
    private final int VIEW_TYPE_ITEM = 1;
    private final int VIEW_TYPE_FOOTER = 2;
    @org.jetbrains.annotations.Nullable
    private java.lang.String mAppLanguage = "";
    @org.jetbrains.annotations.Nullable
    private com.recipe.search.data.prefs.PreferenceManager mPrefs;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<D> dataList;
    @org.jetbrains.annotations.NotNull
    private android.view.LayoutInflater layoutInflater;
    
    public BaseRecyclerAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final java.lang.String getTAG() {
        return null;
    }
    
    public final int getVIEW_TYPE_ITEM() {
        return 0;
    }
    
    public final int getVIEW_TYPE_FOOTER() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMAppLanguage() {
        return null;
    }
    
    public final void setMAppLanguage(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.recipe.search.data.prefs.PreferenceManager getMPrefs() {
        return null;
    }
    
    public final void setMPrefs(@org.jetbrains.annotations.Nullable
    com.recipe.search.data.prefs.PreferenceManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<D> getDataList() {
        return null;
    }
    
    public final void setDataList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<D> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final android.view.LayoutInflater getLayoutInflater() {
        return null;
    }
    
    protected final void setLayoutInflater(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater p0) {
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<D> dataList) {
    }
    
    public final void add(@org.jetbrains.annotations.Nullable
    D singleData) {
    }
    
    public final void addAll(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<D> dataList) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final D getItem(int position) {
        return null;
    }
    
    public final void addLoadingFooter() {
    }
    
    public final void removeLoadingFooter() {
    }
    
    public final void remove(@org.jetbrains.annotations.Nullable
    D singleData) {
    }
    
    public final void remove(int position) {
    }
    
    public final void clearAdapter() {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/recipe/search/base/BaseRecyclerAdapter$FooterViewHolder;", "Lcom/recipe/search/base/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "position", "", "app_debug"})
    public static final class FooterViewHolder extends com.recipe.search.base.BaseViewHolder {
        
        public FooterViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @java.lang.Override
        public void bind(int position) {
        }
    }
}