package oop_00000163456_DiazRadityaHarahap.week10


class PairBox<K, V>(
    val key: K,
    val value: V
) {

    fun display() {
        println("Key: $key")
        println("Value: $value")
    }
}
