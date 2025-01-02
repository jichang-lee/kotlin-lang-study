package com.kotlin.study.section2

import com.kotlin.study.section2.tools.FilePrinter
import org.jetbrains.annotations.NotNull

fun main() {
    val filePrinter = FilePrinter()
    println(filePrinter.readFile())
}

fun parseIntOrThrow(@NotNull str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다.")
    }
}

fun parseIntOrThrow2(@NotNull str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null;
    }
}