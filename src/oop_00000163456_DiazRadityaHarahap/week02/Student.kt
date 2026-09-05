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

// Secondary Constructor
// Wajib memanggil Primary Constructor menggunakan 'this()'
constructor (name: String, nim: String): this(name, nim, major "Non-Matriculated") {
    println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
}

class Student ( 1 Usage new
                val name: String,
                val nim: String,
                var qpa: Double = 0.0, // <-- Default Argument
                var major: String
{

}
