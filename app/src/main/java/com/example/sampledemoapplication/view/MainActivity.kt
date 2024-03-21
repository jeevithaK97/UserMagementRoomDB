package com.example.sampledemoapplication.view

import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sampledemoapplication.ApiService.NetworkUtils
import com.example.sampledemoapplication.R
import com.example.sampledemoapplication.ViewModel.UserViewModel
import com.example.sampledemoapplication.adapter.UserItemClickListener
import com.example.sampledemoapplication.adapter.UserListAdapter
import com.example.sampledemoapplication.constants.DataCallback
import com.example.sampledemoapplication.constants.goneView
import com.example.sampledemoapplication.constants.logThis
import com.example.sampledemoapplication.constants.showView
import com.example.sampledemoapplication.constants.toast
import com.example.sampledemoapplication.databaseHelper.UserInfo
import com.example.sampledemoapplication.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity(), DataCallback, UserItemClickListener {

    private val binding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val viewModel by lazy(LazyThreadSafetyMode.NONE) {
        ViewModelProvider(this)[UserViewModel::class.java]
    }
    private val mProgressDialog by lazy(LazyThreadSafetyMode.NONE) {
        ProgressDialog(this)
    }

    private lateinit var adapter: UserListAdapter
    val userList = mutableListOf<UserInfo>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setToolBar()
        init()
//        showProgress()
    }

    private fun loadData() {
        viewModel.loadDataFromServer(this)
//        binding.loader.goneView()
//        hideProgress()
        binding.userRV.showView()
        binding.noInternet.goneView()
    }

    private fun setToolBar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            title = "User Details"
            setDisplayHomeAsUpEnabled(false)
        }
    }

    @SuppressLint("SuspiciousIndentation")
    private fun init() {
        binding.apply {
            addButton.setOnClickListener {
                moveToMapActivity()
            }
            val dividerItemDecoration =
                DividerItemDecoration(userRV.context, LinearLayoutManager.VERTICAL)
            dividerItemDecoration.setDrawable(
                ContextCompat.getDrawable(
                    this@MainActivity,
                    R.drawable.divider
                )!!
            )
            userRV.addItemDecoration(dividerItemDecoration)
            adapter = UserListAdapter(emptyList(), this@MainActivity)
            userRV.adapter = adapter
            userRV.layoutManager = LinearLayoutManager(applicationContext)

            viewModel.getLocalUserInfo().observe(this@MainActivity, androidx.lifecycle.Observer {
                if (it.isEmpty())
                    if (NetworkUtils.isInternetAvailable(this@MainActivity)) {
                        loadData()
                    } else {
                        binding.userRV.goneView()
//                        binding.loader.goneView()
//                        hideProgress()
                        binding.noInternet.showView()
                    }
                else
//                    binding.loader.goneView()
//                    hideProgress()
                    noRecFoung.goneView()
                binding.userRV.showView()
                binding.noInternet.goneView()
                adapter.userList = it
                adapter.notifyDataSetChanged()
            })

        }

    }

    private fun moveToDetailScreen() {
        startActivity(Intent(applicationContext, AddDetailsActivity::class.java))
    }

    private fun moveToMapActivity() {
        startActivity(
            Intent(
                applicationContext,
                MapsActivity::class.java
            )
        )
    }

    override fun onDataLoaded(userResponse: List<UserInfo>) {
//        this.toast(userResponse.toString())
//        logThis("REsp", userResponse.toString())
//        userList.clear()
//        userList.addAll(userResponse)
//        adapter.notifyDataSetChanged()
    }

    override fun onFailure(message: String) {
        this.toast(message)

    }

    override fun onItemClick(user: UserInfo) {
    }

    override fun onEditItemClick(user: UserInfo) {
        logThis("sdddd", user.id.toString())
        startActivity(
            Intent(
                applicationContext,
                EditDetailsActivity::class.java
            ).putExtra("userInfo", user)
        )
    }

    override fun onDeleteItemClick(user: UserInfo) {
        viewModel.viewModelScope.launch(Dispatchers.IO) {
            viewModel.delUserInfo(user)
        }
    }

    fun showProgress() {
        mProgressDialog.setMessage("Loading...")
        mProgressDialog.setCancelable(false)
        mProgressDialog.show()
    }

    fun hideProgress() {
        mProgressDialog.hide()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.clear()
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_add ->
                moveToDetailScreen()
        }
        return super.onOptionsItemSelected(item)
    }


}