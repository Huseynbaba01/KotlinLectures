package lesson6


data class Clothes(var price: Double, var color: Color){
    val x = "something"
    fun sth(){
        println(x)
    }

    init {

    }
}

fun main() {
    val c1 = Clothes(100.0, Color.GREEN)
    val c2 = Clothes(150.0, Color.WHITE)
    val c3 = Clothes(160.0, Color.RED)
}