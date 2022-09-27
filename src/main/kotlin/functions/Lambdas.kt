package functions

fun main(){
    val myFun = {a: Int, b: Int->
        print("$a + $b = ")
        a+b
    }

    val myNumber = MyNumber(4)

    myNumber.sth({
        println("kjdfnvlkvf")
    })

    val mySecondFun: (Int, Int) -> Int = { a, b->
        print("$a + $b = ")
        a+b
    }

    val any: Any = Any()

    println(myFun(4, 5)) //
    println(mySecondFun(3, 6)) //

    val myThirdFun = mySecondFun(3,5)
    val myFourthFun = ::second
    val myFifthFun = second(4)

    myFourthFun(4)

}

fun second(a: Int): Int{
    return 0
}

fun sth(){
    println("ihssjs")
}

val sth2 = {
    println("jkdndfnv")
}