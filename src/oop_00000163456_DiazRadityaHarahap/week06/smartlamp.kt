package oop_00000163456_DiazRadityaHarahap.week06

class SmartLamp(
    override val name: String
) : SmartDevice, Switchable {

    override val id: String = "LAMP-001"

    override fun turnOn() {
        println("$name berhasil dinyalakan.")
    }

    override fun turnOff() {
        println("$name berhasil dimatikan.")
    }
}