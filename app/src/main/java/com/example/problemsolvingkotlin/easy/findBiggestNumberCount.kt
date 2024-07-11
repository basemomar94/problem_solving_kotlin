package com.example.problemsolvingkotlin.easy

/**
 * Counting the Occurrences of the Largest Number in an Array.
 */
private fun findBiggestNumberCount(input: Array<Int>): Int {
    var biggestNumber = Int.MIN_VALUE
    var count = 0
    input.forEach { c ->
        when {
            c > biggestNumber -> {
                biggestNumber = c
                count = 1
            }

            c == biggestNumber -> {
                count++
            }
        }
    }
    return count
}