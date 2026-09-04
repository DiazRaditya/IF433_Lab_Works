fun main(){
    val gametitle: string = "streamkw"
    val price: int = "600000"

    val discount = calculateDiscount (price)
    val finalprice = price -(price * discount / 100)
}

fun main() {
    val gameTitle = "streamkw"
    val price = 600000

    val discount = calculateDiscount(price)
    val finalPrice = price - (price * discount / 100)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) 20 else 10

fun main() {
    val gameTitle = "streamkw"
    val price = 600000

    val discount = calculateDiscount(price)
    val finalPrice = price - (price * discount / 100)

    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) 20 else 10

fun printReceipt(title: String, finalPrice: Int) {
    println("Game: $title")
    println("Harga Akhir: Rp $finalPrice")
}

fun main() {
    val gameTitle = "streamkw"
    val price = 500000 // Sesuai instruksi uji dengan price 500000

    val discount = calculateDiscount(price)
    val finalPrice = price - (price * discount / 100)

    val userNote: String? = null

    printReceipt(title = gameTitle, finalPrice = finalPrice, note = userNote)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) 20 else 10

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("=== STRUK STEAMKW ===")
    println("Judul Game : $title")
    println("Harga Akhir: Rp $finalPrice")
    // Menggunakan Elvis Operator (?:) untuk null safety
    println("Catatan    : ${note ?: "Tidak ada catatan"}")
}
