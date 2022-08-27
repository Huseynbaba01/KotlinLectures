package solutions.lesson7.by_huseynbaba

class Example {
    // nested , inner

    class Nested{
        class Sth{

        }
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