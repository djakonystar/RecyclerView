package uz.texnopos.recyclerview

import android.annotation.SuppressLint
import androidx.recyclerview.widget.RecyclerView
import uz.texnopos.recyclerview.databinding.ItemTextBinding

class TextViewHolder(private val binding: ItemTextBinding) : RecyclerView.ViewHolder(binding.root) {
    @SuppressLint("SetTextI18n")
    fun bind(text: String) {
        binding.tvTitle.text = "Position $text"
    }
}
