package org.diyorbek.bottomnavigation_h1.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.diyorbek.bottomnavigation_h1.model.Exercise
import org.diyorbek.bottomnavigation_h1.databinding.ItemLayoutBinding

class RvAdapter : RecyclerView.Adapter<RvAdapter.ExViewHolder>() {
    lateinit var exList: List<Exercise>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExViewHolder {
        return ExViewHolder(
            ItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ExViewHolder, position: Int) {
        holder.bind(exList[position])
    }

    override fun getItemCount(): Int {
        return exList.size
    }

    inner class ExViewHolder(private val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(exercise: Exercise) {
            binding.exName.text = exercise.exName
            binding.exImage.setImageResource(exercise.exImg)
            binding.backGroundColor.setCardBackgroundColor(exercise.backColor)
        }
    }
}