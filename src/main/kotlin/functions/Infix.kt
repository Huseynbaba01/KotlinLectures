package functions

fun main(){
    MyNumber(5) plus 10

}

class MyNumber(var a:Int):Int{
    infix fun plus(b:Int): Int {
        return b + a
    }
}