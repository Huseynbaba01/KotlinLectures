package generics

class MyLinkedList<T> {
/*    var v: Any? = Any()
    fun sth(){
        v = null
        v = 5
    }

    fun abstractTest(){
        val d = 0.5
        d.toInt()
    }*/
    var head: Node<T>? = null
    var size = 0


    fun add(data: T){
        if(size == 0) addFirst(data)
        else addLast(data)
    }

    private fun addLast(data: T) {
        var currentNode = head
        while(currentNode?.next != null){
            currentNode = currentNode.next
        }

//      currentNode?.next = Node(null, data)
        currentNode!!.next = Node(data = data)
        size++
    }

    private fun addFirst(data: T){
        head = Node(null, data)
        size++
    }

    fun printAll(){
        var currentNode = head
        while(currentNode != null) {
            println("item: " + currentNode.data)
            currentNode = currentNode.next
        }
    }

    fun get(index: Int): T{
        if(index <= size-1){
            var currentNode = head
            for(i in 0..index){
                currentNode = currentNode!!.next
            }
            return currentNode!!.data
        }else{
            throw MyIndexOutOfBoundsException("Size is $size , but you requested for $index th element")
        }
    }

}

data class Node<T>(var next: Node<T>? = null, var data: T)

fun main(){
    val myList = MyLinkedList<String>()
    myList.add("5")
    myList.add("3")
    myList.add("-1")
    myList.add("string")
    myList.add("This is my text")

    myList.printAll()

    println(myList.get(10))
}