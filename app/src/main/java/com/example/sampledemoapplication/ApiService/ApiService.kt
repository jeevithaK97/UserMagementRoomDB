package com.example.sampledemoapplication.ApiService

import com.example.sampledemoapplication.constants.Constants.list_data
import com.example.sampledemoapplication.databaseHelper.UserInfo
import com.example.sampledemoapplication.databaseHelper.UserInfoNew
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiService {
    @GET(list_data)
    fun getUserResponses(): Call<List<UserInfo>>

    @POST(list_data)
    fun postUserData(@Body userInfoNew: UserInfoNew?): Call<Void?>?
}