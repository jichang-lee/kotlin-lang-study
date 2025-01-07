package com.kotlin.study.section3.variousClass

sealed class SealedClass(
        val name: String,
        val price: Long
)

class Avante : SealedClass("아반떼",1_000L)

class Sonata : SealedClass("소나다",2_000L)

class Grandeur : SealedClass("그랜저",3_000L)



fun main() {
    handleCar(Avante())
}

private fun handleCar(car: SealedClass) {
    when(car) {
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}