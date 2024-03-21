package com.example.sampledemoapplication.view

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.lifecycle.ViewModelProvider
import com.example.sampledemoapplication.R
import com.example.sampledemoapplication.ViewModel.UserViewModel
import com.example.sampledemoapplication.constants.AddDetailsCallback
import com.example.sampledemoapplication.constants.isEmailValid
import com.example.sampledemoapplication.constants.toast
import com.example.sampledemoapplication.databaseHelper.UserInfo
import com.example.sampledemoapplication.databinding.ActivityEditDetailsBinding
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class EditDetailsActivity : AppCompatActivity(), AddDetailsCallback {

    private val binding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityEditDetailsBinding.inflate(layoutInflater)
    }

    private val viewModel by lazy(LazyThreadSafetyMode.NONE) {
        ViewModelProvider(this)[UserViewModel::class.java]
    }

    lateinit var userInfo: UserInfo
    lateinit var userName: String
    lateinit var emailId: String
    lateinit var mobileNum: String
    lateinit var dob: String
    lateinit var gender: String
    lateinit var dupGender: String
    lateinit var location: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        binding.apply {
            userInfo = intent.getSerializableExtra("userInfo") as UserInfo;
            setToolBar()
            bindData()
            setSpinner()
            dobText.setOnClickListener { showDatePickerDialog() }
            addButton.setOnClickListener { saveData() }
        }

    }

    private fun setToolBar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            title = "Edit Details"
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_backarrow)
        }
    }

    private fun saveData() {
        binding.apply {
            userName = userNameText.text.toString()
            emailId = mailText.text.toString()
            mobileNum = mobileNOText.text.toString()
            dob = dobText.text.toString()
            gender = dupGender
            location = locationText.text.toString()
            if (userName.isNotEmpty() && isEmailValid(emailId) || emailId.isEmpty()) {
                var userModel: UserInfo = UserInfo(
                    id = userInfo.id,
                    _id = userInfo._id,
                    userName = userName,
                    emailID = emailId,
                    mobileNo = mobileNum,
                    dob = dob,
                    gender = gender,
                    location = location
                )
                viewModel.updateDataToLocal(userModel, this@EditDetailsActivity)
                finish()
            } else {
                userNameText.error = if (userName.isNullOrBlank()) "UserName is Empty" else null
                mailText.error = if (!isEmailValid(emailId)) "Email is invalid" else null
            }
        }
    }

    private fun bindData() {
        binding.apply {
            userNameText.setText(userInfo.userName)
            mailText.setText(userInfo.emailID)
            mobileNOText.setText(userInfo.mobileNo)
            dobText.setText(userInfo.dob)
            locationText.setText(userInfo.location)
        }
    }

    private fun setSpinner() {
        binding.apply {
            ArrayAdapter.createFromResource(
                applicationContext, R.array.genders, android.R.layout.simple_spinner_item
            ).also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                GenderText.adapter = adapter
            }

            GenderText.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>, view: android.view.View, position: Int, id: Long
                ) {
                    dupGender = parent.getItemAtPosition(position).toString()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    dupGender = userInfo.gender
                }
            }
        }
    }

    private fun showDatePickerDialog() {
        val c: Calendar = Calendar.getInstance()
        val mYear: Int = c.get(Calendar.YEAR)
        val mMonth: Int = c.get(Calendar.MONTH)
        val mDay: Int = c.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            { view, year, monthOfYear, dayOfMonth ->
                val sdf = SimpleDateFormat("dd-MM-yyyy", Locale.US)
                val selectedDate = Calendar.getInstance()
                selectedDate[Calendar.YEAR] = year
                selectedDate[Calendar.MONTH] = monthOfYear
                selectedDate[Calendar.DAY_OF_MONTH] = dayOfMonth
                val formattedDate: String = sdf.format(selectedDate.time)
                binding.dobText.setText(formattedDate)
            }, mYear, mMonth, mDay
        )
        datePickerDialog.show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSuccess() {
        this.toast("User updated successfully..")
        finish()
    }

}