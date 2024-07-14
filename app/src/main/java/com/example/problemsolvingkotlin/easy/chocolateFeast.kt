package com.example.problemsolvingkotlin.easy

/**
You are given an amount of money to spend on chocolate bars, where each chocolate bar has a fixed price.
Additionally, there is a promotional offer where you can exchange a certain number of chocolate wrappers for more chocolate bars.
The objective is to determine the total number of chocolate bars you can consume,
starting with the initial purchase using the given money and then repeatedly exchanging the wrappers for additional chocolate bars as long as possible.
Given the initial amount of money, the price of each chocolate bar, and the number of wrappers required for an exchange,
calculate the total number of chocolate bars you can enjoy.
 */

fun chocolateFeast(money: Int, barPrice: Int, numOfWrappers: Int): Int {
    var purchased = money / barPrice
    var wrappersCount = purchased
    while (wrappersCount >= numOfWrappers) {
        val remainingWrapper = wrappersCount % numOfWrappers
        val newPurchased = (wrappersCount / numOfWrappers)
        wrappersCount = newPurchased + remainingWrapper
        purchased = purchased + newPurchased
    }
    return purchased
}