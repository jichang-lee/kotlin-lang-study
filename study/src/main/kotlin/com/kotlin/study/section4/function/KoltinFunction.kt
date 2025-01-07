package com.kotlin.study.section4.function

import com.kotlin.study.section1.tools.Person


/**
 * 확장 함수
 * fun 확장하려는클래스.함수이름(파라미터): 리턴타입 {
 * this를 이용해 실제 클래스 안의 값에 접근 }
 * this -> 수신객체
 * 1. 확장함수는 원본 클래스에 private,protected 접근 불가
 * 2. 멤버함수, 확장함수 중 멤버함수에 우선권이 있다.
 * 3. 확장 함수는 현재 타입을 기준으로 호출된다
 */

fun main() {
    val str = "ABC"
    println(str.lastChar())

    val number = 1
    number.add(2)
    number add2 3
}

fun String.lastChar(): Char {
    return this[this.length - 1] //string 대괄호
}


fun Int.add(other: Int): Int {
    return this + other;
}

//중위 함수 -> 멤버 함수에도 붙일 수 있음
infix fun Int.add2(other: Int): Int {
    return this + other;
}

//덧셈하는 로직 자체가 그 함수를 부른 쪽에 복붙 된거임
inline fun Int.add3(other: Int): Int {
    return this + other;
}


fun createPerson(firstName: String, lastName: String): Person {
    if (firstName.isEmpty()) {
        throw IllegalArgumentException("firstName 은 비어있을 수 없습니다 ! 현재 값 : ${firstName}")
    }
    if (lastName.isEmpty()) {
        throw IllegalArgumentException("firstName 은 비어있을 수 없습니다 ! 현재 값 : ${lastName}")
    }

    return Person(firstName + lastName,20)
}

//지역함수
//depth 가 깊어지고 코드가 깔끔해보이진 않음 Person 에서 구현하는게 더 나아보임
fun createPerson2(firstName: String, lastName: String): Person {
    fun validName(name: String, fieldName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다! 현재값 : ${name}")
        }
    }

    validName(firstName,"firstName")
    validName(lastName,"lastName")

    return Person(firstName + lastName,20)
}