package com.alkemy.notboredapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alkemy.notboredapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvTerms.setOnClickListener {
            val navigateToTerms = Intent(this, TermsConditions::class.java)
            startActivity(navigateToTerms)
        }

        binding.btStart.setOnClickListener {
            val intent: Intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}