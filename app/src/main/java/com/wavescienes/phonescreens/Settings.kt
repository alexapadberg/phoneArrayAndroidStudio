package com.wavescienes.phonescreens

import android.content.Context
import android.media.AudioDeviceInfo
import android.media.AudioManager
import android.os.Bundle
import androidx.activity.ComponentActivity

import com.wavescienes.phonescreens.databinding.ActivitySettingsBinding

class Settings: ComponentActivity() {
    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val audioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
        val audioDevices = audioManager.getDevices(AudioManager.GET_DEVICES_INPUTS)
        //get all the input devices

        val microphoneList = mutableListOf<String>()
        //empty list of the microphones on any given phone

        for (audioDevice in audioDevices) {
            if (audioDevice.type == AudioDeviceInfo.TYPE_BUILTIN_MIC) {
                microphoneList.add(audioDevice.productName.toString())
                //add each audio device that's a microphone into the microphone list array
                binding.microphones.text = microphoneList.joinToString("\n")
                // display microphones on the app as a button
           }

        }

       // binding.microphones.text = microphoneList.joinToString("\n")
    }
}