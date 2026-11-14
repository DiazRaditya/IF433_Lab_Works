package oop_00000163456_DiazRadityaHarahap.week10



fun main() {

    val intBox = Box(100)
    val stringBox = Box("Hello Kotlin")

    println("Integer Box: ${intBox.getValue()}")
    println("String Box: ${stringBox.getValue()}")

}


val pairBox = PairBox("Student ID", 12345)

pairBox.display()



printData(3.14)
printData("Kotlin Generic")

val doubleResult = getData(99.9)
val stringResult = getData("Hello Generic")

println("Double Result: $doubleResult")
println("String Result: $stringResult")



val numericStorage = NumericalStorage(50)

numericStorage.display()

println("Maximum Number: ${findMax(10, 20)}")
println("Maximum String: ${findMax("Apple", "Banana")}")



coinRepo.add(Coin("BTC", 0.5))
coinRepo.add(Coin("ETH", 2.0))
coinRepo.add(Coin("USDT", 1000.0))

println(coinRepo.getAll())


val response = ApiResponse(
    "200 OK",
    coinRepo.getAll()
)

println("Response Status: ${response.status}")



response.data.forEach { coin ->
    println("Coin: ${coin.name}")
    println("Balance: ${coin.balance}")
    println("----------------")
}





