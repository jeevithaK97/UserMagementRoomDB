package com.example.sampledemoapplication.constants

import com.example.sampledemoapplication.databaseHelper.UserInfo


interface DataCallback {
    fun onDataLoaded(userResponse: List<UserInfo>)
    fun onFailure(message: String)
}