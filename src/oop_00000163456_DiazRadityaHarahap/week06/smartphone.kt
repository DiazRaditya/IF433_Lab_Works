package oop_00000163456_DiazRadityaHarahap.week06

class Smartphone : Camera, Phone {

    // Mengatasi konflik implementasi dari dua interface
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()

        println("Sistem operasi Smartphone berhasil booting.")
    }
}