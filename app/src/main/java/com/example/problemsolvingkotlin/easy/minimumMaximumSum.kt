package com.example.problemsolvingkotlin.easy

/**
 * getting the minimum and maximum sum of 4 out of 5 positive integers.
 */
private fun minimumMaximumSum(arr: Array<Int>): Pair<Long, Long> {
    var smallestNumber = Long.MAX_VALUE
    var largestNumber: Long = 0
    var totalSum: Long = 0
    arr.forEach { num ->
        val longNum = num.toLong()
        if (num > largestNumber) {
            largestNumber = longNum
        }
        if (num < smallestNumber) {
            smallestNumber = longNum
        }
        totalSum += num

    }
    val largestSum = totalSum - smallestNumber
    val smallestSum = totalSum - largestNumber
    return Pair(smallestSum, largestSum)

}