package lesson6

import java.util.Scanner
import java.util.TreeMap

class Car {

    companion object{
        val wheels = 4

        val mercedes = Car()

        fun sth(){

        }
    }
    lateinit var type: CarType
    var color: String = "Color"
        get(){
            return field
        }
        set(color){
            field = color
        }
    lateinit var model: String
    var hasProblem = false
    var volume: Double = 0.0

    fun run(){
        println("Running...")
    }

    fun check(): Boolean{
        val runnable = !hasProblem
        return !hasProblem
    }

    constructor(color: String, model: String, volume: Double, hasProblem: Boolean = false){
        this.color = color
        this.model = model
        this.volume = volume
        this.hasProblem = hasProblem
    }


/*
    constructor(color: String, model: String, volume: Double){
        this.color = color
        this.model = model
        this.volume = volume
        this.hasProblem = false
    }*/

    constructor()

    constructor(type: CarType, model: String) {
        this.type = type
        this.model = model
    }

}

fun main(){
    /*    val kiaColor = "Red"
    val kiaModel = "Kia"
    val mercedesColor = "Red"
    val mercedesModel = "Kia"*/
    val kia = Car()
    kia.color = "Red"
    kia.model = "Kia"
    kia.volume = 1.8

  /*  val mercedes = Car()
    mercedes.color = "Blue"
    mercedes.model = "Mercedes"
    mercedes.volume = 1.5*/

    Car.sth()
    Car.wheels

    val mercedes = Car("Blue", "Mercedes", 1.5)
    mercedes.run()
    mercedes.check()
    if(mercedes.check()) mercedes.run()

    val newCar1 = Car(CarType.SEDAN, "Mercedes")
    val newCar2 = Car(CarType.JEEP, "Jeep")
    val newCar3 = Car(CarType.COUPE, "Ferrari")

    val list = listOf(newCar1, newCar2, newCar3)

    list.forEach { myCar ->
        print("The model of My car is ${myCar.model}, ${myCar.type.ordinal}and ")
        when(myCar.type){
            CarType.SEDAN -> println("its type is SEDAN")
            CarType.JEEP -> println("its type is JEEP")
            CarType.COUPE -> println("its type is COUPE")
        }
    }

    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    val myList = mutableListOf<Int>()

    for(i in 0 until n){
        myList.add(scanner.nextInt())
    }


}