package com.example.problemsolvingkotlin.easy


fun strStr(haystack: String, needle: String): Int {
    val haystackLength = haystack.length
    val needleLength = needle.length

    if (needleLength > haystackLength) return -1
    for (i in 0..haystackLength - needleLength) {
        if (haystack.substring(i, i + needleLength) == needle) return i
    }
    return -1

}