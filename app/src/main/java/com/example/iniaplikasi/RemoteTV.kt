package com.example.iniaplikasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_remote_tv.*

class RemoteTV : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        power.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val toggle: ToggleButton = findViewById(R.id.cornhub)
        toggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                AppCompatDelegate.MODE_NIGHT_YES
            } else {
                AppCompatDelegate.MODE_NIGHT_NO
            }
        }
    }


}



