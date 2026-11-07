package oop_00000163456_DiazRadityaHarahap.week09


val fruitSet = setOf("Apple", "Banana", "Apple", "Orange")

println("Set: $fruitSet")


val studentScores = mapOf(
    "Diaz" to 90,
    "Raja" to 85,
    "Vincent" to 95
)

println("Student Scores: $studentScores")
println("Diaz Score: ${studentScores["Diaz"]}")



val result = students
    .filter { it.score >= 80 }
    .sortedBy { it.name }
    .map { "${it.name}: ${it.score}" }

println(result)
