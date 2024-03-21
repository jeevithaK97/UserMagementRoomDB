package com.example.sampledemoapplication.constants;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/example/sampledemoapplication/constants/DataCallback;", "", "onDataLoaded", "", "userResponse", "", "Lcom/example/sampledemoapplication/databaseHelper/UserInfo;", "onFailure", "message", "", "app_debug"})
public abstract interface DataCallback {
    
    public abstract void onDataLoaded(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.sampledemoapplication.databaseHelper.UserInfo> userResponse);
    
    public abstract void onFailure(@org.jetbrains.annotations.NotNull
    java.lang.String message);
}