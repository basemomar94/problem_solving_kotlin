package com.example.problemsolvingkotlin.easy
/**
 * A video player plays a game in which the character competes in a hurdle race
 * . Hurdles are of varying heights, and the characters have a maximum height they can jump.
 * There is a magic potion they can take that will increase their maximum jump height by 1 unit for each dose.
 * How many doses of the potion must the character take to be able to jump all of the hurdles.
 * If the character can already clear all of the hurdles, return 0 .
 */

fun hurdleRace(k: Int, height: Array<Int>): Int {
    var tallestHurdle = 0
    for (h in height) {
        if (h > tallestHurdle && h > k) {
            tallestHurdle = h
        }

    }
    return if (tallestHurdle > 0) tallestHurdle - k else 0

}