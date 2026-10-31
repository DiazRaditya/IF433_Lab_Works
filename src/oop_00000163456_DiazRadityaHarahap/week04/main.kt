package oop_00000163456_DiazRadityaHarahap.week04

fun main() {

    val vehicle = Vehicle("Toyota")
    vehicle.honk()
    vehicle.accelerate()

    println()

    val car = Car("Honda", 4)
    car.honk()
    car.accelerate()
    car.openTrunk()
}