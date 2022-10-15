package homework


import generics.MyIndexOutOfBoundsException
import kotlin.IndexOutOfBoundsException
import kotlin.math.asinh

class MyLinkedLists<T> {

    var head: Node<T>? = null
    var size = 0

    fun add(data: T){
        if (size == 0){
            head = Node(null, data)
            size++
        }else addLast(data)
    }

    private fun addLast(data: T) {
        var newNode = head
        while (newNode?.next != null){
            newNode = newNode.next
        }
        newNode?.next= Node(data = data)
        size++
    }

    fun addIndex(index: Int, data: T) {
        try {
            if (index <= size - 1) {
                var newNode = head
                val newData = data
                for (i in 0..index) {
                    newNode = newNode!!.next
                    newNode?.data = newData!!
                }
            }

        }catch (e:IndexOutOfBoundsException){
            e.printStackTrace()
        }
    }

    fun get(index: Int): T {
        if (index <= size - 1) {
            var newNode = head
            for (i in 0..index) {
                newNode = newNode!!.next

            }
            return newNode!!.data
        }else{
            throw MyIndexOutOfBoundsException("Size is $size , but you requested for $index th element")
        }
    }

    fun replace(index: Int , data: T){

            if (index <= size-1){
                val newNode = head
                val newData = data
                newNode!!.data = newData

            }else throw MyIndexOutOfBoundsException("So the index is not movcud ")
    }

    fun replaceAll(old :T , data: T){
        var newNode = head

        while (newNode?.next != null ){
            newNode = newNode.next
            if (old != null){
                var old = newNode?.data
            }else{
                println("bele old yoxdu")
            }
        }



        size++
    }

    fun addAll ( item:List<T>){
    }

    fun addAll(index: Int, items: List<T>){

    }

    fun removeAt(index: Int){

    }



    /*fun getFirstIndexOf(data: T):Int{
        //ElementNotFoundException

    }

    fun getLastIndexOf(data: T): Int{
        //ElementNotFoundException
    }

    fun getIndicesOf(data: T): List<Int>{
        //ElementNotFoundException
    }
*/
    fun clear(){}


    fun printAll(){
        var newNode = head
        while(newNode != null) {
            println("item: " + newNode.data)
            newNode = newNode.next
        }
    }

}



data class Node<T>(var next: Node<T>? = null, var  data : T )


fun main(){
    val list = MyLinkedLists<Int>()
    list.add(25)
    list.add(35)
    list.add(45)
    /*list.printAll()*/

    //println(list.get(2))

    list.replace(2 , 500)
    list.printAll()



}