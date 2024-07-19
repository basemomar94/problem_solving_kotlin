package com.example.problemsolvingkotlin.easy

fun main() {
    serviceLane(
        arrayOf(arrayOf(0, 3), arrayOf(4, 6), arrayOf(6, 7), arrayOf(3, 5), arrayOf(0, 7)),
        widthList = arrayOf(2, 3, 1, 2, 3, 2, 3, 3)
    )
}

fun serviceLane( casesList: Array<Array<Int>>, widthList: Array<Int>): Array<Int> {
    val outPutArray = Array(casesList.size) { 0 }
    for (i in casesList.indices) {
        val case = casesList[i]
        var narrowest = Int.MAX_VALUE
        val startIndex = case[0]
        val existIndex = case[1]
        for (i in startIndex..existIndex) {
            val currentWidth = widthList[i]
            if (currentWidth < narrowest) {
                narrowest = currentWidth
            }
        }
        outPutArray[i] = narrowest
    }
    return outPutArray

}