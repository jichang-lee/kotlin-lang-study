package com.kotlin.study.section3.Inheritance.kotlinPack

class Cat(
        species:String
) : Animal(species,4) {

    override fun move() {
        println("야용")
    }
}