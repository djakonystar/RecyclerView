package uz.texnopos.recyclerview

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import uz.texnopos.recyclerview.databinding.ItemTextBinding

class TextViewHolder(private val binding: ItemTextBinding) : RecyclerView.ViewHolder(binding.root) {
    @SuppressLint("SetTextI18n")
    fun populateModel(text: String) {
        binding.tvTitle.text = "Position $text"
        itemView.setOnClickListener {
            Toast.makeText(itemView.context, "$text clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
