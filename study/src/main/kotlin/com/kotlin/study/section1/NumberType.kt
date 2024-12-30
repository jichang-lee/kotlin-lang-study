package com.kotlin.study.section1

class NumberType {

    fun numberType() {
        //코틀린은 타입을 명시적으로 변경되어야한다
        val number1 = 3.0f //float
        val number2 = 3.0 //double
        val number3 = 3L // Long
        val number4 = 3; // Int
    }


    companion object {
//        @JvmStatic
        fun A() {
            val number = 3;
//            val number2: Long = number; //Type mismatch
            val number2: Long = number.toLong(); //명시적으로 변환
            println(number + number2)

            //null 일 수 있을 때
            val number3: Int? = 3;
            val number4: Long = number3?.toLong() ?: 0;

        }
    }

}