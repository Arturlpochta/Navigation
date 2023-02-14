package com.example.navigation.model


import androidx.appcompat.app.AppCompatActivity


open class BaseActivity : AppCompatActivity() {
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
