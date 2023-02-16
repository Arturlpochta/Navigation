package com.example.navigation.model


import android.os.Bundle
import androidx.viewbinding.BuildConfig
import com.example.navigation.databinding.ActivityAboutBinding


class AboutActivity : BaseActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater).also { setContentView(it.root) }

        binding.versionNameTextView.text = com.example.navigation.BuildConfig.VERSION_NAME
        binding.versionCodeTextView.text = com.example.navigation.BuildConfig.VERSION_CODE.toString()
        binding.okButton.setOnClickListener { onOkPressed() }
    }

    private fun onOkPressed() {
        finish()
    }
}