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
    myFourthFun.invoke(4)
    mySecondFun.invoke(4, 5);


    val sayHello: (String, String) -> Double = { s1, s2 ->
        println("Hello, ")
        0.7
    }

    fun sh2(s1: String, s2: String): Double{
        println("Hello, ")
        return 0.7
    }



    val sH = sayHello


}

fun second(a: Int): Int{
    return 0
}

fun sth(name: String){
    println("Hello, $name")
}

fun sthSimple(name: String) = println("Hello, $name")


val sth2 = {
    println("jkdndfnv")
}

