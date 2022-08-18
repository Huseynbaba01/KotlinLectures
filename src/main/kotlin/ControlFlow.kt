import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
//    val number = scanner.nextInt()
/*    if(number %2 == 0){
        print("it is even")
    }else if(number % 3 == 0){
        print("it is odd and can be divided by 3")
    }
    else print("it is odd  and can not be divided by 3")*/
/*
    if(number %2 == 0){
        if(number % 3 == 0){
            println("can be divided by 6")
        }
        if(number % 5 == 0){
            println("can be divided by 10")
        }
    }
    else print("it is odd")*/

/*    if((number % 2 == 0 && number % 3 == 0 ) || false){
        println("can be divided by 6")
    }*/

    //A, B, C, D, E
/*    val selectedOption = scanner.next()[0]
    if(selectedOption == 'A'){
        print("It is not A")
    } else if(selectedOption == 'B'){
        print("It is not B")
    } else if(selectedOption == 'C'){
        print("Congratulations! It is C")
    } else if(selectedOption == 'D'){
        print("It is not D")
    } else if(selectedOption == 'E'){
        print("It is not E")
    } else {
        print("Select anything")
    }

    when(selectedOption){
        'A' -> {
            print("It is not A")
        }
        'B' -> {
            print("It is not B")
        }
        'C' -> {
            print("Congratulations! It is C")
        }
        'D' -> {
            print("It is not D")
        }
        'E' -> {
            print("It is not E")
        }
    }

    when{
        selectedOption == 'A' -> {

        }
        selectedOption == 'B' -> {

        }
        selectedOption == 'C' -> {

        }
        selectedOption == 'D' -> {

        }
        selectedOption == 'E' -> {

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
    var number: Int
    do{
        print("Enter any number: ")
        number = scanner.nextInt()
    }while(number != 0)
}