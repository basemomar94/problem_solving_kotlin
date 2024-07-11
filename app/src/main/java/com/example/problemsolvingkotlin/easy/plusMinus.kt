package com.example.problemsolvingkotlin.easy

/**
Given an array of integers, calculate the ratios of positive, negative, and zero elements.
Print the decimal value of each fraction on a new line with 6  places after the decimal.
 */
fun plusMinus(arr: Array<Int>) {
    var positiveCount = 0
    var negativeCount = 0
    var zeroCount = 0
    for (i in arr) {
        when {
            i > 0 -> positiveCount += 1
            i < 0 -> negativeCount += 1
            else -> zeroCount += 1
        }
    }
    val totalSize = arr.size.toFloat()
    println(String.format("%.6f", positiveCount / totalSize))
    println(String.format("%.6f", negativeCount / totalSize))
    println(String.format("%.6f", zeroCount / totalSize))
}