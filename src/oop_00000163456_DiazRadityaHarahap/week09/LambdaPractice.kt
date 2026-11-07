package oop_00000163456_DiazRadityaHarahap.week09


fun main() {
    val sum: (Int, Int) -> Int = { a, b -> a + b }

    println("Sum: ${sum(10, 20)}")

    val square: (Int) -> Int = { it * it }

    println("Square: ${square(5)}")
}

