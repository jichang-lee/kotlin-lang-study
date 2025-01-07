package com.kotlin.study.section4.collection

/**
 * java 와 kotlin 코드를 섞어서 컬렉션 사용할 떄 주의
 * java 에서 kotlin 컬렉션을 가져와서 불변 컬렉션을 수정하거나, null을 넣을 수 있다.
 */
fun main() {
    val array = arrayOf(100,200)    //가변

    array.plus(300)

    for(i in array.indices) {
        println("${i} ${array[i]}")
    }

    for((index,value) in array.withIndex()) {
        println("${index} ${value}")
    }

    val setNumbres = setOf(100,200)
    val setMutable = mutableSetOf(100,200);
    val numbers = listOf(100,200)   //값을 추론할 수 있기 때문에 생략 가능 -> 불변
    val mutable = mutableListOf(100,200)    // -> 가변
    mutable.add(300) // 처음에 불변 리스트로 만들고 꼭 필요한 경우 가변 리스트로 바꾸자.
    val emptyNumbers = emptyArray<Int>() //빈 배열로 선언할 경우 담을 객체 타입 설정


    val oldMap = mutableMapOf<Int,String>()
    oldMap.put(1,"MONDAY")
    oldMap.put(2,"MONDAY")

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for(key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for((key,value) in oldMap.entries) {
        println(key)
        println(value)
    }

    /**
     * List<Int?> = 리스트에 null이 들어갈 수 있지만, 리스트는 null 이 아님
     * List<Int>? = 리스트에 null이 들어갈 수 없지만, 리스트는 null일 수 있음
     * List<Int?>? = 리스트에 null이 들어갈 수 있고, null일 수도 있음
     */
}