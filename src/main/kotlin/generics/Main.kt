package generics

fun main(){
    var myList = listOf(1,23,4,6,"sf", MyIntList())
    var x: Any
    myList.forEach {
//        myList[0]+it

    }

    var mySecondList = MyList<Int, String, Any>(5)

//    var pair = Pair<Int, Int>(4,"  dvfa")

    var m = hashMapOf(Pair(2,3), Pair(2,5))



}





class MyList<T, A, B>(a: T){
}

class MyStringList(){
    var items = arrayOf("fdg","fdgr")
}
class MyIntList(){
    var items = arrayOf("fdg","fdgr")
}

/*
fun printString(s: String){
    println(s)
}

fun printInt(i: Int){
    println(i)
}

fun <T> printAnything(a: T){
    print(a)
}*/
/*
operator fun Any.plus(t: Any): Any{
    return Any()
}*/
