package oop_00000163456_DiazRadityaHarahap.week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        if (hp - damage < 0) {
            hp = 0
        } else {
            hp -= damage
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}