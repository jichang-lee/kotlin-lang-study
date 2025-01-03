package com.kotlin.study.section3.Inheritance.kotlinPack

abstract class Animal(
        protected val species: String,
        protected open val legCount: Int
) {

    abstract fun move()
}