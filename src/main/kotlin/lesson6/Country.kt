package lesson6

data class Country(var name: String, var capital: String, var population: Long, var area: Double){
    fun sth(){}
    constructor(): this("Name", "Sth", 124, 124.4)
}

fun main(){
    val c1 = Country("Czech", "Praga", 1212097, 23423.600)

}
