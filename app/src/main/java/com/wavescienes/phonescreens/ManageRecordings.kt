package com.wavescienes.phonescreens

import android.os.Bundle
import androidx.activity.ComponentActivity

import com.wavescienes.phonescreens.databinding.ActivityManageRecordingsBinding

class ManageRecordings: ComponentActivity() {
    private lateinit var binding: ActivityManageRecordingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manage_recordings)
        binding = ActivityManageRecordingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homeBtn.setOnClickListener{
            finish()
        }

    }
}