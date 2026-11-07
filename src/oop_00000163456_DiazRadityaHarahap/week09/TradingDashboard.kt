
package oop_NIM_NAMA.week09

fun main() {

    // Checkpoint 11: Data Trading
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

    // Checkpoint 12: Closed Trades
    val closedTrades = tradeHistory.filter {
        it.status == "CLOSED"
    }

    // Checkpoint 13: Winning Trades
    val winningTrades = closedTrades.filter {
        it.roe > 0
    }

    // Checkpoint 14: Losing Trades
    val losingTrades = closedTrades.filter {
        it.roe <= 0
    }

    // Checkpoint 15: Top Performers
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    // Checkpoint 16: Worst Performers
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    // Checkpoint 17: Unique Pairs
    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    // Checkpoint 18: Dashboard
    println("=== CRYPTO TRADING DASHBOARD ===")
    println("=== TOP PERFORMERS ===")

    topPerformersString.forEach {
        println(it)
    }

    // Checkpoint 19: Worst Performers
    println("=== WORST PERFORMERS ===")

    worstPerformersString.forEach {
        println(it)
    }

    println("=== UNIQUE TRADING PAIRS ===")
    println(uniquePairs)
}
