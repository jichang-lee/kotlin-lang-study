package com.kotlin.study.section3.variousClass


fun main() {
    val personDto = PersonDto("이지창",100);
    println(personDto)
}
/**
 * data class ?
 * builder, toString, equals, hashCode 를 자동으로 주입된다.
 * java 에서는 record class
 */
data class PersonDto(
        val name:String ,
        val age:Int
) {
}