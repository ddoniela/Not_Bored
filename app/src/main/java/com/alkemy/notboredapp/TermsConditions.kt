package com.alkemy.notboredapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alkemy.notboredapp.databinding.ActivityTermsConditionsBinding

class TermsConditions : AppCompatActivity() {
    private lateinit var binding: ActivityTermsConditionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTermsConditionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icBack.setOnClickListener {
            val goBackMainActivity = Intent(this, MainActivity::class.java)
            startActivity(goBackMainActivity)
        }
    }


}