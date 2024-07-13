package com.example.problemsolvingkotlin.easy

/**
 * The Utopian Tree goes through 2 cycles of growth every year. Each spring,
 * it doubles in height. Each summer, its height increases by 1 meter.
 *
 * A Utopian Tree sapling with a height of 1 meter is planted at the onset of spring.
 * How tall will the tree be after  growth cycles?
 *
 */

fun utopianTree(n: Int): Int {
    var treeHeight = 1
    for (i in 1 until n) {
        if (i % 2 == 0) {
            treeHeight += treeHeight
        } else {
            treeHeight += 1
        }
    }
    return treeHeight
}