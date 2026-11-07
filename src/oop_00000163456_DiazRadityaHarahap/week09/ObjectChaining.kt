package oop_00000163456_DiazRadityaHarahap.week09



data class Student(
    val name: String,
    val score: Int
)

fun main() {
    val students = listOf(
        Student("Diaz", 85),
        Student("Raja", 90),
        Student("Vincent", 75),
        Student("Azi", 95),
        Student("Budi", 60)
    )

    println(students)
}
