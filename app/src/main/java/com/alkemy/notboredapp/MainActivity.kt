package com.alkemy.notboredapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.core.widget.doAfterTextChanged
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

        binding.etParticipantsNumber.doAfterTextChanged {
            val value = binding.etParticipantsNumber.text.toString()

            if (value != "") {
                binding.btStart.isEnabled = value.toInt() > 0
            } else {
                binding.btStart.isEnabled = true
            }
        }

        lateinit var menu: Spinner
        menu = binding.spinnerPrice
        val priceList = arrayOf("Free", "Low", "Medium", "High")
        menu.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, priceList)

    }}