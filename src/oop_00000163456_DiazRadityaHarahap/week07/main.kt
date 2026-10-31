package oop_00000163456_DiazRadityaHarahap.week07



fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()
}

println("\n=== TEST REGULAR CLASS ===")

val reg1 = RegularUser("Alice", 22)
val reg2 = RegularUser("Alice", 22)

println(reg1)
println("Sama? ${reg1 == reg2}")

println("\n=== TEST DATA CLASS ===")

val data1 = DataUser("Alice", 22)
val data2 = DataUser("Alice", 22)

println(data1)
println("Sama? ${data1 == data2}")

val data3 = data1.copy(age = 23)
println("Hasil Copy: $data3")

val (userName, userAge) = data1
println("Destructured: $userName berumur $userAge")


println("\n=== TEST SEALED CLASS ===")

val response: ApiResponse =
    ApiResponse.Success("Data berhasil ditarik!")

// ERROR: when expression harus exhaustive
val uiMessage = when (response) {
        val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }

    println(uiMessage)

            println("\n=== TEST GAME MANAGER ===")

            GameManager.startGame()
            GameManager.startGame()

            println("\n=== TEST ITEM RARITY ===")

            println("Legendary Drop Chance: ${ItemRarity.LEGENDARY.dropChance}%")

            println("\n=== TEST WEAPON FACTORY ===")

        val starterWeapon = Weapon.forgeStarterSword()

    println("Nama Senjata: ${starterWeapon.item.name}")
            println("Damage: ${starterWeapon.item.damage}")
            println("Rarity: ${starterWeapon.item.rarity}")
            println("Durability: ${starterWeapon.durability}")

            println("\n=== TEST WEAPON UPGRADE ===")

        val upgradedItem = starterWeapon.item.copy(damage = 25)

    println("Senjata Asli: ${starterWeapon.item}")
            println("Senjata Upgrade: $upgradedItem")

            println("\n=== TEST BATTLE EVENTS ===")

            processEvent(BattleState.SafeZone)

            processEvent(
            BattleState.MonsterEncounter("Goblin Nakal")
            )

            processEvent(
            BattleState.LootDropped(upgradedItem)
            )

            processEvent(
            BattleState.GameOver("Terkena jebakan racun")
            )
