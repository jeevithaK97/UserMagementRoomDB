package com.example.sampledemoapplication.databaseHelper

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "userinfo_table")

data class UserInfo(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val _id: String = "",
    val userName: String,
    val emailID: String,
    val mobileNo: String,
    val dob: String,
    val gender: String,
    val location: String,
) : Serializable

data class UserInfoNew(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val userName: String,
    val emailID: String,
    val mobileNo: String,
    val dob: String,
    val gender: String,
    val location: String,
)
