package com.example.problemsolvingkotlin.easy

/**
 * There is a sequence of words in CamelCase as a string of letters, , having the following properties:
 * It is a concatenation of one or more words consisting of English letters.
 * All letters in the first word are lowercase.
 * For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
 * Given S , determine the number of words in S.
 */

fun camelcase(sentence: String): Int {
    var wordsCount = 1
    for (s in sentence) {
        if (s.isUpperCase()) {
            wordsCount += 1
        }

    }
    return wordsCount
}