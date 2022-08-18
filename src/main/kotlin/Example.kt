class Example {
    lateinit var name: String
    var number = 0
    fun entered(name: String){
        this.name = name
        val array: Array<Int> = arrayOf()
        val myArray = IntArray(100)
        myArray[0] = 6


    }

    operator fun plus(a: Int): () -> Int = {
        number += a
        number
    }

    fun send(){
        println(name)
    }
}


fun main(){
    try {
        val myArray = IntArray(10999999)
        myArray[0] = 1
        myArray.forEach {
            print("$it  ")
        }
    }catch (_: OutOfMemoryError){

    }
}