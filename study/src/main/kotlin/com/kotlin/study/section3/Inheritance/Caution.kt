package com.kotlin.study.section3.Inheritance

fun main() {
    Derived(10)
    /**
     * 출력값 Base Class /n 0 /n Derived Class
     * number = 0 ?
     * 하위 클래스 즉, Dervied 에 number 값이 할당되어 있지 않기 때문
     * 상위 초기화 블록이 먼저 실행됨에 따라 0임
     * ***주의
     * 상위 클래스의 생성자 또는 초기화 블록에서 open 프로퍼티를 사용하면 얘기치 못한 버그가 발생할 수 있음
     */
}

open class Base(
        open val number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
    }
}


class Derived(
        override val number: Int
) : Base(number){

    init {
        println("Derived Class")
    }
}