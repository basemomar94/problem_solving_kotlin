package com.example.problemsolvingkotlin.easy

/**
Given an array of integers,
determine the minimum number of elements to delete to leave only elements of equal value.
 */
fun equalizeArray(arr: Array<Int>): Int {
    val frequencyValueMap = mutableMapOf<Int, Int>()
    var maxFrequency = 0
    for (num in arr) {
        frequencyValueMap[num] = (frequencyValueMap[num] ?: 0) + 1
        val currentDuplication = frequencyValueMap[num] ?: 0
        if (currentDuplication > maxFrequency) {
            maxFrequency = currentDuplication
        }
    }
    return arr.size - maxFrequency
}