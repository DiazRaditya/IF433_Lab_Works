package oop_00000163456_DiazRadityaHarahap.week08

fun main() {
    val order = Order(
        Customer(
            Address("Jakarta")
        )
    )

    val city = order.customer?.address?.city ?: "Unknown City"

    println("City: $city")
}

