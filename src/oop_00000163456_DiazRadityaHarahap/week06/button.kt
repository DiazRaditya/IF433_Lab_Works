package oop_00000163456_DiazRadityaHarahap.week06


class Button(override val name: String) : Clickable {

    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}