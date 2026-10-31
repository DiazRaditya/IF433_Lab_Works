package oop_00000163456_DiazRadityaHarahap.week07



fun processEvent(event: BattleState) {

    when (event) {

        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}")
            println("Bersiap untuk bertarung!")
        }

        is BattleState.LootDropped -> {
            println("Item ditemukan: ${event.item.name}")
            println("Rarity: ${event.item.rarity}")
            println("Damage: ${event.item.damage}")
        }

        is BattleState.GameOver -> {
            println("Game Over!")
            println("Alasan: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Pemain berada di zona aman.")
        }
    }
}
