package eolympLesson1

import java.util.Scanner

fun main() {

    var max = -1
    var min = 100
    var n: Int
    var m: Int
    val scanner = Scanner(System.`in`)

    n = scanner.nextInt()


    if (n < 2) {
        println("Ooops!")
    } else {
        for (i in 1..n) {
            m = scanner.nextInt()
            if (m >= max) {
                max = m
            }

            if (n <= min) {
                min = m
            }

        }

        println("$min $max")
    }


    //hacker net






}