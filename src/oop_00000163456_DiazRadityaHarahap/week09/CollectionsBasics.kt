package oop_00000163456_DiazRadityaHarahap.week09


package oop_NIM_NAMA.week09

fun main() {
    val immutableList = listOf("Apple", "Banana", "Orange")
    println("Immutable List: $immutableList")

    val mutableList = mutableListOf("Apple", "Banana")
    mutableList.add("Orange")

    println("Mutable List: $mutableList")
}
