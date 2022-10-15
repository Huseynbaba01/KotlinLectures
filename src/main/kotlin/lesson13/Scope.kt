package lesson13

class Test{
    var sth : Test? = null

    fun test1(){

    }
    fun test2 () {
        if(sth != null){

            sth!!.test1()

        }else{
            println()
        }
    }
}