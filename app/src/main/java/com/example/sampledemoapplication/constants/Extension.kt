package com.example.sampledemoapplication.constants

import android.content.Context
import android.util.Log
import android.util.Patterns
import android.view.View
import android.widget.Toast

fun logThis(message: String) {
    Log.d("PRODUCT_LIST", message)
}

fun logThis(tag: String, message: String) {
    Log.d(tag, message)
}

fun logError(tag: String, message: String) {
    Log.e(tag, message)
}

fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}


fun View.goneView() {
    this.visibility = View.GONE
}

fun View.showView() {
    this.visibility = View.VISIBLE
}

fun isEmailValid(email: String): Boolean {
    return Patterns.EMAIL_ADDRESS.matcher(email).matches()
}


