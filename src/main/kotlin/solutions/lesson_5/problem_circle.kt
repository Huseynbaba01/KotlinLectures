package solutions.lesson_5

import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

class Circle (var test_sayi: Int, var x1:Double, var x2:Double, var y1:Double, var y2:Double ){

    fun calculateCircle() {
        val scan = Scanner(System.`in`)
        print("Testlerin sayi: ")
        this.test_sayi = scan.nextInt()
        for (i in 0 until test_sayi) {
            print("${i + 1}) Enter x1: ")
            x1 = scan.nextDouble()
            print("${i + 1}) Enter x2: ")
            x2 = scan.nextDouble()
            print("${i + 1}) Enter y1: ")
            y1 = scan.nextDouble()
            print("${i + 1}) Enter y2: ")
            y2 = scan.nextDouble()

            val x = (x2 - x1).pow(2)
            val y = (y2 - y1).pow(2)

            val r = sqrt(x + y)


            println("Radius:${i + 1}) " + "%.2f".format(r))


            val d = 2 * r

            println("Diametr:${i + 1})" + "%.2f".format(d))

            val s = Math.PI * r.pow(2)
            println("Sahe: ${i + 1})" + "%.2f".format(s))


        }
    }
}
fun main(){
    val circle = Circle(test_sayi = 1, x1 = 1.00, x2 = 2.00, y1 = 1.00,y2 = 1.00)
    circle.calculateCircle()
}