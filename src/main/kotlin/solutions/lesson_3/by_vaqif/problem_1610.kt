package solutions.lesson_3.by_vaqif

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Qefeslerin sayini daxil edin: ")
    val qefeslerin_sayi = scan.nextInt()
    print("Dovsanlarin sayini daxil edin: ")
    val dovsanlarin_sayi = scan.nextInt()

    if (qefeslerin_sayi<dovsanlarin_sayi){
        print("Max dovsan sayi: ${qefeslerin_sayi} ")
    }


}