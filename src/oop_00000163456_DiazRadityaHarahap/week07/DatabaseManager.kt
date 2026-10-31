package oop_00000163456_DiazRadityaHarahap.week07

object DatabaseManager {

    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}