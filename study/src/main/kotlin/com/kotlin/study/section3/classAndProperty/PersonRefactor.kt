package com.kotlin.study.section3.classAndProperty

class PersonRefactor(
        val name: String = "이지창",
        var age: Int = 10
) {
    init {
        if(age <= 0){
            throw IllegalArgumentException("나이는 ${age}살 일 수 없습니다.")
        }
    }

    //custom Getter

    val isAdult: Boolean
        get() = this.age >= 20

//    val name: String = name
//        get() = field.uppercase() //무한루프 방지를 위한 backing field

    val upperCaseNmae: String
        get() = this.name.uppercase()
}
