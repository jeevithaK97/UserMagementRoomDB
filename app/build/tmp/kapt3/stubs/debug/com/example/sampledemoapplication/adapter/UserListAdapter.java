package com.example.sampledemoapplication.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/sampledemoapplication/adapter/UserListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/sampledemoapplication/adapter/UserListAdapter$UserViewHolder;", "userList", "", "Lcom/example/sampledemoapplication/databaseHelper/UserInfo;", "itemClickListener", "Lcom/example/sampledemoapplication/view/MainActivity;", "(Ljava/util/List;Lcom/example/sampledemoapplication/view/MainActivity;)V", "getUserList", "()Ljava/util/List;", "setUserList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "UserViewHolder", "app_debug"})
public final class UserListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.sampledemoapplication.adapter.UserListAdapter.UserViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.sampledemoapplication.databaseHelper.UserInfo> userList;
    private final com.example.sampledemoapplication.view.MainActivity itemClickListener = null;
    
    public UserListAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.sampledemoapplication.databaseHelper.UserInfo> userList, @org.jetbrains.annotations.NotNull
    com.example.sampledemoapplication.view.MainActivity itemClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.sampledemoapplication.databaseHelper.UserInfo> getUserList() {
        return null;
    }
    
    public final void setUserList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.sampledemoapplication.databaseHelper.UserInfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.sampledemoapplication.adapter.UserListAdapter.UserViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.sampledemoapplication.adapter.UserListAdapter.UserViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/sampledemoapplication/adapter/UserListAdapter$UserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/sampledemoapplication/databinding/UserItemListBinding;", "(Lcom/example/sampledemoapplication/adapter/UserListAdapter;Lcom/example/sampledemoapplication/databinding/UserItemListBinding;)V", "bind", "", "user", "Lcom/example/sampledemoapplication/databaseHelper/UserInfo;", "app_debug"})
    public final class UserViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.sampledemoapplication.databinding.UserItemListBinding binding = null;
        
        public UserViewHolder(@org.jetbrains.annotations.NotNull
        com.example.sampledemoapplication.databinding.UserItemListBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.example.sampledemoapplication.databaseHelper.UserInfo user) {
        }
    }
}