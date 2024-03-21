package com.example.sampledemoapplication.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/example/sampledemoapplication/adapter/UserItemClickListener;", "", "onDeleteItemClick", "", "userId", "Lcom/example/sampledemoapplication/databaseHelper/UserInfo;", "onEditItemClick", "onItemClick", "user", "app_debug"})
public abstract interface UserItemClickListener {
    
    public abstract void onItemClick(@org.jetbrains.annotations.NotNull
    com.example.sampledemoapplication.databaseHelper.UserInfo user);
    
    public abstract void onEditItemClick(@org.jetbrains.annotations.NotNull
    com.example.sampledemoapplication.databaseHelper.UserInfo userId);
    
    public abstract void onDeleteItemClick(@org.jetbrains.annotations.NotNull
    com.example.sampledemoapplication.databaseHelper.UserInfo userId);
}