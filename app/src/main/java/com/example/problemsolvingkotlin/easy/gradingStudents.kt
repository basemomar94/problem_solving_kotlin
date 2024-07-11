package com.example.problemsolvingkotlin.easy

/**
 * At HackerLand University, grades below 38 are failing and not rounded. For grades 38 and above,
 * if the grade is within 3 points of the next multiple of 5, it is rounded up to that multiple.
 */
fun gradingStudents(grades: Array<Int>): Array<Int> {
    val roundedGrades = mutableListOf<Int>()
    for (g in grades) {
        if (g >= 38) {
            val remaining = 5 - (g % 5)
            if (remaining < 3) {
                val roundGrade = g + remaining
                roundedGrades.add(roundGrade)
            } else {
                roundedGrades.add(g)
            }

        } else {
            roundedGrades.add(g)
        }
    }
    return roundedGrades.toTypedArray()

}