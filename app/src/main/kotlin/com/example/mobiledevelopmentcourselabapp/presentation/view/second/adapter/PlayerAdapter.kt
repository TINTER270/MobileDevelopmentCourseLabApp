package com.example.mobiledevelopmentcourselabapp.presentation.view.second.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mobiledevelopmentcourselabapp.databinding.ItemPlayerBinding
import com.example.mobiledevelopmentcourselabapp.presentation.view.second.player.Palye

class PlayerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private var items:MutableList<Palye> = arrayListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ItemPlayerBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return PlayerHolder(binding)
    }

    fun updateItems(newItems: List<Palye>){
        items = newItems.toMutableList()
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        if (holder is PlayerHolder){
            holder.bind(item)
            holder.setOnClickListener {
                item.isExpended = !item.isExpended
                notifyItemChanged(position)
            }
        }
    }
}
class PlayerHolder(private val binding: ItemPlayerBinding) :RecyclerView.ViewHolder(binding.root){

    fun bind(plaet: Palye){
        binding.name.text = plaet.name
        binding.number.text = plaet.Number.toString()
        binding.age.text = plaet.Age.toString()
        binding.position.text = plaet.position.rusName
        binding.team.text = plaet.Team
        binding.additionFields.isVisible = plaet.isExpended

        Glide.with(itemView)
            .load(plaet.PhotoURL)
            .into(binding.icon)
    }
    fun setOnClickListener(action: () -> Unit){
        binding.root.setOnClickListener{
            action.invoke()
        }
    }
}