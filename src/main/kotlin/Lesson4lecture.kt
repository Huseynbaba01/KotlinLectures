fun main(){
/*    val a = 5
    val b = 3
    println(sum(a, b))

    val c = -5
    val d = 13
    println(sum(c, d))
    println(max(2,5))

    */
    val number = 6
//    println(factorial(5))
//    println(fibonacci(number))
    println(multiply(b = 10))
}

fun sum(first: Int,second: Int): Int{

    return first + second
}

fun max(first: Int, second: Int): Int{
    if(first > second) return first
    if(first == second) return -1
    return second
}

fun factorial(n: Int): Int{
    if(n == 1) return 1
    return n*factorial(n-1)
}

//1 -> 1   2 -> 1 1 1 2 3 5 8

fun fibonacci(n: Int): Int{
    if(n == 1 || n == 2) return 1
    return fibonacci(n-1)+fibonacci(n-2)
}
fun multiply(a: Int = 3, b: Int): Int{
  return a*b
}

fun sth(str: String, a: Int = 5){}

