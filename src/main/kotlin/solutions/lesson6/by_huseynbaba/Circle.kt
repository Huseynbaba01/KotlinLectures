package solutions.lesson6.by_huseynbaba

import java.util.Scanner
import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

class Circle(val x1: Double, val y1: Double, val x2: Double, val y2: Double){
    fun getRadius(): Double{
        return sqrt((x2 - x1).pow(2.0) + (y2 - y1).pow(2.0))
    }

    fun getDiameter(): Double{
        return 2*getRadius()
    }

    fun getArea(): Double{
        return PI*getRadius()*getRadius()
    }
}

fun main(){
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    for(i in 0 until n){
        val circle = Circle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble())
        val radius = circle.getRadius()
    }
}
