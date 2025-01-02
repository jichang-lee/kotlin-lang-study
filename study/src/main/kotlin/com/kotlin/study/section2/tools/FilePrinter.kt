package com.kotlin.study.section2.tools

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.IOException

class FilePrinter {
    /**
     * java 와 다르게 kotlin 에서는 checked Exception 과
     * unChecked Exception 을 구분하지 않고 모두 unChecked 이다
     */
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/study/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close();
    }

    /**
     * kotlin 에서는 java 에 try with Resource 를 사용하지 않고 use라는 inLine 함수를 사용한다.
     */
    fun readFileTryToResource(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}