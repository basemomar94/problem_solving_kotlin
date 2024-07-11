package com.example.problemsolvingkotlin.easy

/**
 * The distance between two array values is the number of indices between them.
 * Find the minimum distance between any pair of equal elements in the array. If no such value exists, return - 1
 */
fun minimumDistances(distancesList: Array<Int>): Int {
    var minimumDistance = Int.MAX_VALUE
    val distanceIndexMap = mutableMapOf<Int, Int>()
    for (i in distancesList.indices) {
        val value = distancesList[i]
        if (distanceIndexMap.containsKey(value)) {
            val currentDistance = i - (distanceIndexMap[value] ?: 0)
            if (currentDistance < minimumDistance) {
                minimumDistance = currentDistance
            }
        }
        distanceIndexMap[value] = i
    }
    return if (minimumDistance == Int.MAX_VALUE) -1 else minimumDistance
}