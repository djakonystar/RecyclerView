package uz.texnopos.recyclerview

import androidx.recyclerview.widget.RecyclerView
import uz.texnopos.recyclerview.data.Ad
import uz.texnopos.recyclerview.databinding.ItemAdBinding

class AdViewHolder(private val binding: ItemAdBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(ad: Ad) {
        binding.tvTitle.text = ad.title
    }
}
