package solutions.lesson6

import kotlin.math.pow

class test {
    var n: Int?=null
    var x1: Double?=null
    var x2: Double?=null
    var y1: Double?=null
    var y2: Double?=null

    constructor(n: Int, x1: Double, x2: Double, y1: Double, y2: Double) {
        this.n = n
        this.x1 = x1
        this.x2 = x2
        this.y1 = y1
        this.y2 = y2
    }

    fun getCircle(n: Int, x1: Double, x2: Double, y1: Double, y2: Double) {
        var d: Double
        var r: Double
        var area: Double
        r = Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0))
        d = 2 * r
        area = java.lang.Math.PI * r.pow(2)
        println(String.format("%.1f ,%.1f ,%.1f " ,r,d,area))
    }
}
    fun main() {

        var circle1 = test(2,0.3,0.5,1.2,-4.0)
        var circle2=test(2 ,0.0, 0.0 ,3.0, 4.0 )
        circle1.getCircle(2,0.3,0.5,1.2,-4.0)
        circle2.getCircle(2,0.0, 0.0 ,3.0 ,4.0 )

    }


