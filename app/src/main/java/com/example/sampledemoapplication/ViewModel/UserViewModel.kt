package com.example.sampledemoapplication.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.sampledemoapplication.ApiService.RetrofitClient
import com.example.sampledemoapplication.constants.DataCallback
import com.example.sampledemoapplication.constants.logError
import com.example.sampledemoapplication.databaseHelper.UserDatabase
import com.example.sampledemoapplication.databaseHelper.UserInfo
import com.example.sampledemoapplication.databaseHelper.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception
import androidx.lifecycle.LiveData
import com.example.sampledemoapplication.constants.logThis
import com.example.sampledemoapplication.databaseHelper.UserInfoNew
import com.example.sampledemoapplication.view.AddDetailsActivity
import com.example.sampledemoapplication.view.EditDetailsActivity

class UserViewModel(application: Application) : AndroidViewModel(application) {

    private val apiService = RetrofitClient.apiService
    private val repository: UserRepository

    init {
        val loginDao = UserDatabase.getDatabase(application).userDuo()
        repository = UserRepository(loginDao)
    }

    fun loadDataFromServer(callback: DataCallback) {

        val api = apiService.getUserResponses()
        viewModelScope.launch(Dispatchers.IO) {
            api.enqueue(object : Callback<List<UserInfo>> {
                override fun onResponse(
                    call: Call<List<UserInfo>>,
                    response: Response<List<UserInfo>>
                ) {
                    if (response.isSuccessful) {
                        val productResponse = response.body()
                        productResponse?.map { item ->
                            insertUserInfo(
                                UserInfo(
                                    id = 0,
                                    _id = item._id,
                                    userName = item.userName,
                                    emailID = item.emailID,
                                    mobileNo = item.mobileNo,
                                    dob = item.dob,
                                    gender = item.gender,
                                    location = item.location
                                )
                            )
                        }
                        productResponse?.let {
                            callback.onDataLoaded(it)
                        }
                    } else {
                        callback.onFailure("Failed to fetch posts: ${response.code()}")
                    }
                }

                override fun onFailure(call: Call<List<UserInfo>>, t: Throwable) {
                    logError("DataFromServer", "DataFromServer $t")
                }
            })
        }
    }

    fun postDataToServer(userModel: UserInfoNew?, callback: AddDetailsActivity) {
        viewModelScope.launch(Dispatchers.IO) {
            apiService.postUserData(userModel)?.enqueue(object : Callback<Void?> {
                override fun onResponse(call: Call<Void?>, response: Response<Void?>) {
                    logThis("SDfdsf", response.toString())
                    val message = response.message()
                    if (message != null) {
                        if (message == "Created") {
                            insertUserInfo(
                                UserInfo(
                                    id = 0,
                                    userName = userModel!!.userName,
                                    emailID = userModel!!.emailID,
                                    mobileNo = userModel!!.mobileNo,
                                    dob = userModel!!.dob,
                                    gender = userModel!!.gender,
                                    location = userModel!!.location
                                )
                            )
                            callback.onSuccess()
                        }
                    }
                }

                override fun onFailure(call: Call<Void?>, t: Throwable) {
                }
            })
        }
    }

    fun insertUserInfo(user: UserInfo) = viewModelScope.launch(Dispatchers.IO) {
        try {
            repository.insertUserInfo(user)
        } catch (e: Exception) {
            logError("Exception_UserInfo", e.message.toString())
        }
    }

    fun getLocalUserInfo(): LiveData<List<UserInfo>> {
        return repository.getLocalUserInfo()
    }

    fun getUserInfo(): List<UserInfo> {
        return repository.getAllUsers()
    }

    fun updateDataToLocal(user: UserInfo,callback: EditDetailsActivity) = viewModelScope.launch(Dispatchers.IO) {
        try {
            repository.updateUserInfo(user)
                callback.onSuccess()
            getLocalUserInfo()
        } catch (e: Exception) {
            logError("Exception_UserInfo", e.message.toString())
        }

    }

    suspend fun delUserInfo(user: UserInfo) {
        repository.delete(user)
    }


}