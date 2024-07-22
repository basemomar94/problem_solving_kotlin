package com.example.problemsolvingkotlin.easy

/**
A company has a viral advertising campaign.
At the start of the campaign, 5 people receive the advertisement, and each day,
floor(n/2) of the people who receive the ad like and share it with 3 new people.
Given the number of days, n,
you need to calculate the cumulative number of likes the ad has received by the end of day n.
 */
fun viralAdvertising(days: Int): Int {
    var shared = 5
    var likes = 0
    for (i in 1..days) {
        val currentLiked = shared / 2
        likes = likes + currentLiked
        shared = currentLiked * 3
    }
    return likes
}