import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
/*    val isDoorOpen = scanner.nextBoolean()
    var isAirConditioningOpen: Boolean
    if(isDoorOpen){//qapı açıq olduqda bunları etməli:
        isAirConditioningOpen = false
        print("kondisioneri söndürməli")
    }else{//başqa bütün hallarda da bura girməli:
        isAirConditioningOpen = true //
        print("kondisioneri yandırılmalı")

    }*/
/*

    // A, B, C, D, E, F

    val discipline = scanner.nextBoolean()
    val score = scanner.nextByte()
    if(score > 90 && discipline){
        print("You got A")
    } else if(score > 90 */
/*&& !discipline*//*
) {
        print("You got B")
    } else if(score > 80){
        print("You got B")
    } else if(score > 70){
        print("You got C")
    } else if(score > 60){
        print("You got D")
    } else if(score > 50){
        print("You got E")
    } else{
        print("You failed!")
    }
*/
    val score = scanner.nextInt()
/*    when{
        score > 90 ->{
            println("You got A!")
        }
        score > 80 ->{
            println("You got B!")
        }
        score > 70 ->{
            println("You got C!")
        }
        else -> {
            println("You failed :(")
        }
    }*/

    when(score){
        100 -> {
            print("Congrats!")
        }
        99 -> {
            print("Good!")
        }
        else -> {
            print("Not bad!")
        }
    }
}