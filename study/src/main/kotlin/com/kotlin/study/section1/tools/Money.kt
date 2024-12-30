package com.kotlin.study.box

class Money(
        val money: Int

) {

    operator fun plus(other: Money): Money {
        return Money(this.money + other.money)
    }

    override fun toString(): String {
        return "Money(money=$money)"
    }
}