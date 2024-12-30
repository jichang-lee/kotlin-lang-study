package com.kotlin.study.section1

import com.kotlin.study.section1.tools.Person

class Variable {

    /**
     * 1. 모든 변수는 우선 val 로 만들고 꼭 필요한 경우 var 로 변경 (디버깅 하기도 쉬워짐)
     * 2. 타입을 명시적으로 작성하지 않아도 타입이 추론된다.
     * 3. primitive Type 과 Reference Type 을 구분하지 않아도 된다 Long == long
     */

    fun A() {
        var number2: Long;
        number2 = 10;
        number2 = 11;

        //val 은 한번 값을 최초 한번 할당 후 초기화 할 수 없다 (불변)
        val number1: Long;
        number1 = 11;
        // number1 = 12;
    }


    fun nullType() {
        var number1: Long = 1_000L;
        // number1 = null; 변수에 null 이 들어갈 수 있다면 타입에 ? 을 붙인다

        var number2: Long? = 1_000L;
        number2 = null;

    }

    fun constructor() {
        //코틀린에서는 new 를 사용 하지 않는다.
        val person = Person("name",0);
    }


}