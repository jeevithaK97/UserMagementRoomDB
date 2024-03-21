package com.example.sampledemoapplication.Model

import java.io.Serializable

data class UserListPOJO(
    val id: String = "",
    val userName: String,
    val emailID: String,
    val mobileNo: String,
    val dob: String,
    val gender: String,
    val location: String,
) : Serializable

