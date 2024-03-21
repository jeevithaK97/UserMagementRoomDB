package com.example.sampledemoapplication.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020.H\u0002J\u0012\u00100\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020.H\u0016J\b\u00108\u001a\u00020.H\u0002J\b\u00109\u001a\u00020.H\u0002J\b\u0010:\u001a\u00020.H\u0002J\b\u0010;\u001a\u00020.H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\u001c\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\r\"\u0004\b\'\u0010\u000fR\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\t\u001a\u0004\b*\u0010+\u00a8\u0006<"}, d2 = {"Lcom/example/sampledemoapplication/view/EditDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/sampledemoapplication/constants/AddDetailsCallback;", "()V", "binding", "Lcom/example/sampledemoapplication/databinding/ActivityEditDetailsBinding;", "getBinding", "()Lcom/example/sampledemoapplication/databinding/ActivityEditDetailsBinding;", "binding$delegate", "Lkotlin/Lazy;", "dob", "", "getDob", "()Ljava/lang/String;", "setDob", "(Ljava/lang/String;)V", "dupGender", "getDupGender", "setDupGender", "emailId", "getEmailId", "setEmailId", "gender", "getGender", "setGender", "location", "getLocation", "setLocation", "mobileNum", "getMobileNum", "setMobileNum", "userInfo", "Lcom/example/sampledemoapplication/databaseHelper/UserInfo;", "getUserInfo", "()Lcom/example/sampledemoapplication/databaseHelper/UserInfo;", "setUserInfo", "(Lcom/example/sampledemoapplication/databaseHelper/UserInfo;)V", "userName", "getUserName", "setUserName", "viewModel", "Lcom/example/sampledemoapplication/ViewModel/UserViewModel;", "getViewModel", "()Lcom/example/sampledemoapplication/ViewModel/UserViewModel;", "viewModel$delegate", "bindData", "", "init", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onSuccess", "saveData", "setSpinner", "setToolBar", "showDatePickerDialog", "app_debug"})
public final class EditDetailsActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.sampledemoapplication.constants.AddDetailsCallback {
    private final kotlin.Lazy binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    public com.example.sampledemoapplication.databaseHelper.UserInfo userInfo;
    public java.lang.String userName;
    public java.lang.String emailId;
    public java.lang.String mobileNum;
    public java.lang.String dob;
    public java.lang.String gender;
    public java.lang.String dupGender;
    public java.lang.String location;
    
    public EditDetailsActivity() {
        super();
    }
    
    private final com.example.sampledemoapplication.databinding.ActivityEditDetailsBinding getBinding() {
        return null;
    }
    
    private final com.example.sampledemoapplication.ViewModel.UserViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.sampledemoapplication.databaseHelper.UserInfo getUserInfo() {
        return null;
    }
    
    public final void setUserInfo(@org.jetbrains.annotations.NotNull
    com.example.sampledemoapplication.databaseHelper.UserInfo p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmailId() {
        return null;
    }
    
    public final void setEmailId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMobileNum() {
        return null;
    }
    
    public final void setMobileNum(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDob() {
        return null;
    }
    
    public final void setDob(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGender() {
        return null;
    }
    
    public final void setGender(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDupGender() {
        return null;
    }
    
    public final void setDupGender(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void setToolBar() {
    }
    
    private final void saveData() {
    }
    
    private final void bindData() {
    }
    
    private final void setSpinner() {
    }
    
    private final void showDatePickerDialog() {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public void onSuccess() {
    }
}