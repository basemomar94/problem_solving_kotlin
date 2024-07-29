package com.example.problemsolvingkotlin.easy

/**
 * You are given a string consisting of lowercase alphabetic characters.
 * Your task is to convert this string into a palindrome with the minimum number of operations.
 * An operation consists of reducing the value of any character by 1 (e.g., changing 'd' to 'c').
 * Note that you can only decrease the value of the characters, not increase them.
 */
fun minOperationsToPalindrome(input: String): Int {
    var counter = 0
    val size = input.length
    val lastIndex = size - 1
    for (i in 0 until size / 2) {
        val leftChar = input[i]
        val rightChar = input[lastIndex - i]
        counter = counter + Math.abs(leftChar - rightChar)
    }
    return counter
}