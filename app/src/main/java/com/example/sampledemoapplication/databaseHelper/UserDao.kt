package com.example.sampledemoapplication.databaseHelper

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun InsertUserDetails(userInfo: UserInfo)

    @Query("SELECT * FROM userinfo_table")
    fun getAllUsersDetails(): List<UserInfo>

    @Query("SELECT * FROM userinfo_table ORDER BY id DESC")
    fun getAllUsersDetailsLocal(): LiveData<List<UserInfo>>

    @Update
    suspend fun updateUser(userInfo: UserInfo)

    @Delete
    suspend fun deleteUser(userInfo: UserInfo)

}