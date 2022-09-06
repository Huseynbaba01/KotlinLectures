package homework

import java.util.*
import kotlin.math.ceil
import kotlin.math.floor

val scanner = Scanner(System.`in`)
fun main(){

    //exercise1()
    //exercise2()
    //exercise3()
    exercise4()

}

fun exercise4() {

    val a = scanner.nextInt()
    val b = scanner.nextInt()


    val list = arrayListOf(1,2,3,4,5,6,7,8,9)
    val listSub = arrayListOf(a,b)
    for ( listSub in list) {
        println(listSub)
    }
}
enum class CarType{
    Sedan,
    Jeep
}

class Car(carType: CarType , model: String) {




}
fun sth(){
    val newCars = Car(CarType.Sedan , "Mercedes")
    val newCars2 = Car(CarType.Jeep, "Mercedes")

    val list = listOf(newCars , newCars2)
    list.forEach{

    }
}

fun exercise3() {

        var cem :Double = 0.0
        var hasil: Double = 1.0
        val  scan = Scanner(System.`in`)

        print("Enter a number: ")
        var num = scan.nextInt()

        while (num > 0){
            val qaliq = num % 10
            cem += qaliq
            hasil *= num % 10
            num /= 10
        }
        val cavab : Double = hasil / cem
        print(cavab)

}
fun exercise2() {

   /*
    var a = scanner.nextInt()
    val b = scanner.nextInt()*/

    var count = 0  // sagird sayi
    val students  = mutableListOf(30,27,31,25,32,29,25,30)
    //a= students.size

    for (i in students) {
        if (i < 30) {
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
