package com.kotlin.study.section3.classAndProperty

//class Person constructor(name: String, age: Int) {
class Person (
        val name: String,
        var age: Int
) {
        // init 블록은 생성자가 호출되는 시점에 호출된다.
    init {
        if(age <= 0) throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
            println("초기화 init 블록")
    }

    /**
    부생성자
     1. 최종적으로 주생성자를 this 로 호출해야한다.
     2. 있을 수 있고 없을 수 있다.
     3. body 를 가질 수 있다. (선택)
     */
    constructor(name: String): this(name,1) {
        println("첫번쨰 부 생성자") //주 생성자를호출
    }
    constructor(): this("홍길동") {
        println("두번째 부 생성자") //첫번째 생성자1를 호출
    }
}

//    val name = name
//    var age = age

    /**
     * 1. kotlin 은 class 에서 getter & setter 을 자동으로 생성해줌
     * 2. 생성자 constructor 는 생략 가능
     * 3. 필드 또한 생략 가능하다
     * 4. body 에 아무것도 없으면 {} 생략가능
     */


    // java 를 불러올 때도 getName setAge 가 아닌 위 처럼 사용한다
fun main() {
//        val person = Person("이지창", 29)
//        val person2 = Person("이지창")
//        println(person.name) //getter
//        person.age = 30; //setter
//        println(person.age)
        Person()

    }