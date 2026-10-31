package oop_00000163456_DiazRadityaHarahap.week06

class SmartSpeaker(
    override val name: String
) : SmartDevice, Switchable {

    override val id: String = "SPEAKER-001"

    override fun turnOn() {
        println("$name berhasil dinyalakan.")
    }

    override fun turnOff() {
        println("$name berhasil dimatikan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}