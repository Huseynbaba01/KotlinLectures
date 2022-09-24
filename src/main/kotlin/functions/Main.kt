package functions

import kotlin.math.absoluteValue

fun main(){
/*    val first = MyNumber(4)
    println(first add 4 subtract 3)
    println(first)*/
    val myAny = MyAny()
    println(myAny.toInteger("45")+myAny.toInteger("30"))

    println(Any().toInteger("25") + Any().toInteger("50"))
//    println(myAny + 4)
    println(MyNumber(4) + 6)
    println(MyNumber(4) + MyNumber(5))

    println(5+3)

}

fun returnDouble(a: Int): Int{
    return a*2
}

fun returnTriple(a: Int) = a*3

class  MyNumber(var value: Int){

    operator fun plus(a: Int): Int{
        value += a
        return value
    }

    operator fun unaryMinus(){
        value *= -1
    }

    operator fun plus(second: MyNumber): Int{
        value += second.value
        return value
    }

    fun toDouble(s: String) = s.toDouble()

    fun sth(){
        println("STH")
    }

    infix fun add(a: Int): MyNumber{
        value += a
        return this
    }

    infix fun subtract(a: Int): MyNumber {
//        value -= a
        return MyNumber(value - a)
    }

    override fun toString(): String {
        return value.toString()
    }
}

class MyAny{
     fun toInteger(s: String) = s.toInt()
}

fun Any.toInteger(s: String) = s.toInt()

fun MyNumber.multiply(a: Int) = this.value*a //Extension

fun MyNumber.sth() = print("jlhdfb") //

infix fun Any.toDouble(s: String): Double {  //Infix & Extension
    MyNumber(4).toDouble("98345")
    return s.toDouble()
}
operator fun Int.plus(a: Int): Int {   //Operator & extension
    return /*this.absoluteValue+*/a
}

