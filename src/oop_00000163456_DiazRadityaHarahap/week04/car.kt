package oop_00000163456_DiazRadityaHarahap.week04

open class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    override fun honk() {
        println("$brand mengeluarkan suara: Beep Beep!")
    }

    override fun accelerate() {
        super.accelerate()
        println("$brand mobil dengan $numberOfDoors pintu sedang melaju.")
    }

    fun openTrunk() {
        println("Bagasi $brand terbuka.")
    }
}