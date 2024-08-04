package com.example.problemsolvingkotlin.easy

fun main() {
    val result = maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))
    println(result)
}

fun maxProfit(prices: IntArray): Int {
    var lowestPrice: Int = Int.MAX_VALUE
    var maxProfit = 0

    for (p in prices) {
        if (p < lowestPrice) {
            lowestPrice = p
        } else if (p - lowestPrice > maxProfit) {
            maxProfit = p - lowestPrice
        }
    }
    return maxProfit
}