import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var k = 4
    for (i in 1 until n) {
        k *= 5
    }
    print(k)
}