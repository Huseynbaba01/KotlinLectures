package generics
//let apply also run
fun main(){
    var any: Any? = null
    val test = Test()
    test.sth?.sth?.sth?.test2()
    test.sth?.sth?.sth?.test1()
    test.sth?.sth?.sth?.test3(any!!)

    test.sth?.sth?.sth?.let {
        it.test3(Any())
        it.test1()
        it.test4(it)
    }

    test.sth?.run {
        test1()
    }.run {

    }.run {

    }

    test.sth?.also {

    }

    test.sth?.apply {
        test1()

        test4(this@apply)
    }

    val t = Test()

    t.test4(t.also {
        it.test1()
        it.test2()
        it.test3(Any())
    })







    any?.hashCode()
    any?.toString()
    /**some operations*/

    any?.let {
        it.toString()
        it.hashCode()
    }


}

class Test{
    var sth : Test? = null

    fun test1(){
        if(sth != null) {
//            sth.test2()
        }
    }

    fun test2(): Boolean{
        var x = Test() as Any
        return true
    }

    fun test3(x: Any){
        when{
            x is Int -> {

            }
            x is Double -> {

            }
        }
    }

    fun test4(t: Test){

    }



}

