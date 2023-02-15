package com.example.navigation.model

import android.os.Bundle
import com.example.navigation.BuildConfig
import com.example.navigation.databinding.ActivityAboutBinding

class AboutActivity : BaseActivity() {

    class AboutActivity : BaseActivity() {

        private lateinit var binding: ActivityAboutBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityAboutBinding.inflate(layoutInflater).also { this.setContentView(it.root) }
            binding.versionNameTextView.text = BuildConfig.VERSION_NAME
            binding.versionCodeTextView.text = BuildConfig.VERSION_CODE.toString()
            binding.okButton.setOnClickListener { onOkPressed() }
        }

        private fun onOkPressed() {
            finish()
        }
    }
}