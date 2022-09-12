package com.alkemy.notboredapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.alkemy.notboredapp.Adapter.CategoryAdapter
import com.alkemy.notboredapp.databinding.ActivitySecondBinding
import com.alkemy.notboredapp.databinding.CardLayoutBinding
import com.alkemy.notboredapp.model.Category

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private lateinit var binding2: CardLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        binding2 = CardLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(binding2.root)


        binding2.btOpen.setOnClickListener {
            val intent: Intent = Intent(this, ItemActivity::class.java)
            startActivity(intent)

        }




        val listCategories = listOf(
            Category(
                "Education"
            ),
            Category(
                "Recreational"
            ),
            Category(
                "Social"
            ),
            Category(
                "Diy"
            ),
            Category(
                "Charity"
            ),
            Category(
                "Cooking"
            ),
            Category(
                "Relaxation"
            ),
            Category(
                "Music"
            ),
            Category(
                "Busywork"
            )
        )


        val adapter = CategoryAdapter()
        binding.rvRecyclerView.layoutManager = LinearLayoutManager(applicationContext)
        binding.rvRecyclerView.adapter = adapter
        binding.rvRecyclerView.setHasFixedSize(true)

        adapter.setList(listCategories)


    }


}