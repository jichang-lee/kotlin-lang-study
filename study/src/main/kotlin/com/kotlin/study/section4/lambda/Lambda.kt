package com.kotlin.study.section4.lambda


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

    isApple(Fruit("사과",1_000L))
    isApple.invoke(Fruit("사과",1_000L)) // invoke 로 명시적으로 선언

    filterFruits(fruits, isApple)
    filterFruits(fruits) {fruit: Fruit -> fruit.name == "사과" } //파라메터 마지막이 함수일 떄, 소괄호 밖에 중괄호로 사용 가능
    filterFruits(fruits) {fruit -> fruit.name == "사과" } //타입을 추론할 수 있기에 생략 가능
    filterFruits(fruits) { it.name == "사과" } //파라메터가 하나일 때 it 을 사용하여 생략 가능


}

//익명 함수 1
val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
    return fruit.name == "사과"
}

//익명 함수 2
val isApple2: (Fruit) -> Boolean = { fruit:Fruit -> fruit.name == "사과"}



private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val result = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if(filter(fruit)){
            result.add(fruit)
        }
    }
    return result;
}