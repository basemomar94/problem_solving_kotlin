package com.example.problemsolvingkotlin.easy
/**
 * Two friends like to pool their money and go to the ice cream parlor.
 * They always choose two distinct flavors and they spend all of their money.
 * Given a list of prices for the flavors of ice cream, select the two that will cost all of the money they have.
 */
fun iceCreamParlor(m: Int, arr: Array<Int>): Array<Int> {
    val iceCreamMap = mutableMapOf<Int, Int>()
    for (i in arr.indices) {
        val currentPrice = arr[i]
        val currentDifference = m - currentPrice
        if (iceCreamMap.containsKey(currentDifference)) {
            return arrayOf(iceCreamMap[currentDifference]!! + 1, i + 1)
        }
        iceCreamMap[currentPrice] = i
    }
    return arrayOf()
}


fun iceCreamParlor1(m: Int, arr: Array<Int>): Array<Int> {

    for (i in arr.indices) {
        val currentFlavor = arr[i]
    }
    return arrayOf()

}