package com.kotlin.study.section1

import com.kotlin.study.section1.tools.Person

class ObjType {

    /**
     * Any 는 java 에 Object 와도 같다. (모든 객체의 최상위 타입)
     * 모든 primitive type의 최상 타입도 Any 이다.
     * Any 자체로는 Null 을 포함할 수 없음, 필요시 Any? 사용
     */

    fun printAgeIfPerson(obj: Any) {
        if(obj is Person) {
            val person = obj as Person  //as 는 생략 가능
            println(person.name)
        }
    }

    fun printAgeNotIfPerson(obj: Any) {
        if(obj !is Person) {
            val person = obj as Person;
            println(person.name)
        }
    }

    fun printAgeIfPersonNullSafe(obj: Any?) {
        val person = obj as? Person
        println(person?.name)
    }



    companion object {
//        @JvmStatic
        fun A() {
            val objType = ObjType()
            val person = Person("개발자",0)

            objType.printAgeIfPersonNullSafe(null)
        }
    }

}