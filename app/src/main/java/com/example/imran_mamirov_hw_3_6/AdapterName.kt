package com.example.imran_mamirov_hw_3_6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.imran_mamirov_hw_3_6.databinding.ItemNameBinding

class AdapterName(private val items: List<ItemName>) : RecyclerView.Adapter<ViewHolderName>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderName {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemNameBinding.inflate(layoutInflater, parent, false)
        return ViewHolderName(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolderName, position: Int) {
        holder.bind(items[position])
    }

}

class ViewHolderName(private val binding: ItemNameBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: ItemName) {
        binding.tvName.text = item.name
    }

}