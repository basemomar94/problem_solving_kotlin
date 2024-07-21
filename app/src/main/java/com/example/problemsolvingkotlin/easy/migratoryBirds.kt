package com.example.problemsolvingkotlin.easy

/**
Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type.
If more than 1 type has been spotted that maximum amount, return the smallest of their ids.
 */

fun migratoryBirds(birdsList: Array<Int>): Int {
    val birdOccurrenceMap = mutableMapOf<Int, Int>()
    for (bird in birdsList) {
        birdOccurrenceMap[bird] = (birdOccurrenceMap[bird] ?: 0) + 1
    }
    var mostFrequentCount = 0
    var mostFrequentBird = Int.MAX_VALUE
    for ((key, value) in birdOccurrenceMap) {
        if (value > mostFrequentCount) {
            mostFrequentCount = value
            mostFrequentBird = key
        } else if (value == mostFrequentCount && key < mostFrequentBird) {
            mostFrequentBird = key
        }
    }
    return mostFrequentBird
}

fun migrateBirdsCount(birdsList: Array<Int>): Int {
    val birdsCount = IntArray(6)
    for (bird in birdsList) {
        birdsCount[bird] = birdsCount[bird] + 1
    }
    var mostFrequentBird = -1
    var mostFrequentCount = birdsCount[0]
    for (i in 1 until birdsCount.size) {
        if (birdsCount[i] > mostFrequentCount) {
            mostFrequentBird = i
            mostFrequentCount = birdsCount[i]
        }
    }
    return mostFrequentBird
}