package MentorDersler.MentorDers2

class MyList : ArrayList<String>(){
    override fun add(element: String): Boolean {
        return super.add(element)
    }

    override fun addAll(elements: Collection<String>): Boolean {
        return super.addAll(elements)
    }

    override fun remove(element: String): Boolean {
        return super.remove(element)
    }

    override fun set(index: Int, element: String): String {
        return super.set(index, element)
    }

    fun week(){

    }
}