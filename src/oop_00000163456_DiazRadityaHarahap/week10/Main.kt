package oop_00000163456_DiazRadityaHarahap.week10



fun main() {

    val intBox = Box(100)
    val stringBox = Box("Hello Kotlin")

    println("Integer Box: ${intBox.getValue()}")
    println("String Box: ${stringBox.getValue()}")

}


val pairBox = PairBox("Student ID", 12345)

pairBox.display()



printData(3.14)
printData("Kotlin Generic")

val doubleResult = getData(99.9)
val stringResult = getData("Hello Generic")

println("Double Result: $doubleResult")
println("String Result: $stringResult")

