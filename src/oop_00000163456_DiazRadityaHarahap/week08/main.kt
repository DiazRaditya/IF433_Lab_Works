
package oop_NIM_NAMA.week08

fun main() {

    // Checkpoint 1
    val user = UserProfile(
        username = "Diaz",
        email = "diaz@gmail.com",
        phoneNumber = null
    )

    println(user)

    // Checkpoint 2
    sendNotification("Hello Kotlin")
    sendNotification(null)

    // Checkpoint 4
    val order = Order(
        Customer(
            Address("Jakarta")
        )
    )

    val city = order.customer?.address?.city ?: "Unknown City"
    println("City: $city")

    // Checkpoint 5
    order.customer?.address?.city?.let {
        println("Customer City: $it")
    }

    // Checkpoint 6
    val mixedData: List<Any> = listOf(
        "Kotlin", 100, "Java", true, 200, "Python"
    )

    // Checkpoint 7
    for (item in mixedData) {
        val text = item as? String

        if (text != null) {
            println("String: $text")
        }
    }

    // Checkpoint 8
    val number: Any = "Not a Number"
    val result = number as? Int ?: 0
    println("Result: $result")

    // Checkpoint 11
    val nullableMessage: String? = "Safe Message"
    val message = requireNotNull(nullableMessage) {
        "Message cannot be null!"
    }
    println(message)

    // Checkpoint 13
    val javaName = LegacyJavaAPI.getUserName()!!
    println("Java User: $javaName")

    // Checkpoint 14
    runMockUnitTest()
}
