package com.example.problemsolvingkotlin.easy

/**
 * Given an array of integers,
 * find the longest subarray where the absolute difference between any two elements is less than or equal to 1.
 */
fun pickingNumbers(numbersArray: Array<Int>): Int {
    var maxLength = 0
    val frequencyMap = mutableMapOf<Int, Int>()
    for (num in numbersArray) {
        frequencyMap[num] = (frequencyMap[num] ?: 0) + 1
    }

    for (key in frequencyMap.keys) {
        val currentLength = (frequencyMap[key] ?: 0) + (frequencyMap[key + 1] ?: 0)
        if (currentLength > maxLength) {
            maxLength = currentLength
        }

    }
    return maxLength
}