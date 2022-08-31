package eolympLesson1

import java.util.Scanner

fun main() {

    var n: Int
    var m: Int

    val scanner = Scanner(System.`in`)

    n = scanner.nextInt()
    m = scanner.nextInt()

    println((m / n) + (m % n))


}