package com.example.problemsolvingkotlin.easy

import kotlin.math.abs


fun main() {
    val result = containsNearbyDuplicate(intArrayOf(1, 0, 1, 1), 1)
    println(result)
}

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val duplicationMap = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        if (duplicationMap.containsKey(nums[i]) && (abs(duplicationMap[nums[i]]!! - i) <= k)) return true
        duplicationMap[nums[i]] = i
    }
    return false
}

fun containsDuplicate(nums: IntArray): Boolean {
    val duplicationMap = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        if (duplicationMap.containsKey(nums[i])) return true
        duplicationMap[nums[i]] = i
    }
    return false
}