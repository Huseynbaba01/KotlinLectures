package eolympLesson1

import java.util.*

fun main() {

    var n: Int
    var m: Int
    var k: Int
    var count = 0

    val scanner = Scanner(System.`in`)
    n = scanner.nextInt()
    m = scanner.nextInt()
    k = scanner.nextInt()

    if (n < k && n != 0) {
        count++
    } else {
        if (n % k == 0) {
            count += n / k
        } else {
            count += n / k + 1
        }

    }

    if (m < k && m != 0) {
        count++
    } else {
        if (m % k == 0) {
            count += m / k
        } else {
            count += m / k + 1
        }

    }

    println(count)




}