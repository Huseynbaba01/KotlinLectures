package lesson5

import java.util.Scanner
import java.util.TreeSet

//Array

fun main() {
//    val myArray: Array<Int> = arrayOf(12,2)
    //1 1 2 3 5 8 13 21 34 ...
    val scanner = Scanner(System.`in`)
    val myList = mutableListOf<String>()
//    val n = scanner.nextInt()
//    val fibonacci = Array(n) { 0 }
//    fibonacci[0] = 1
//    fibonacci[1] = 1
//    for(i in 2 until fibonacci.size){
//        fibonacci[i] = fibonacci[i-1] + fibonacci[i-2]
//    }
//    fibonacci.forEach { myNumber ->
//        print("$myNumber ")
//    }
    /*val myArray = Array(n){0}
    for (i in 0 until n){
        myArray[i] = scanner.nextInt()
    }
    val temp = myArray[myArray.size - 1]
    for(i in myArray.size-1..1){
        myArray[i] = myArray[i-1]
    }
    myArray[0] = temp
    myArray.forEach {
        println(it)
    }*/
    //MutableList ArrayList LinkedList
    // 1 2 3 0 -1
/*    val myList = mutableListOf(1, 2, 3, 0, -1)
    myList[0] = 3
    myList.add(4)
    myList.add(6)
    myList.add(-1)
    myList.add(Int.MAX_VALUE)
    val mySecondList = arrayListOf<Int>()
    mySecondList.add(3)*/
<<<<<<< HEAD
    /*val mySet = HashSet<Int>()
    mySet.add(4)*/


=======
    val mySet = HashSet<Int>()
    mySet.add(4)
>>>>>>> origin/master
    val myTreeSet = TreeSet<Any>()
    for (i in 1..5) {
        if (i % 2 == 0) {
            scanner.next()
            myTreeSet.add(scanner.nextInt())
        } else myTreeSet.add(scanner.next())
    }
    myTreeSet.forEach {
        println(it)
        if (it is Int) {
            print(it + 5)
        } else print("Not an integer")
    }
}
/*
fun fibonacci(n: Int): Int{
    if(n == 1 || n == 2) return 1

    return fibonacci(n-1) + fibonacci(n-2)
}
*/
