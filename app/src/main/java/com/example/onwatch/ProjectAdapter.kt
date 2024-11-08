package com.example.onwatch

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.onwatch.databinding.ItemBinding

class ProjectAdapter(private val items: List<ModelClass>) :
    RecyclerView.Adapter<ProjectViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProjectViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        val currentItem = items[position]
        holder.binding.apply {
            brand.text = currentItem.brand
            model.text = currentItem.model
            price.text = currentItem.price
        }
    }

    override fun getItemCount(): Int = items.size
}