import java.util.*
import kotlin.random.Random.Default.nextInt

fun main(){
    val scanner = Scanner(System.`in`)
//   val number = scanner.nextInt()
//   val number1 = scanner.nextInt()
//   if (number %2 ==0){
//       println("it is even number : ${number}")
//   }else if (number %3 ==0){
//       println("it is odd number and can be divided(bolmek) by 3 : ${number}")
//   }else println("it is odd NUMBER:${number}")
//
//    println("*******************")
//
//    if(number1 %2 == 0){
//        if(number1 % 3 == 0){
//            println("can be divided by 6")
//        }
//        if(number1 % 5 == 0){
//            println("can be divided by 10")
//        }
//    }
//    else print("it is odd")
//
//    println("*******************")

/*    if((number % 2 == 0 && number % 3 == 0 ) || false){
        println("can be divided by 6")
    }*/

    //A, B, C, D, E
   /*val selectedOptionanswer = Scanner(System.`in`)

    val selectedOption = selectedOptionanswer.next()
//    if(selectedOption == 'A'){
//        print("It is not A")
//    } else if(selectedOption == 'B'){
//        print("It is not B")
//    } else if(selectedOption == 'C'){
//        print("Congratulations! It is C")
//    } else if(selectedOption == 'D'){
//        print("It is not D")
//    } else if(selectedOption == 'E'){
//        print("It is not E")
//    } else {
//        print("Select anything")
//    }

    when(selectedOption){
        "A" -> {
            println("Wrong:it's not A")
        }
        "B" -> {
            println("Wrong:it's not B")
        }
        "C" -> {
            println("it's true answer")
        }
        "D" -> {
            println("Wrong:it's not D")
        }
        "E" -> {
            println("Wrong:it's not E")
        }
    }*/
/*    5.downTo(1) //5 4 3 2 1
    for(i in 1.rangeTo(5)){
        println(i)
    }
    */
/*    val text = "MyText"
    for(t in text){
        println("$t-")
    }
    */
/*
    var number = scanner.nextInt()//4 3 2 1 0
     while (number != 0 && true || false){
         println(--number)
     }*/
////    var number: Byte
    var number = scanner.nextByte()

    do{
        print("Enter any number: ")
        number = scanner.nextByte()
    }while(number != 0.toByte())

    for (i in 1.rangeTo(18)){
        println(i)
    }

    val text = "Nesimi"

    for (i in text){
        println(i)
    }



}