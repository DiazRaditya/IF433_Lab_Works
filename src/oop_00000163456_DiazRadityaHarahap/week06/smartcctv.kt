package oop_00000163456_DiazRadityaHarahap.week06

class SmartCCTV(
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override val id: String = "CCTV-001"

    override fun turnOn() {
        println("$name berhasil dinyalakan.")
        startRecord()
    }

    override fun turnOff() {
        println("$name berhasil dimatikan.")
    }

    override fun startRecord() {
        println("$name mulai merekam.")
    }
}