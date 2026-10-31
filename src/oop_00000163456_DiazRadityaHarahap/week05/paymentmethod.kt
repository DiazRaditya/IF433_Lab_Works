package oop_00000163456_DiazRadityaHarahap.week05


abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}