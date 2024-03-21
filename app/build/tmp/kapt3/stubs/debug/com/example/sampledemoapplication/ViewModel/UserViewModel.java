package com.example.sampledemoapplication.ViewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00100\u000fJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0015\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/example/sampledemoapplication/ViewModel/UserViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "apiService", "Lcom/example/sampledemoapplication/ApiService/ApiService;", "repository", "Lcom/example/sampledemoapplication/databaseHelper/UserRepository;", "delUserInfo", "", "user", "Lcom/example/sampledemoapplication/databaseHelper/UserInfo;", "(Lcom/example/sampledemoapplication/databaseHelper/UserInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocalUserInfo", "Landroidx/lifecycle/LiveData;", "", "getUserInfo", "insertUserInfo", "Lkotlinx/coroutines/Job;", "loadDataFromServer", "callback", "Lcom/example/sampledemoapplication/constants/DataCallback;", "postDataToServer", "userModel", "Lcom/example/sampledemoapplication/databaseHelper/UserInfoNew;", "Lcom/example/sampledemoapplication/view/AddDetailsActivity;", "updateDataToLocal", "Lcom/example/sampledemoapplication/view/EditDetailsActivity;", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.sampledemoapplication.ApiService.ApiService apiService = null;
    private final com.example.sampledemoapplication.databaseHelper.UserRepository repository = null;
    
    public UserViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    public final void loadDataFromServer(@org.jetbrains.annotations.NotNull
    com.example.sampledemoapplication.constants.DataCallback callback) {
    }
    
    public final void postDataToServer(@org.jetbrains.annotations.Nullable
    com.example.sampledemoapplication.databaseHelper.UserInfoNew userModel, @org.jetbrains.annotations.NotNull
    com.example.sampledemoapplication.view.AddDetailsActivity callback) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job insertUserInfo(@org.jetbrains.annotations.NotNull
    com.example.sampledemoapplication.databaseHelper.UserInfo user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.sampledemoapplication.databaseHelper.UserInfo>> getLocalUserInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.sampledemoapplication.databaseHelper.UserInfo> getUserInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job updateDataToLocal(@org.jetbrains.annotations.NotNull
    com.example.sampledemoapplication.databaseHelper.UserInfo user, @org.jetbrains.annotations.NotNull
    com.example.sampledemoapplication.view.EditDetailsActivity callback) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object delUserInfo(@org.jetbrains.annotations.NotNull
    com.example.sampledemoapplication.databaseHelper.UserInfo user, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}