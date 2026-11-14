package oop_00000163456_DiazRadityaHarahap.week10



class NumericalStorage<T : Number>(val value: T) {

    fun doubleValue(): Double {
        return value.toDouble() * 2
    }

    fun display() {
        println("Value: $value")
        println("Double Value: ${doubleValue()}")
    }
}
