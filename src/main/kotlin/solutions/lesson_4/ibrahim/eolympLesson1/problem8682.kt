package eolympLesson1

import java.util.*
import kotlin.math.pow

fun main() {

    var n: Long
    val scanner = Scanner(System.`in`)

    n = scanner.nextLong()

    var i: Long = n
    var d: Long
    var s = 0.0
    var c = 0.0

    while (i > 0) {
        d = i % 10
        if ((d % 2) != 0L) {
            s += d * 10.0.pow(c++)
        }

        i /= 10
    }

    println(s.toInt())


}