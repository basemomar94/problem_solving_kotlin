package com.example.problemsolvingkotlin.easy

fun main() {
    println("${saveThePrisoner(7, 19, 2)}")
}

fun saveThePrisoner(nOfPrisoners: Int, nOfSweets: Int, startChair: Int): Int {
    val lastSweetPosition = (startChair + nOfSweets - 1) % nOfPrisoners
    return if (lastSweetPosition == 0) nOfPrisoners else lastSweetPosition

}