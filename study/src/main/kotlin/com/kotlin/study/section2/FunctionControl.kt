package com.kotlin.study.section2

/*
    접근지시어 fun 함수이름(파라메터): 리런타입
 */
fun main() {
    repeat("Hi", 3, true)
    repeat2("word")
    repeat2("특정 매개변수에 값 할당", useNewLine = false)

    printAll("A","B","C")
    val arrays = arrayOf("A","B","C")
    //spread 연산자
    printAll(*arrays)
}

fun max(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun max1(a: Int, b: Int): Int =
        if (a > b) {
            a
        } else {
            b
        }

fun max2(a: Int, b: Int) = if (a > b) a else b

fun repeat(str: String, num: Int, useNewLine: Boolean) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            println(str)
        }
    }
}

/**
 * java 에 overLoading 과도 같다
 * java 에서는 같은 이름에 메서드를 3개 만들어서 사용하였지만
 * kotlin 에서는 default parameter 를 사용하여 메서드를 하나만 만들며 간결하게 볼 수 있다.
 */
fun repeat2(
        str: String,
        num: Int = 3,
        useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            println(str)
        }
    }
}

//java -> String... strings
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}

