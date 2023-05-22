package com.wavescienes.phonescreens


import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wavescienes.phonescreens.databinding.ActivityMainBinding
import com.wavescienes.phonescreens.ui.theme.PhoneScreensTheme

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addRecordingsBtn.setOnClickListener{
                val intent = Intent(applicationContext, AddRecordings::class.java)
                startActivity(intent)
        }
        binding.manageRecordingsBtn.setOnClickListener {
            val intent = Intent(applicationContext, ManageRecordings::class.java)
            //legIntent.putExtra("workout_type", manage.text.toString())
            startActivity(intent)
        }
        binding.settings.setOnClickListener {
            val intent = Intent(applicationContext, Settings::class.java)
            //legIntent.putExtra("workout_type", manage.text.toString())
            startActivity(intent)
        }
    }
}