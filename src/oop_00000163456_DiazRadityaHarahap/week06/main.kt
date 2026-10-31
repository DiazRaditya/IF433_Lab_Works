package oop_00000163456_DiazRadityaHarahap.week06

// Fungsi ini decoupled, tidak peduli kelas aslinya apa
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()
    myWatch.connectToBluetooth()
    myWatch.chargeBattery()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)
}

package oop_NIM_NAMA.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()
    myWatch.connectToBluetooth()
    myWatch.chargeBattery()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    // Instansiasi perangkat Smart Home
    val lamp = SmartLamp("Ruang Tamu")
    val speaker = SmartSpeaker("Google Nest Dapur")
    val cctv = SmartCCTV("Ezviz Garasi")
}
