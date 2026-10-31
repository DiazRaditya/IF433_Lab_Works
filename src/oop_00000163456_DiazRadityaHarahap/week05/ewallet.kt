package oop_00000163456_DiazRadityaHarahap.week05

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {

        if (balance >= amount) {
            balance -= amount

            println("Pembayaran berhasil menggunakan E-Wallet.")
            println("Nama akun: $accountName")
            println("Sisa saldo: Rp $balance")

        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil. Saldo sekarang: Rp $balance")
    }
} {
}