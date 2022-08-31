package eolympLesson1

import java.util.Scanner

fun main() {

    var n: Int

    val scanner = Scanner(System.`in`)

    n = scanner.nextInt()

    while (n / 10 > 0) {
        print(n % 10)
        n /= 10
    }
    print(n)

}