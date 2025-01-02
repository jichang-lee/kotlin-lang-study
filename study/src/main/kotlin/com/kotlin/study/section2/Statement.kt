package com.kotlin.study.section2


/*
1. kotlin 에서 삼항 연산자는 if else 가 동일하게 수행하기 때문에 삭제되었다.
2. java 에 switch 는 kotlin 에 when 으로 대체되었고, 더 강력한 기능을 갖는다.
*/


fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        return "D"
    }
}

//fun getGradeWithSwitch(score: Int): String {
//    return when(score / 10) {
//        9 -> "A"
//        8 -> "B"
//        7 -> "C"
//        else -> "D"
//    }
//}
fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun validate(score: Int) {
    if (score in 0..100) {
        println()
    }
}

fun ifStartWithA(obj: Any): Boolean {
    return if (obj is String) {
        obj.startsWith("A")
    } else {
        false;
    }
}

fun whenStartWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false;
    }
}

fun judgeNumber(number: Int) {
    return when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1,0,-1 이 아닙니다.")
    }
}

fun judgeNumber2(number: Int) {
    return when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}
