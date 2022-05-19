package uz.texnopos.recyclerview

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.texnopos.recyclerview.data.Ad
import uz.texnopos.recyclerview.data.Student
import uz.texnopos.recyclerview.databinding.ItemAdBinding
import uz.texnopos.recyclerview.databinding.ItemStudentBinding

class StudentAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        private const val AD = 0
        private const val STUDENT = 1
    }

    var models = listOf<Model>()
    @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int = models.size

    override fun getItemViewType(position: Int): Int {
        return if (models[position] is Ad) AD else STUDENT
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            AD -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_ad, parent, false)
                val binding = ItemAdBinding.bind(view)
                AdViewHolder(binding)
            }
            else -> {
                val itemView =
                    LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
                val binding = ItemStudentBinding.bind(itemView)
                StudentViewHolder(binding)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (getItemViewType(position) == AD) {
            (holder as AdViewHolder).bind(models[position] as Ad)
        } else {
            (holder as StudentViewHolder).bind(models[position] as Student)
        }
    }
}
