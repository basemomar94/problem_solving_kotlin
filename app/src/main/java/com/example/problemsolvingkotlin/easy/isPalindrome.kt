package com.example.problemsolvingkotlin.easy

fun main() {
    val result = isPalindrome("as")
    println(result)
}

fun isPalindrome(words: String): Boolean {
    val onlyAlphanumeric = StringBuilder()
    for (w in words) {
        if (w.isLetter() || w.isDigit()) {
            onlyAlphanumeric.append(w.lowercase())
        }
    }
    val wordsLength = onlyAlphanumeric.length
    for (i in 0 until wordsLength / 2) {
        val right = onlyAlphanumeric[i]
        val left = onlyAlphanumeric[(wordsLength - 1) - i]
        if (right != left) return false
    }
    return true
}

