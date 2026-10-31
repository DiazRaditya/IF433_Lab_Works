package oop_00000163456_DiazRadityaHarahap.week04

open class Vehicle(val brand: String) {

    open fun honk() {
        println("$brand mengeluarkan suara klakson.")
    }

    open fun accelerate() {
        println("$brand sedang berakselerasi.")
    }
}