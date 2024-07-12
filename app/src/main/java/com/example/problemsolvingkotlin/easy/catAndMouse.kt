package com.example.problemsolvingkotlin.easy

import kotlin.math.abs



fun catAndMouse(catAPosition: Int, catBPosition: Int, mousePosition: Int): String {
    val aRequiredUnits = abs(mousePosition - catAPosition)
    val bRequiredUnits = abs(mousePosition - catBPosition)
    return when {
        aRequiredUnits < bRequiredUnits -> "Cat A"
        bRequiredUnits < aRequiredUnits -> "Cat B"
        else -> "Mouse C"
    }
}