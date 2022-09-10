import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
//    val score = scanner.nextInt()
/*    if(score > 90) {
        print("You got A!")
    } else if( score > 80){
        print("You got B")
    } else if( score > 70){
        print("You got C")
    } else if( score > 60){
        print("You got D")
    } else if( score > 50){
        print("You got E")
    } else{
       print("You failed!")
    }
    */
    /*when{
        score > 90 -> {

        }
        score > 80 -> {

        }
        else -> {

        }
    }
    when(score){
        100 -> {
            println("Excellent")
        }
        90 -> {
            println("Excellent")
        }
    }*/

    // for while do-while break continue
    /*for(i in 5.downTo(1)*//*step(2)*//*){
        isDoorOpen = scanner.nextBoolean()
        if(isDoorOpen){
            println("Close the door!")
        } else {
            continue
        }
        println(i)
    }*/
//    for(i in "This is my text!")
/*    var number = 0
    while (true) {
        if (++number % 2 == 0) {
            print(number)
            continue
        }
        println("The door is open")
        if (++number == 4) {
            break
        }
    }*/
    var boolean: Boolean
    do {
        boolean = scanner.nextBoolean()
        if(boolean) println("It is true")
        else println("It is false, ending program...")
    }while (boolean)
}