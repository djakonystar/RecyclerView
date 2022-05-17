package uz.texnopos.recyclerview

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.texnopos.recyclerview.databinding.ItemTextBinding

class TextAdapter : RecyclerView.Adapter<TextViewHolder>() {
    var models = listOf<String>()
    @SuppressLint("NotifyDataSetChanged")
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_text, parent, false)
        val binding = ItemTextBinding.bind(itemView)
        return TextViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        holder.populateModel(models[position])
    }

    override fun getItemCount(): Int {
        return models.size
    }
}
