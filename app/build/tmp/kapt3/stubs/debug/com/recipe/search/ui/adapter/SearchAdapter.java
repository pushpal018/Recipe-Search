package com.recipe.search.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/recipe/search/ui/adapter/SearchAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/recipe/search/ui/adapter/SearchAdapter$MyViewHolder;", "context", "Landroid/content/Context;", "recipesList", "Ljava/util/ArrayList;", "Lcom/recipe/search/data/network/api_response/Recipes;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_debug"})
public final class SearchAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.recipe.search.ui.adapter.SearchAdapter.MyViewHolder> {
    private android.content.Context context;
    private java.util.ArrayList<com.recipe.search.data.network.api_response.Recipes> recipesList;
    
    public SearchAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.recipe.search.data.network.api_response.Recipes> recipesList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.recipe.search.ui.adapter.SearchAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.recipe.search.ui.adapter.SearchAdapter.MyViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\n\u00a8\u0006 "}, d2 = {"Lcom/recipe/search/ui/adapter/SearchAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/recipe/search/ui/adapter/SearchAdapter;Landroid/view/View;)V", "publisher", "Landroid/widget/TextView;", "getPublisher", "()Landroid/widget/TextView;", "setPublisher", "(Landroid/widget/TextView;)V", "publisherUrl", "getPublisherUrl", "setPublisherUrl", "recipeId", "getRecipeId", "setRecipeId", "recipeImage", "Landroid/widget/ImageView;", "getRecipeImage", "()Landroid/widget/ImageView;", "setRecipeImage", "(Landroid/widget/ImageView;)V", "recipeTitle", "getRecipeTitle", "setRecipeTitle", "socialRank", "getSocialRank", "setSocialRank", "sourceUrl", "getSourceUrl", "setSourceUrl", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView recipeId;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView publisher;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView publisherUrl;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView socialRank;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView sourceUrl;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView recipeTitle;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView recipeImage;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getRecipeId() {
            return null;
        }
        
        public final void setRecipeId(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getPublisher() {
            return null;
        }
        
        public final void setPublisher(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getPublisherUrl() {
            return null;
        }
        
        public final void setPublisherUrl(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getSocialRank() {
            return null;
        }
        
        public final void setSocialRank(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getSourceUrl() {
            return null;
        }
        
        public final void setSourceUrl(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getRecipeTitle() {
            return null;
        }
        
        public final void setRecipeTitle(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getRecipeImage() {
            return null;
        }
        
        public final void setRecipeImage(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
    }
}