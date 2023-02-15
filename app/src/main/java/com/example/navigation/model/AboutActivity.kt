package com.example.navigation.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewbinding.BuildConfig
import com.example.navigation.databinding.ActivityAboutBinding
import com.example.navigation.R
import com.example.navigation.model.Options
import com.example.navigation.databinding.ActivityOptionsBinding

class AboutActivity : BaseActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater).also {SetContentView(it.root) }

        binding.versionNameTextView.text = BuildConfig.VERSION_NAME
        binding.versionCodeTextView.text = BuildConfig.VERSION_CODE.toString()
        binding.okButton.setOnClickListener { onOkPressed() }
    }

    private fun onOkPressed() {
        finish()
    }
}