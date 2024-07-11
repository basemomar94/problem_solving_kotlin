package com.example.problemsolvingkotlin.easy

/**
 * There is a large pile of socks that must be paired by color.
 * Given an array of integers representing the color of each sock,
 * determine how many pairs of socks with matching colors there are.
 */
fun sockMerchant(ar: Array<Int>): Int {
    val pairsMap = mutableMapOf<Int, Int>()
    var pairsTotalCount = 0
    for (sock in ar) {
        pairsMap[sock] = (pairsMap[sock] ?: 0) + 1
    }
    for (pair in pairsMap.values) {
        pairsTotalCount += pair / 2
    }
    return pairsTotalCount
}