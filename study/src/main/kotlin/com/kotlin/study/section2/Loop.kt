package com.kotlin.study.section2


fun numberLoop() {
    val numbers = listOf(1L,2L,3L) // 컬렉션 만드는 방법
    for (number in numbers) {
        println(number)
    }
    // i = 1; i <= 3; i++
    for (i in 1..3) {
        println(i)
    }

    // i = 3; i >= 1; i--
    for (i in 3 downTo  1) {
        println(i)
    }

    // i = 1; i <= 5; i+=2
    for (i in 1..5 step 2) {
        println(i)
    }

    numbers.forEach {
        println(it)
    }
    numbers.forEach{ e ->
        println(e)
    }

    var i = 1; //가변
    while (i <= 3) {
        i++
    }
}