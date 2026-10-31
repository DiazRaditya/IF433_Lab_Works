package oop_00000163456_DiazRadityaHarahap.week05

class Dosen(nama: String) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang bekerja sebagai dosen.")
    }

    fun mengajar() {
        println("$nama sedang mengajar mahasiswa.")
    }
}