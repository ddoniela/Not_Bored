package com.alkemy.notboredapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.alkemy.notboredapp.R
import com.alkemy.notboredapp.databinding.CardLayoutBinding
import com.alkemy.notboredapp.model.Category

class CategoryAdapter(
    var onClick: () -> Unit
) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    private var listCategory = emptyList<Category>()

        inner class ViewHolder (val binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(CardLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = listCategory[position]
        holder.binding.tvCategoryTitle.text = category.nome
        holder.binding.btOpen.setOnClickListener {
            onClick()
        }
    }


    override fun getItemCount(): Int {
        return listCategory.size
    }

    fun setList(list: List<Category>){
        listCategory = list
        notifyDataSetChanged()
    }
}