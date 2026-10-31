package oop_NIM_NAMA.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    // Testing Smartwatch
    val myWatch = Smartwatch()
    myWatch.showTime()
    myWatch.connectToBluetooth()
    myWatch.chargeBattery()

    // Testing Smartphone
    val myPhone = Smartphone()
    myPhone.turnOn()

    // Testing Payment
    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    // Instansiasi Smart Home
    val lamp = SmartLamp("Ruang Tamu")
    val speaker = SmartSpeaker("Google Nest Dapur")
    val cctv = SmartCCTV("Ezviz Garasi")

    // Membuat Smart Home Hub
    val hub = SmartHomeHub()

    // Menambahkan perangkat ke Hub
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    // Mengaktifkan mode keamanan
    hub.activateSecurityMode()

    // Mematikan semua perangkat
    hub.turnOffAllSwitches()
}
