package MentorDersler.MentorDers2

class MyCustomStringList {

    private val myList = arrayListOf<String>()

    fun add(element: String){
        myList.add(element)
    }


    fun remove(index: Int){
        myList.removeAt(index)
    }

    fun addAll(list: ArrayList<String>){
        myList.addAll(list)
    }

    fun getElement(){
        for (item in myList){
            println(item)
        }
    }
}