package com.example.sampledemoapplication.databaseHelper;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u000bH\'J\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/sampledemoapplication/databaseHelper/UserDao;", "", "InsertUserDetails", "", "userInfo", "Lcom/example/sampledemoapplication/databaseHelper/UserInfo;", "(Lcom/example/sampledemoapplication/databaseHelper/UserInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUser", "getAllUsersDetails", "", "getAllUsersDetailsLocal", "Landroidx/lifecycle/LiveData;", "updateUser", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object InsertUserDetails(@org.jetbrains.annotations.NotNull
    com.example.sampledemoapplication.databaseHelper.UserInfo userInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM userinfo_table")
    public abstract java.util.List<com.example.sampledemoapplication.databaseHelper.UserInfo> getAllUsersDetails();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM userinfo_table ORDER BY id DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.sampledemoapplication.databaseHelper.UserInfo>> getAllUsersDetailsLocal();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Update
    public abstract java.lang.Object updateUser(@org.jetbrains.annotations.NotNull
    com.example.sampledemoapplication.databaseHelper.UserInfo userInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteUser(@org.jetbrains.annotations.NotNull
    com.example.sampledemoapplication.databaseHelper.UserInfo userInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}