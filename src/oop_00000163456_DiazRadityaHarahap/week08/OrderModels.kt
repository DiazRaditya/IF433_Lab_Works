package oop_00000163456_DiazRadityaHarahap.week08

data class Address(
    val city: String?
)

data class Customer(
    val address: Address?
)

data class Order(
    val customer: Customer?
)

