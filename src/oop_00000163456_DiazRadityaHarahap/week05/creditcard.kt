package oop_00000163456_DiazRadityaHarahap.week05

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {

        if (usedAmount + amount <= limit) {

            usedAmount += amount

            println("Pembayaran berhasil menggunakan Credit Card.")
            println("Nama akun: $accountName")
            println("Total penggunaan: Rp $usedAmount")

        } else {
            println("Transaksi ditolak. Limit tidak mencukupi.")
        }
    }
}