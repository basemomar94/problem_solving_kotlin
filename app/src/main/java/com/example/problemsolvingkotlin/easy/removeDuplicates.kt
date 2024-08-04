package com.example.problemsolvingkotlin.easy

fun main() {
    val result = removeDuplicates(intArrayOf(1, 1,4,5,5,5,6,6 ,7,8,8,9,9))
    println(result)
}

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    var i = 0
    for (j in 1 until nums.size) {
        if (nums[j] != nums[i]) {
            i++
            println("adding at index $i")
            nums[i] = nums[j]

        }
    }
    return i+1
}