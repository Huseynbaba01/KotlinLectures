import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    /*var max = 0
    var sayi =0
    var number = scanner.nextLong()
    while(number != 0L){
        val qaliq = (number % 10).toInt()
        if(qaliq == max){
            sayi ++
        }
        if(qaliq > max){
            max = qaliq
            sayi = 0
        }
    }*/
    var a = 5
    var b = 3

    a = a +b // a = 8
    b = a - b // b = 5 a = 8
    a = a - b

    print("a = $a  --  b = $b")

    //  b = 5  a = 3
}