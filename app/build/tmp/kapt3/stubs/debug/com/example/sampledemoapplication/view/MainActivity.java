package com.example.sampledemoapplication.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001dH\u0003J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J\u0012\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0016J\u0016\u0010)\u001a\u00020\u001d2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140+H\u0016J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u0014H\u0016J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u0014H\u0016J\u0010\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u0014H\u0016J\u0010\u00103\u001a\u00020&2\u0006\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020\u001dH\u0002J\u0006\u00107\u001a\u00020\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001a\u00a8\u00068"}, d2 = {"Lcom/example/sampledemoapplication/view/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/sampledemoapplication/constants/DataCallback;", "Lcom/example/sampledemoapplication/adapter/UserItemClickListener;", "()V", "adapter", "Lcom/example/sampledemoapplication/adapter/UserListAdapter;", "binding", "Lcom/example/sampledemoapplication/databinding/ActivityMainBinding;", "getBinding", "()Lcom/example/sampledemoapplication/databinding/ActivityMainBinding;", "binding$delegate", "Lkotlin/Lazy;", "mProgressDialog", "Landroid/app/ProgressDialog;", "getMProgressDialog", "()Landroid/app/ProgressDialog;", "mProgressDialog$delegate", "userList", "", "Lcom/example/sampledemoapplication/databaseHelper/UserInfo;", "getUserList", "()Ljava/util/List;", "viewModel", "Lcom/example/sampledemoapplication/ViewModel/UserViewModel;", "getViewModel", "()Lcom/example/sampledemoapplication/ViewModel/UserViewModel;", "viewModel$delegate", "hideProgress", "", "init", "loadData", "moveToDetailScreen", "moveToMapActivity", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onDataLoaded", "userResponse", "", "onDeleteItemClick", "user", "onEditItemClick", "onFailure", "message", "", "onItemClick", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setToolBar", "showProgress", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.sampledemoapplication.constants.DataCallback, com.example.sampledemoapplication.adapter.UserItemClickListener {
    private final kotlin.Lazy binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy mProgressDialog$delegate = null;
    private com.example.sampledemoapplication.adapter.UserListAdapter adapter;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.sampledemoapplication.databaseHelper.UserInfo> userList = null;
    
    public MainActivity() {
        super();
    }
    
    private final com.example.sampledemoapplication.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    private final com.example.sampledemoapplication.ViewModel.UserViewModel getViewModel() {
        return null;
    }
    
    private final android.app.ProgressDialog getMProgressDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.sampledemoapplication.databaseHelper.UserInfo> getUserList() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadData() {
    }
    
    private final void setToolBar() {
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    private final void init() {
    }
    
    private final void moveToDetailScreen() {
    }
    
    private final void moveToMapActivity() {
    }
    
    @java.lang.Override
    public void onDataLoaded(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.sampledemoapplication.databaseHelper.UserInfo> userResponse) {
    }
    
    @java.lang.Override
    public void onFailure(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @java.lang.Override
    public void onItemClick(@org.jetbrains.annotations.NotNull
    com.example.sampledemoapplication.databaseHelper.UserInfo user) {
    }
    
    @java.lang.Override
    public void onEditItemClick(@org.jetbrains.annotations.NotNull
    com.example.sampledemoapplication.databaseHelper.UserInfo user) {
    }
    
    @java.lang.Override
    public void onDeleteItemClick(@org.jetbrains.annotations.NotNull
    com.example.sampledemoapplication.databaseHelper.UserInfo user) {
    }
    
    public final void showProgress() {
    }
    
    public final void hideProgress() {
    }
    
    @java.lang.Override
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
}