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


order.customer?.address?.city?.let {
    println("Customer City: $it")
}


val mixedData: List<Any> = listOf(
    "Kotlin",
    100,
    "Java",
    true,
    200,
    "Python"
)
