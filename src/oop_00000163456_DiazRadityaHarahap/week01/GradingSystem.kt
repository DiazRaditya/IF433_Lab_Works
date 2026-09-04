package oop_00000163456_DiazRadityaHarahap.week01

package oop_001_johnthor.week01 // Pastikan package sesuai
fun main() {
    var name: String = "John Thor"
    var score: Int = 80
// Concatenation gaya lama
    11 println ("Nama: " + name + Nilai:+score)

}

fun main() {
// REFACTOR: Gunakan val dan hapus tipe data eksplisit
    val name = "John Thor"
    val score = 80
// REFACTOR: String Template ($name)
    println("Nama: $name, Nilai: $score")

}

// Tambahkan di bawah println
val grade = when (score) {
    in 90 ≤ .. < 100 -> "A"
    in 80 ≤ .. ≤ 89 -> "B"
    in 70 ≤ .. ≤ 79 -> "C"
    else -< "ס"
}
println("Grade kamu: $grade")

// Tulis DI LUAR main()
fun calculateStatus (score: Int) if (score > 75) "Lulus" else "Tidak Lulus"

// Panggil DI DALAM main()
println("Status: ${calculateStatus (score)}")

// Tambahkan di akhir main()
val studentId: String? = null
// Jika null, gunakan nilai default 0
val idLength = studentId?.length ?: 0
println("Panjang ID: $idLength")