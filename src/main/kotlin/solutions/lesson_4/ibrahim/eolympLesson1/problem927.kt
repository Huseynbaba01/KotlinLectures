package eolympLesson1

import java.util.Scanner

fun main() {

    var n: Int
    var a: Int
    var b: Float
    var count = 0

    val scanner = Scanner(System.`in`)
    n = scanner.nextInt()

    for (i in 1..n) {
        a = scanner.nextInt()
        b = scanner.nextFloat()

        if (b < 50.0) {
            count += a
        }
    }


    println(count)
    sum(6, 6)


}

fun sum(a: Int = 5, b: Int) {

}