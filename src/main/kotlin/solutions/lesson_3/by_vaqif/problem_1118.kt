package solutions.lesson_3.by_vaqif

import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    print("qarpizlarin sayi: ")
    val qarp_say = scan.nextInt()
    var min = Int.MAX_VALUE
    var max = 0

    for (i in 1..qarp_say){
        print("${i}) cekileri: ")
        val ceki = scan.nextInt()

        if (ceki > max){
            max = ceki
        }

        if (min>ceki){
            min = ceki
        }
    }
    println("Min num: ${min},Max num: ${max}")
}