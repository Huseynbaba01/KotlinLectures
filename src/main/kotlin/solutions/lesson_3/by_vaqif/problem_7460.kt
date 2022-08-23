package solutions.lesson_3.by_vaqif

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Enter number of boy's: ")
    val n = scan.nextInt()
    print("Enter number of girl's: ")
    val m = scan.nextInt()
    print("Yerlerin sayini daxil et: ")
    val k = scan.nextInt()
    print("Otaqlarin sayi: ${(n/k)+(m/k)}")
}