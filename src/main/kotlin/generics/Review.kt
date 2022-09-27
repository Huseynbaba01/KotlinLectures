package generics

import java.util.LinkedList

fun main(){
    var sample: Any = Any()
    print(2 + returnSth(5))

    val myList = listOf("iufhv")

}

fun printInt(a: Int){
    println(a)
}
fun printString(a: String){
    println(a)
}

fun <T> returnSth(a: T): T{
    return a
}

