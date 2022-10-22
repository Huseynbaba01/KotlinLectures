package functions

fun main(){
    VaqifNumber(5) plus 10

}

class VaqifNumber(var a:Int){
    infix fun plus(b:Int): Int {
        return b + a
    }
}