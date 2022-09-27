fun main(){
    val a = 5
    val b = 3
    println(sum(a,b))
    println(vurma(a,b))
    println(bolme(a,b))
    println(cixma(a,b))
    println(max(a,b))

    println("********************************")

    val c = -48
    val d = 9
    println(sum(c,d))
    println(vurma(c,d))
    println(bolme(c,d))
    println(cixma(c,d))
    println(max(c,d))

    println("********************************")

    val number = faktorial(9)
    println(number)

    println("********************************")

    val numb = 6
    println(fibonacci(numb))

    println("********************************")

    println(multiplyWithDefaultSameArqmnt(a = 5))

    println(multiply(8,78))

}

fun sum(first:Int,second:Int):Int = first +second

fun vurma(first: Int,second: Int):Int = first * second

fun bolme(first: Int,second: Int):Int = first / second

fun cixma(first: Int,second: Int):Int = first - second

fun max(first: Int,second: Int):Int{
    if (first > second) return first
    else if (first == second) return -100000
    else return second
}

      //FAKTORIAL tapmaq fun-u:

fun faktorial(n:Int):Int{
    if (n ==1) return 1
    return n * faktorial(n-1)

}

    //fibonacci qanunu:(HER BIR EDED OZUNDEN EVVELKI 2 EDEDIN CEMINE BERABERDIR):mes:1den basklayir: 1 1 2 3 5 8 13 21

fun fibonacci(n:Int):Int{

     if (n == 1 || n ==2) return  1
     return fibonacci(n-1) + fibonacci(n-2)

}

fun multiply(a: Int,b:Int) = a * b

fun multiplyWithDefaultSameArqmnt(a:Int, b:Int = 7):Int = a * b

