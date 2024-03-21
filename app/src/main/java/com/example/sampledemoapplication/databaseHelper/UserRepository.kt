package com.example.sampledemoapplication.databaseHelper

import androidx.lifecycle.LiveData

class UserRepository(private val userDao: UserDao) {

    suspend fun insertUserInfo(userInfo: UserInfo) {
        userDao.InsertUserDetails(userInfo)
    }

    fun getAllUsers(): List<UserInfo> {
        return userDao.getAllUsersDetails()
    }

    fun getLocalUserInfo(): LiveData<List<UserInfo>> {
        return userDao.getAllUsersDetailsLocal()
    }
    suspend fun updateUserInfo(userInfo: UserInfo) {
        userDao.updateUser(userInfo)
    }

    suspend fun delete(userInfo: UserInfo){
        userDao.deleteUser(userInfo)
    }

}