package com.example.problemsolvingkotlin.easy

/**
 * Two friends Anna and Brian, are deciding how to split the bill at a dinner.
 * Each will only pay for the items they consume. Brian gets the check and calculates Anna's portion.
 * You must determine if his calculation is correct.
 */
fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Int {
    var billCost = 0
    for (i in bill.indices) {
        if (i != k) {
            billCost += bill[i]
        }
    }
    val annPortion = billCost / 2
    return (b - annPortion) / 2
}