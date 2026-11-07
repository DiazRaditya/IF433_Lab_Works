package oop_00000163456_DiazRadityaHarahap.week09



fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenNumbers = numbers.filter { it % 2 == 0 }

    println("Even Numbers: $evenNumbers")
}


val squaredNumbers = numbers.map { it * it }

println("Squared Numbers: $squaredNumbers")
