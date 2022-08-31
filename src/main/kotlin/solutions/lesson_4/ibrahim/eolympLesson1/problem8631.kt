package eolympLesson1

import java.util.Scanner

fun main() {

    var n: Long
    var max: Long = -1
    var count = 0
    val scanner = Scanner(System.`in`)

    n = scanner.nextLong()
    var m = n

    while (m % 10 > 0) {
        if (m % 10 > max) {
            max = (m % 10)
        }
        m /= 10
    }

    if (m > max)
        max = m

    while (n % 10 > 0) {
        if (n % 10 == max) {
            count++
        }
        n /= 10
    }



    println(count)


}