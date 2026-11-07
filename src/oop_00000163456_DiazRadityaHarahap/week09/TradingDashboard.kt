package oop_00000163456_DiazRadityaHarahap.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, 8.3, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, -12.0, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 10, 3.5, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 25, 7.8, "OPEN"),
        TradeLog("SOLUSDT", "LONG", 10, 22.4, "CLOSED"),
        TradeLog("SOLUSDT", "SHORT", 5, -3.8, "CLOSED")
    )

    println(tradeHistory)
}


val closedTrades = tradeHistory.filter {
    it.status == "CLOSED"
}

println("Closed Trades: $closedTrades")


val winningTrades = closedTrades.filter {
    it.roe > 0
}

println("Winning Trades: $winningTrades")


val losingTrades = closedTrades.filter {
    it.roe <= 0
}

println("Losing Trades: $losingTrades")


val losingTrades = closedTrades.filter {
    it.roe <= 0
}

println("Losing Trades: $losingTrades")


val topPerformersString = winningTrades
    .sortedByDescending { it.roe }
    .map {
        "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
    }

println(topPerformersString)


val worstPerformersString = losingTrades
    .sortedBy { it.roe }
    .map {
        "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
    }

println(worstPerformersString)


