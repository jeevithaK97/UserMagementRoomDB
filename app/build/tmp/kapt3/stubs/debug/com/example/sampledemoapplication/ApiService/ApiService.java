package com.example.sampledemoapplication.ApiService;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001e\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/example/sampledemoapplication/ApiService/ApiService;", "", "getUserResponses", "Lretrofit2/Call;", "", "Lcom/example/sampledemoapplication/databaseHelper/UserInfo;", "postUserData", "Ljava/lang/Void;", "userInfoNew", "Lcom/example/sampledemoapplication/databaseHelper/UserInfoNew;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "users")
    public abstract retrofit2.Call<java.util.List<com.example.sampledemoapplication.databaseHelper.UserInfo>> getUserResponses();
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "users")
    public abstract retrofit2.Call<java.lang.Void> postUserData(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Body
    com.example.sampledemoapplication.databaseHelper.UserInfoNew userInfoNew);
}