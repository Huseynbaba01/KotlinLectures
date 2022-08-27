package solutions.lesson6

import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

class Circle {

    var R: Double =0.0
    var D: Double =0.0
    var S: Double =0.0

    fun rh(){
        val scanner =Scanner(System.`in`)
        val  m=scanner.nextInt()
        for (i in 1..m) {
            var x1 = scanner.nextDouble()
            var y1 = scanner.nextDouble()
            var x2 = scanner.nextDouble()
            var y2 = scanner.nextDouble()
            R = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
            D = 2 * R
            S = Math.PI * R.pow(2)
            print("Radius= = " + R + " Diametr = " + D + " Sahə = " + S)
        }
    }

}

fun  main(){

    Circle().rh()

}