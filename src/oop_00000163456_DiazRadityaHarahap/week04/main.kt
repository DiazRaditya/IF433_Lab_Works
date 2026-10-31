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

val electricCar = ElectricCar("Tesla", 4, 100)

println("\n=== ELECTRIC CAR ===")
electricCar.accelerate()
electricCar.honk()
electricCar.openTrunk()

println("\n=== EMPLOYEE HIERARCHY ===")

val manager = Manager("Andi", 10000000)

manager.work()
println("Bonus Manager: Rp ${manager.calculateBonus()}")

println()

val developer = Developer("Budi", 8000000, "Kotlin")

developer.work()
println("Bonus Developer: Rp ${developer.calculateBonus()}")