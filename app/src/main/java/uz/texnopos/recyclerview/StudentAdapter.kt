package uz.texnopos.recyclerview

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.texnopos.recyclerview.data.Student
import uz.texnopos.recyclerview.databinding.ItemStudentBinding

class StudentAdapter : RecyclerView.Adapter<StudentViewHolder>() {
    var models: List<Student> = listOf()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int = models.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
        val binding = ItemStudentBinding.bind(itemView)
        return StudentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.bind(models[position])
    }
}
