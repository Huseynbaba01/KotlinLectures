@file:Suppress("KotlinConstantConditions")

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)
    /*    var myNumber = scanner.nextInt()
    //127

    val second: Int
    val third: Int

    third = myNumber % 10
    myNumber -= third
    myNumber /= 10
    second = myNumber%10
    myNumber -= second
    myNumber /= 10

    print("$myNumber  $second  $third")*/
    /*
    val myLine = readLine()
    print(myLine)
    */
    //val score = scanner.nextByte()
    /*if(score>90) {
        if(score > 95){
            print("You got A+")
        } else{
            print("You got A")
        }
    }else if(score>80){
        print("You got B")
    }else if(score>70){
        print("You got C")
    }else if(score>60){
        print("You got D")
    }else if(score>50){
        print("You got E")
    }else{
        print("You failed!")
    }
*/
    /*when{
        score > 90 ->{
            if(score > 95){
                print("You got A+")
            } else{
                print("You got A")
            }
        }
        else -> {

        }
    }
    val myGrade = 85
    when(myGrade){
         85 -> {

         }
         95 -> {

         }
         else -> {

         }
     }*/

/*
 val myString = "This is my text"
    for(i in 1.rangeTo(5)){
        print("$i ")
    }
    for(i in 1..5 step (2)){
        print("$i ")
    }
    */

    var isDoorOpen = true
    var number = 0
/*
    test@ for(i in 1..5){
        while(true){
            println("The door is open")
            if(++number == 5){
                 break@test
            }
        }
    }*/
    /*while(true){
        if(++number%2 == 1) {
            print(number)
            continue
        }
        else{
            number--
        }
        println("The door is open")
        if(++number == 5){
            break
        }
    }*/

    var myFlag: Boolean

    do{
        myFlag = scanner.nextBoolean()
        if(myFlag)
            println("It is true")
        else
            println("Not true")
    }while(myFlag)
}
