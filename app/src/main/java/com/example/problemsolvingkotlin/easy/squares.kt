package com.example.problemsolvingkotlin.easy

/**
Given a starting integer and an ending integer that define an inclusive range,
write a function to determine the number of perfect square integers within that range.
A perfect square integer is an integer that is the square of another integer (e.g., 1, 4, 9, 16).
 */

fun squares(a: Int, b: Int): Int {
    val start = Math.ceil(Math.sqrt(a.toDouble())).toInt()
    val end = Math.floor(Math.sqrt(b.toDouble())).toInt()
    return end - start + 1
}