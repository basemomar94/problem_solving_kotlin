package com.example.problemsolvingkotlin.easy

/**
 * A person wants to determine the most expensive computer keyboard and USB drive to purchase with a given budget.
 * Given price lists for keyboards and USB drives and a budget,
 * find the cost to buy them. If it is not possible to purchase both items, return  -1
 */
fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, budget: Int): Int {
    var maxSpend = -1
    for (k in keyboards) {
        for (d in drives) {
            val possibleSpend = d + k
            if (possibleSpend in (maxSpend + 1)..budget) {
                maxSpend = possibleSpend

            }
        }
    }
    return maxSpend

}