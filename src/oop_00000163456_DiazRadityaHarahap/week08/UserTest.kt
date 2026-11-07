package oop_00000163456_DiazRadityaHarahap.week08


fun runMockUnitTest() {
    val expected: String? = "Kotlin"
    val actual: String? = "Kotlin"

    check(expected!! == actual!!) {
        "Unit Test Failed!"
    }

    println("Unit Test Passed!")
}
