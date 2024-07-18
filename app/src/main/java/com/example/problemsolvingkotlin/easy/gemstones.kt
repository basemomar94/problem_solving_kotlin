package com.example.problemsolvingkotlin.easy

/**
 * There is a collection of rocks where each rock has various minerals embeded in it.
 * Each type of mineral is designated by a lowercase letter in the range a-z.
 * There may be multiple occurrences of a mineral in a rock.
 * A mineral is called a gemstone if it occurs at least once in each of the rocks in the collection.
 * Given a list of minerals embedded in each of the rocks, display the number of types of gemstones in the collection.
 */

fun gemstones(stonesList: Array<String>): Int {
    var gemstonesCount = 0
    val mineralsMap = mutableMapOf<Char, Int>()
    for (stone in stonesList) {
        val currentStone = stone.toCharArray().toSet()
        for (m in currentStone) {
            val currentValue = mineralsMap.getOrDefault(m, 0) + 1
            mineralsMap[m] = currentValue
            if (currentValue == stonesList.size) {
                gemstonesCount = gemstonesCount + 1
            }
        }


    }
    return gemstonesCount
}

//  Example usage:
// input arrayOf("abc", "bcd", "cb")
// output 2
