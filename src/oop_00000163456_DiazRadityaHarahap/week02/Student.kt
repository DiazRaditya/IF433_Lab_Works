package oop_00000163456_DiazRadityaHarahap.week02

package oop_001_johnthor.week02
class Student (new
               val name: String,
               val nim: String,
               var major: String
){
// Body class kosong dulu
}

class Student (val name: String, val nim: String, var major: String) { new
    init {
        new
// Validasi Sederhana: Cek panjang NIM
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")

        }
    }
}

