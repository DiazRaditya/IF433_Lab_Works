package oop_00000163456_DiazRadityaHarahap.week05

fun main() {

    val daftarPegawai: List<Pegawai> = listOf(
        Dosen("Pak Budi"),
        Admin("Andi"),
        Dosen("Bu Sinta"),
        Admin("Rina")
    )

    for (pegawai in daftarPegawai) {

        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> pegawai.mengajar()
            is Admin -> println("${pegawai.nama} bertugas mengurus administrasi.")
        }

        println()
    }
} {
}

println("=== MATH HELPER ===")

val math = MathHelper()

println("Luas Persegi: ${math.hitungLuas(5)}")
println("Luas Persegi Panjang: ${math.hitungLuas(10, 5)}")
println("Luas Lingkaran: ${math.hitungLuas(7.0)}")

println()


println("=== PAYMENT SYSTEM ===")

val eWallet = EWallet("Diaz", 50000.0)
val creditCard = CreditCard("Diaz", 100000.0)

val paymentMethods: List<PaymentMethod> = listOf(
    eWallet,
    creditCard
)

for (payment in paymentMethods) {

    println("\nNama akun: ${payment.accountName}")

    payment.processPayment(75000.0)

    println()
}


if (payment is EWallet) {

    println("Melakukan top up...")
    payment.topUp(50000.0)

    println("Mencoba pembayaran kembali...")
    payment.processPayment(75000.0)
}