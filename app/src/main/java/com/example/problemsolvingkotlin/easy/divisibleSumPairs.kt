package com.example.problemsolvingkotlin.easy

/**
You are given an array of integers and a positive integer K.
Your task is to determine the number of pairs (i,j) (i, j) (i,j)
where i<j and the sum of ar[i] + ar[j] is divisible by k.
 */
fun divisibleSumPairs(k: Int, ar: Array<Int>): Int {
    var pairCount = 0

    for (i in ar.indices) {
        for (j in ar.size - 1 downTo i + 1) {
            if ((ar[i] + ar[j]) % k == 0) {
                pairCount += 1
            }

        }
    }
    return pairCount
}