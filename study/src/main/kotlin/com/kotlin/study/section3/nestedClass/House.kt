package com.kotlin.study.section3.nestedClass

fun main() {

}


class House(
        private val address: String,
        private val livingRoom: LivingRoom
//        private val livingRoom: LivingRoom = LivingRoom(10.0)
) {
    inner class LivingRoom(
            private var area: Double
    ) {
        val address: String
            get() = this@House.address
    }
}