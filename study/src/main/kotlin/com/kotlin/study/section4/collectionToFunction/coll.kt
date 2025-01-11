package com.kotlin.study.section4.collectionToFunction

import com.kotlin.study.section4.lambda.Fruit

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 2_500),
        Fruit("바나나", 3_200),
        Fruit("수박", 10_000),
    )

    val isApple = fruits.all { fruit -> fruit.name == "사과" } // 모든 조건을 만족하면 true
    val isApple2 = fruits.none { fruit -> fruit.name == "사과" } // 모든 조건을 불만족하면 true (all 과 반대 개념)
    val isApple3 = fruits.any() { fruit -> fruit.name == "사과" } // 하나라도 만족시 true
    fruits.count()  //count
    fruits.sortedBy { fruit -> fruit.price } //orderBy 오름차순
    fruits.sortedByDescending { fruit -> fruit.price } //orderBy 역순
    fruits.distinctBy { fruit -> fruit.name } //변형된 값 기준 중복 제거
        .map { fruit -> fruit.name }
    /**
     * 그 외 너무 많다.. 실제 사용할 떄 검색하고 알아가면서 쓰자
     */



}


private fun filterFruitsFilter(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}

