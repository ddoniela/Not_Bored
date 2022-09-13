package com.alkemy.notboredapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.alkemy.notboredapp.databinding.ActivityMainBinding

class ItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        val toolbar2 = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar2)
        setSupportActionBar(toolbar2)
    }

}