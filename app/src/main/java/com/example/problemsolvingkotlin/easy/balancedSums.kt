package com.example.problemsolvingkotlin.easy

fun main() {
    println(balancedSums(arrayOf(5, 6, 8, 11)))
}

fun balancedSums(numbersList: Array<Int>): String {
    var totalSum = numbersList.sum()
    var leftSum = 0
    for (num in numbersList) {
        totalSum = totalSum - num
        if (leftSum == totalSum) {
            return "YES"
        }
        leftSum = leftSum + num

    }
    return "NO"
}