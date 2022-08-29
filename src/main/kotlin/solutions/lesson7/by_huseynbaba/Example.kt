package solutions.lesson7.by_huseynbaba
//OOP  Inheritance Encapsulation Abstraction  Polymorphism
class Example {
    // nested , inner
    lateinit var string: String
    class Nested{
        class Sth{
        }
    }

    fun sth(){
        this.MyInnerClass()
    }

    inner class MyInnerClass{

    }
}

fun main(){
    val example = Example()
    val nestedObject = Example.Nested()
    val sth = Example.Nested.Sth()

    val myInnerObject = example.MyInnerClass()
}