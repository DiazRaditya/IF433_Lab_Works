package oop_00000163456_DiazRadityaHarahap.week10


package oop_NIM_NAMA.week10

class NumericalStorage<T : Number>(val value: T) {

    fun doubleValue(): Double {
        return value.toDouble() * 2
    }

    fun display() {
        println("Value: $value")
        println("Double Value: ${doubleValue()}")
    }
}


fun <T> findMax(
    a: T,
    b: T
): T where T : Comparable<T> {
    return if (a >= b) a else b
}
