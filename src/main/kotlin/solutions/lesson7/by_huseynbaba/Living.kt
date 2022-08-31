package solutions.lesson7.by_huseynbaba

open class Living {
    var age: Int = 0
    //private protected internal public
    protected var weight: Double? = null
    protected open fun live(){
        println("I am living")
    }
}