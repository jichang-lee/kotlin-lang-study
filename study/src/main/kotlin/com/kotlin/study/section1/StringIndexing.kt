package com.kotlin.study.section1

import com.kotlin.study.section1.tools.Person

fun A() {
    val person = Person("최익현", 99)
    println("이름은 ${person.name} 입니다. 나이는 ${person.age} 입니다")

    val name = "익현최"
    println("사실 이름은 $name") //가독성을 위해 ${} 사용하는 것이 더 좋다고 생각한다

    val trimIndent = """
      ABC
      ${name}
        FFFF
    """.trimIndent()
    println(trimIndent)
}