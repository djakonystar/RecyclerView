package uz.texnopos.recyclerview

import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import uz.texnopos.recyclerview.data.Student
import uz.texnopos.recyclerview.databinding.ItemStudentBinding

class StudentViewHolder(private val binding: ItemStudentBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(student: Student) {
        binding.apply {
            tvName.text = student.name
            tvPhone.text = student.phone
            root.setBackgroundColor(Color.parseColor(if (student.selected) "#FFEF5350" else "#00FFFFFF"))

            itemView.setOnClickListener {
                student.selected = !student.selected
                onItemClick.invoke()
            }
        }
    }

    private var onItemClick: () -> Unit = {}
    fun setOnItemClickListener(onItemClick: () -> Unit = {}) {
        this.onItemClick = onItemClick
    }
}
