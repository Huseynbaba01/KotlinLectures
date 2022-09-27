
fun main(){
    val movieList = MyLinkedList<String>()

    movieList.add("Godfather")
    movieList.add("Star Wars")
    movieList.add("Fight Club")

    println("Size of movie list: ${movieList.size}")

    movieList.printAll()

}






class MyLinkedList<T> {
    var firstNode: Node<T>? = null
    var size = 0

    fun add(data: T){
        if(size == 0) addFirst(data)
        else addLast(data)
    }

    fun printAll(){
        var currentNode = firstNode
        while (currentNode != null){
            println("movies: "+ currentNode.data)
            currentNode = currentNode.next
        }
    }

    fun add(index: Int, data: T){
        if(index > size-1){
            println("Index tapılmadı.")
            return
        }

        if(index == 0){
            var currentNode = Node(data = data)
            currentNode!!.next = firstNode
            firstNode = currentNode
            size++

        }
        if(index>0){
            addByIndex(index, data)
        }
    }

    fun get(index: Int): T{
        if(index > size-1){
            println("Index tapılmadı.")
        }

        var currentNode = firstNode
        var i = 0
        while(currentNode?.next != null){
            if(i == index) break

            currentNode = currentNode.next

            i++
        }
        return currentNode!!.data
    }

    fun replace(index: Int, data: T){
        if(index > size-1){
            println("Index tapılmadı.")
            return
        }

        var currentNode = firstNode
        var nodeAfterIndex = firstNode
        var i = 1

        while(currentNode?.next != null){
            if(index == 0){
                nodeAfterIndex = currentNode.next

                firstNode = Node(data = data)
                currentNode = firstNode
                currentNode!!.next = nodeAfterIndex

                break
            }
            if(i == index){

                nodeAfterIndex = currentNode.next!!.next

                currentNode.next = Node(data = data)
                currentNode = currentNode.next
                currentNode!!.next = nodeAfterIndex

                break
            }

            currentNode = currentNode.next

            i++
        }
    }

    fun replaceAll(old: T, data: T){

        var currentNode = firstNode
        var i = 0

        while(currentNode != null){

            if(currentNode.data == old){
                replace(i, data)
            }

            currentNode = currentNode.next
            i++

        }
    }

    private fun addByIndex(index: Int, data: T){
        var i = 1
        var currentNode = firstNode
        var nodeAfterIndex = firstNode
        while(currentNode?.next != null){
            if(i == index){

                nodeAfterIndex = currentNode.next

                currentNode!!.next = Node(data = data)
                currentNode = currentNode.next
                currentNode!!.next = nodeAfterIndex

                size++
                break

            }

            currentNode = currentNode.next


            i++

        }
    }

    fun addAll(items: List<T>){
        for(a in items){
            addLast(a)
        }
    }
    private fun addFirst(data: T){
        firstNode = Node( data = data)
        size++
    }

    private fun addLast(data: T){
        var currentNode = firstNode

        while(currentNode?.next != null){
            currentNode = currentNode.next
        }

        currentNode!!.next = Node(data = data)
        size++
    }

    fun addAll(index: Int, items: List<T>){
        var currentNode = firstNode
        var i = index
        for(a in items){
            add(i, a)
            i++
        }
    }


    fun removeAt(index: Int){
        var currentNode = firstNode
        var nodeAfterIndex: Node<T>? = null;
        var i = 1
        // i = 1
        while(currentNode?.next != null){
            if(index == 0){
                firstNode = currentNode.next
                break
            }
            if(i == index){
                currentNode.next = currentNode.next!!.next

                break
            }

            currentNode = currentNode.next
            i++
        }
    }

    fun remove(data: T){
        var currentNode = firstNode
        var i = 0

        while(currentNode != null){

            if(currentNode.data == data) {
                removeAt(i)
                i--
            }

            currentNode = currentNode.next
            i++

        }
    }

    fun getFirstIndexOf(data: T): Int{

        var currentNode = firstNode
        var i = 0

        while(currentNode != null){

            if(currentNode.data == data){
                break
            }

            currentNode = currentNode.next

            i++
        }

        return i
    }

    fun getLastIndexOf(data: T): Int{

        var currentNode = firstNode
        var lastIndex = 0
        var i = 0


        while(currentNode != null){

            if(currentNode.data == data){
                lastIndex = i
            }

            currentNode = currentNode.next

            i++
        }

        return lastIndex
    }

    fun getIndicesOf(data: T): List<Int>{
        var currentNode = firstNode
        var indexList = mutableListOf<Int>()
        var i = 0


        while(currentNode != null){

            if(currentNode.data == data){
                indexList.add(i)
            }

            currentNode = currentNode.next

            i++
        }

        return indexList
    }

    fun clear(){
        firstNode = null
        size = 0
    }
}

data class Node<T>(var next: Node<T>? = null, var data: T)
