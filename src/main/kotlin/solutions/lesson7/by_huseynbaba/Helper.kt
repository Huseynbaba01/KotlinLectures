package solutions.lesson7.by_huseynbaba

object Helper {

 /*   fun add(a: Double, b: Double): Double{
        val array = Array(5){0}
        return a + b
    }
*/
    fun subtract(a: Int, b: Int): Int {
        val a = if(a == b){
            5
        }else{
            0
        }
        return a - b
    }

    fun add(a: Int = 0, b: Int, c: Int = 5): Int { return a + b }

    fun print(): Unit{ return println() }

    fun ijf(){

        var x = WEEKDAYS.MONDAY
        Constants.SUNDAY
        W().SUNDAY
        return println()
    }

    /*
    fun main(){
        add(1, 4)
        add(2)
        add(3)
    }
    */
}

object Constants{
    var SUNDAY = 7
}

class W{

    var SUNDAY = 7
}

enum class WEEKDAYS{
    MONDAY,
    SUNDAY
}