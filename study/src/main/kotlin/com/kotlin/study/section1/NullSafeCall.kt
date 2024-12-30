package com.kotlin.study.section1

import com.kotlin.study.section1.tools.Person

class NullSafeCall {

    inner class StartWithFun {

        fun startWithA1(str: String?): Boolean {
            if(str == null) {
                throw IllegalArgumentException("null이 들어왔습니다.");
            }
            return str.startsWith("A");
        }
        fun startWithA1Custom (str: String?): Boolean {
            return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.");
        }


        fun startWithA2(str :String?): Boolean? {
            if(str == null) {
                return null;
            }
            return str.startsWith("A")
        }
        fun startWithA2Custom(str: String?): Boolean? {
            return str?.startsWith("A")
        }


        fun startWithA3(str :String?): Boolean {
            if(str == null) {
                return false;
            }
            return str.startsWith("A")
        }
        fun startWithA3Custom(str: String?): Boolean {
            return str?.startsWith("A") ?: false;
        }

        // 절대 null 일 수 없다 !! 사용
        fun startWithA4(str: String?): Boolean {
            return str!!.startsWith("A");
        }

        fun test(str: String): Boolean {
            return str.startsWith("A");
        }

    }


    class Elvis {

        fun elvis1() {
            val str: String? = "beef";
//            str.length; //불가능
            str?.length //ㅆ가능

            str?.length ?: 0; //null 이라면 뒤에 0을 호출
        }

    }


    companion object {
//        @JvmStatic
        fun A() {
            val person = Person("공부하는 개발자",0)
            val nullSafeCall = NullSafeCall()
            val startWithFun = nullSafeCall.StartWithFun()

            // Person class 에 NotNull Nullable 처럼 어노테이션이 달려있으면 kotlin 이 잡아줌
//            startWithFun.test(person.getName()) //NPE Exception

            //반대로 null 체크가 없다면 호출 가능
            println(startWithFun.test(person.name))

        }
    }

}
