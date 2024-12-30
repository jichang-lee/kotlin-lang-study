package com.kotlin.study.section1

import com.kotlin.study.box.Money

//import com.kotlin.study.toolBox.Money1

fun main() {
//    val money1 = Money1(1000)
//    val money2 = Money1(2000)
    val money1 = Money(1000)
    val money2 = Money(1000)
    //compare Override
//    if(money1 > money2) {
//        println("money1이 money2 보다 더 큽니다,")
//    }

    chap2()
    chap3()

}

fun chap2() {
    val money1 = Money(1000)
    val money2 = money1
    val money3 = Money(1000)

    println(money1 === money2); //true
    println(money3 === money1) //false 주소가 다르다
}


fun chap3() {
    val money1 = Money(1000)
    val money2 = Money(2000)

    //override
    println(money1.plus(money2))
    println(money1 + money2)
}

