package com.kotlin.study.section3.variousClass

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> println("korea")
        Country.AMERICA -> println("america")
    }
}


enum class Country(
        private val code: String
) {

    KOREA("KO"),
    AMERICA("US");
}