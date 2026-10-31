package oop_00000163456_DiazRadityaHarahap.week05

fun main() {

    val daftarPegawai: List<Pegawai> = listOf(
        Dosen("Pak Budi"),
        Admin("Andi"),
        Dosen("Bu Sinta"),
        Admin("Rina")
    )

    for (pegawai in daftarPegawai) {

        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> pegawai.mengajar()
            is Admin -> println("${pegawai.nama} bertugas mengurus administrasi.")
        }

        println()
    }
} {
}

println("=== MATH HELPER ===")

val math = MathHelper()

println("Luas Persegi: ${math.hitungLuas(5)}")
println("Luas Persegi Panjang: ${math.hitungLuas(10, 5)}")
println("Luas Lingkaran: ${math.hitungLuas(7.0)}")

println()