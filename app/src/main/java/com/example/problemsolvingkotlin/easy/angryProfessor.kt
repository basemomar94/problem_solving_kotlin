package com.example.problemsolvingkotlin.easy


fun angryProfessor(threshold: Int, attendanceList: Array<Int>): String {
    var attendanceCount = 0
    for (attendant in attendanceList) {
        if (attendant <= 0) {
            attendanceCount = attendanceCount + 1
        }
    }
    return if (attendanceCount >= threshold) "NO" else "YES"
}