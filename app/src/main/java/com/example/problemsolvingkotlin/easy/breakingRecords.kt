package com.example.problemsolvingkotlin.easy

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var min = scores[0]
    var max = scores[0]
    var minCount = 0
    var maxCount = 0

    for (s in scores) {
        if (s > max) {
            max = s
            maxCount += 1
        }
        if (s < min) {
            min = s
            minCount += 1
        }
    }
    return arrayOf(maxCount, minCount)
}