package com.example.iniaplikasi

import android.R.layout.simple_list_item_1
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = listOf("Web Browser","Remote TV","Faketagram","Scamshop", "Secret")
        ini_list.adapter = ArrayAdapter(this, simple_list_item_1, data)

        ini_list.setOnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                intent = Intent(this, WebBrowser::class.java)
                startActivity(intent)
            }
            if (position == 1) {
                intent = Intent(this, RemoteTV::class.java)
                startActivity(intent)
            }
            if (position == 2) {
                intent = Intent(this, Faketagram::class.java)
                startActivity(intent)
            }
            if (position == 3) {
                intent = Intent(this, Scamshop::class.java)
                startActivity(intent)
            }
            if (position == 4) {
                val alertDialog = AlertDialog.Builder(this).create()
                alertDialog.setTitle("Dark Mode")
                alertDialog.setMessage("Rusak HP Anda?")
                alertDialog.setButton(
                    AlertDialog.BUTTON_POSITIVE, "Ya"
                ) { dialog, i ->
                    Toast.makeText(this, "Anda memilih tombol ya",
                        Toast.LENGTH_LONG).show()
                    AppCompatDelegate.MODE_NIGHT_YES
                }
                alertDialog.setButton(
                    AlertDialog.BUTTON_NEGATIVE, "Ya") { dialog, i ->
                    Toast.makeText(this, "Anda memilih tombol ya",
                        Toast.LENGTH_LONG).show()
                    AppCompatDelegate.MODE_NIGHT_NO
                }
                alertDialog.show()
            }
        }
    }
}