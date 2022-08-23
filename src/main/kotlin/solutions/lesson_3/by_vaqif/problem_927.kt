package solutions.lesson_3.by_vaqif

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    var umumi_say = 0
    print("Novlerin sayi: ")
    val nov_say = scan.nextInt()

    for (n in 1..nov_say) {
        print("sayi yazin: ")
        val say = scan.nextInt()
        print("qiymeti yazin: ")
        val qiymet = scan.nextDouble()

        if (qiymet < 50.00) {
            umumi_say += say
            print(umumi_say)
        }
    }
}