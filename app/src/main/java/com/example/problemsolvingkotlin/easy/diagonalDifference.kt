package com.example.problemsolvingkotlin.easy

import kotlin.math.abs

/**
Given a square matrix, calculate the absolute difference between the sums of its diagonals.
For example, the square matrix  is shown below:
1 2 3
4 5 6
9 8 9
 */

fun diagonalDifference(matrixList: Array<Array<Int>>): Int {
    var rightCount = 0
    var leftCount = 0
    val lastIndex = matrixList.size - 1
    for (i in matrixList.indices) {
        leftCount = leftCount + matrixList[i][i]
        rightCount = rightCount + matrixList[i][lastIndex - i]
    }
    return abs((rightCount - leftCount))
}