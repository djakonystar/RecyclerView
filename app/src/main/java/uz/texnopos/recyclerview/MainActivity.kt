package uz.texnopos.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import uz.texnopos.recyclerview.data.Student
import uz.texnopos.recyclerview.databinding.ActivityMainBinding
import uz.texnopos.recyclerview.databinding.ItemStudentBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter = StudentAdapter()
    private val students = mutableListOf<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getStudents()
        adapter.models = students

        binding.apply {
            recyclerView.adapter = adapter
            recyclerView.addItemDecoration(
                DividerItemDecoration(
                    this@MainActivity,
                    DividerItemDecoration.VERTICAL
                )
            )
        }
    }

    private fun getStudents() {
        repeat(25) {
            students.add(Student(generateName, generatePhone))
        }
    }

    private val generateName: String
        get() {
            val letters = mutableListOf<Char>()
            repeat(9) {
                letters.add(Random.nextInt(65, 91).toChar())
            }
            return letters.joinToString("")
        }

    private val generatePhone: String
        get() {
            val letters = mutableListOf<Int>()
            repeat(9) {
                letters.add(Random.nextInt(0, 10))
            }
            return letters.joinToString("")
        }
}
