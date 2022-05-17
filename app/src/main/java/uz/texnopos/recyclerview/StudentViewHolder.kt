package uz.texnopos.recyclerview

import androidx.recyclerview.widget.RecyclerView
import uz.texnopos.recyclerview.data.Student
import uz.texnopos.recyclerview.databinding.ItemStudentBinding

class StudentViewHolder(private val binding: ItemStudentBinding) :
    RecyclerView.ViewHolder(binding.root) {

        fun bind(student: Student) {
            binding.apply {
                tvName.text = student.name
                tvPhone.text = student.phone
            }
        }
}
