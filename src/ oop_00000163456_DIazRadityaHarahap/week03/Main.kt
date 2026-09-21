package ` oop_00000163456_DIazRadityaHarahap`.week03

fun main() {
    val e = Employee("budi"
    println("--- Test Error ---")
    e.salary = 5000 // Ini akan meledakkan program Anda

}

// Hanya bisa diakses di file/class ini saja

private var performanceRating: Int = 3

fun increasePerformance() {
    performanceRating++
    println("Kinerja Sname meningkat! Rating: SperformanceRating")
}
// Kita tidak buat getter untuk performanceRating, jadi data ini benar-benar raha
// kecuali kita buat function khusus untuk print.
fun printStatus() {
    println("Karyawan: Sname, Rating: SperformanceRating")

}
