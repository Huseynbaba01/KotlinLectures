package solutions.lesson7.by_huseynbaba

class Person(maturity: Maturity) {
    var maturity: Maturity
    init {
        this.maturity = maturity
    }
}

open class Parent{
    constructor(){
        println(12)
    }

    override fun toString(): String {
        return super.toString()
    }

    constructor(a: Int, b: Int){
        println(16)
    }
}

class Test(): Parent(){
    var a: Int
    var b: Int

    init {
        println(25)
        a = -1
        b = -1
    }

    constructor(a: Int, b: Int): this(){
        println(31)
        this.a = a
        this.b = b
    }
}

fun main(){
    val test = Test()
}