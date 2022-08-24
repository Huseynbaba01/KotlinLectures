package homework

import java.util.*
import kotlin.math.ceil
import kotlin.math.floor

val scanner = Scanner(System.`in`)
fun main(){

    //exercise1()
    //exercise2()
    exercise3()
}

fun exercise3() {

    val a = scanner.nextInt()




}
fun exercise2() {

   /*
    var a = scanner.nextInt()
    val b = scanner.nextInt()*/

    var count = 0  // sagird sayi
    val students  = mutableListOf(30,27,31,25,32,29,25,30)
    //a= students.size

    for (i in students) {
        if (i < 31) {
            ++count
        }
    }
    val n = (count * 0.2 / 0.9)// sud
    println(ceil(n))
    println(count)
}
fun exercise1() {
    val scanner = Scanner(System.`in`)
    var num = scanner.nextLong()

   while (num != 0L){
       print(num%10)
       num/=10
   }
}
