package com.recipe.search.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH$J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/recipe/search/base/BasePagingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "<set-?>", "", "currentPosition", "getCurrentPosition", "()I", "clear", "", "onBind", "position", "app_debug"})
public abstract class BasePagingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private int currentPosition = 0;
    
    public BasePagingViewHolder(@org.jetbrains.annotations.Nullable
    android.view.View itemView) {
        super(null);
    }
    
    public final int getCurrentPosition() {
        return 0;
    }
    
    protected abstract void clear();
    
    public void onBind(int position) {
    }
}