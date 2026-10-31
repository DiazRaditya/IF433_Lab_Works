package oop_00000163456_DiazRadityaHarahap.week07



class NetworkClient private constructor(val url: String) {

    fun connect() {
        println("Connecting to $url...")
    }
}
