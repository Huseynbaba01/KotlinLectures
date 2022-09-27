package functions

fun main() {
    /*val a = 5
    val b = 3

    sum(3, 55)



    calculate(a, b)
    {x1, x2->
        x1+x2
    }*/

 /*   Any()
    object : Runnable{
        override fun run() {
            println("sth")
        }
    }

    val a = A()
    a.print()
    */

    run1 { println("Hello, World!") }

}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}

fun calculate(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

fun run1(r: Runnable){
    r.run()
}

class A{
    fun print(){
        println("jngbbklm")
    }
}