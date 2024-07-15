package com.example.problemsolvingkotlin.easy


/**
There is a new mobile game that starts with consecutively numbered clouds.
Some of the clouds are thunderheads and others are cumulus.
The player can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus 1 or 2 .
The player must avoid the thunderheads. Determine the minimum number of jumps it will take to jump from the starting position to the last cloud.
It is always possible to win the game.

For each game, you will get an array of clouds numbered 0 if they are safe or 1 if they must be avoided.
 */

fun jumpingOnClouds(clouds: Array<Int>): Int {
    var jumpCounter = 0
    var currentPosition = 0
    while (currentPosition < clouds.size - 1) {
        val nextNextJump = clouds.getOrNull(currentPosition + 2)
        if (nextNextJump == 0) {
            currentPosition = currentPosition + 2
        } else {
            currentPosition = currentPosition + 1
        }
        jumpCounter = jumpCounter + 1
    }
    return jumpCounter
}