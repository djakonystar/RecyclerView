package uz.texnopos.recyclerview.data

import uz.texnopos.recyclerview.Model

data class Student(
    val name: String,
    val phone: String,
    var selected: Boolean = false
): Model()
