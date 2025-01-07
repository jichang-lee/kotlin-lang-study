package com.kotlin.study.section3.`object`

fun main() {
    println(Singleton.a)
    Singleton.a += 10;
    println(Singleton.a)
}

class Person private constructor(
        var name: String,
        var age: Int
) {

    //kotlin 에서는 static 대신 companion object 키워드를 사용
    companion object Factory : Log {

        private const val MIN_MAX: Int = 1;

//        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name,MIN_MAX)
        }

        override fun log() {
            println("요건 Person 클래스에 동행객체이다")
        }
    }


    /**
     * @JvmStatic ?
     * java에서 Kotlin companion object 를 사용하려면 해당 어노테이션이 필요하다.
     */
}

object Singleton {
    var a:Int = 10
}
