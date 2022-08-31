package eolympLesson1

import java.util.Scanner

fun main() {

    var num: Long
    var count = 0

    val scanner = Scanner(System.`in`)

    num = scanner.nextLong()

    while (num > 0) {
        count++
        num /= 10
    }

    println(count)


}