package MentorDersler

import java.util.*


val scan = Scanner(System.`in`)
fun main(){

    //exercise1()
    //exercise2()
    //exercise3()
    //exercise4()--
    //exercise5()
    //exercise6()--
    //exercise8()
    //exercise9()
    //exercise10()
    //exercise11()
    //exercise12()

}


fun exercise1(){
    val a = 1
    val b =100
    val s = ((a+b)/2)*100
    println(s)
}

fun exercise2(){
    var a : Int = 0

    for(i in 1..100){

        if(i % 3==0 && i % 5==0){
            a += i
        }
    }
}

fun exercise3(){

    val list = listOf(5,34,35,55)
    var n = 0
    for (i in list){
        if(n < i){
            n=i
        }
    }
    println(n)
}

fun exercise4() {



}

fun exercise5(){

    val a = "*"
    println(a)
    println(a+a)
    println(a+a+a)
    println(a+a+a+a)
}

fun exercise6() {

    var list = listOf( 4 , 15 , 72 , 86 , 99)


}

fun exercise8(){

    val alfaList = listOf<Int>(5,34,56,14,17)
    val bettaList = listOf<Int>(3,45,9,12,0)

    var max = 0
    var min = 100
    for (i in alfaList + bettaList){
        if(max < i){
            max=i
        }else if(min > i){
            min = i
        }
    }
    println("$max , $min")
}
                        /** 9-cu suali 2 cur yazmisam */
fun exercise9( a : Int , b :Int) : Int{
    return a+b
}

fun exercise9(){
    val a = scan.nextInt()
    val b = scan.nextInt()
    print(a+b)
}

fun exercise10(){

    var count = 0
    val list = listOf(true, false, false, true, false )

    for (i in list){
        if ( i == true ){

            count++
        }

    }
    print(count)

}

fun exercise11(){

    val text = scan.nextLine()
    var count = 0

    val word = text.split(" ".toRegex())
    for (i in word){
        count++
    }

    print(count)
    //print(word.size)
}

fun exercise12(){

    //4x² + 7 x + 3 = 0

    val a = 4.0
    val b = 7.0
    val c = 3.0
    val x1: Double
    val x2: Double

    val d = b * b - 4 * a * c

    if (d > 0) {
        x1 = (-b + Math.sqrt(d)) / (2 * a)
        x2 = (-b - Math.sqrt(d)) / (2 * a)

        println("x1 = $x1 , x2 =$x2")
    } else if (d == 0.0) {
        x2 = -b / (2 * a)
        x1 = x2

        println( "x1 = x2 = $x1")
    } else {

        println("Bu tenliyin koku yoxdu")
    }

}



