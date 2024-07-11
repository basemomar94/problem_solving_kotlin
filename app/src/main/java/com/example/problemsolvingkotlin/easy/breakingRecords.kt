package com.example.problemsolvingkotlin.easy

/**
 * Maria plays college basketball and wants to go pro. Each season she maintains a record of her play.
 * She tabulates the number of times she breaks her season record for most points and least points in a game.
 * Points scored in the first game establish her record for the season, and she begins counting from there.
 */
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var min = scores[0]
    var max = scores[0]
    var minCount = 0
    var maxCount = 0

    for (s in scores) {
        if (s > max) {
            max = s
            maxCount += 1
        }
        if (s < min) {
            min = s
            minCount += 1
        }
    }
    return arrayOf(maxCount, minCount)
}