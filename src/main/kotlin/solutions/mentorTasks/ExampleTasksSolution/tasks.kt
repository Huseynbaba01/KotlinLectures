package solutions.mentorTasks.ExampleTasksSolution

import java.util.Scanner
import java.util.concurrent.BlockingDeque

/*
1. 1-100 qeder olan ededlerin cemini tapin

2. 1-100 qeder olan ededlerin 3 ve 5 bolunenin cemini tapin

3. list(5,34,35, 55) Listin icinden en boyuk ededi tapin

4. ListOf() liste ixtiyari ededler doldurun ve onlarin  cemini tapin

5. Konsolda asagida gorduyunuz ulduzlari gosterin
*
**
***
****
"

6.'Men Kotlin yaxsi bilirem ona gore menin ucun KotLin dilinde layihe yazmaq problem deyil."
Bu cumlenin icinde olan "yaxsi." sozunu "normalla" ve "Kotlin" sozunu "Java" ile evez edin.

7. Generic istifade ederek ozunuzun custom "ArraySet" listini vazin funksivalar yazin
(add, addAll, remove, find, getElements, getElement) elave funksiya yazsaz lap ela

8. Bir funksiya yazin iki ixtiyari Int tipli listin en boyuk ve kicik elementin gostersin
Numune: bettaList(5,34,56,14,17) ve alfaList(3, 45, 9, 0, 12) max eded =56 min edeg= 0

9. Funksiya yardın iki ədəd qəbul etsin və onların cəmin qaytarsın.

10. Funksiya yaradın verilen listdə olan true deyerin sayını qaytarsın. listOf(true, false, false, true, false)
Nümunə  listOf(true, false, true, true, false)  -> 3

11. Funksiya yaradın hansıki cümle qebul etsin və hemin cümlenin sözlərin cəmin qaytarsın.
wordCounter(“Proqramlasdirma menim heyetimi deyişdi”) -> 4
*/

//task1
/*
fun main(){
    var sum=0
    for (i in 1..100){
        sum=sum+i
    }
    println (sum)
}
*/

//task2

/*fun main(){
    var sum=0
    for (i in 1..100){
        if (i%3==0 && i%5==0)  {  //3e ve 5e bolunen
            sum = sum + i
        }

    }
    println(sum)
}*/

//task3
/*
 fun main(){
     var arrayList1= arrayOf(5,34,35, 55)
    var maxvalue= arrayList1[0]
  for (i in arrayList1){
      if (maxvalue< i) {
          maxvalue=i

      }
  }
    println (maxvalue)
 }
*/


//task4
 /*fun main(){
    var scan=Scanner(System .`in`)
     var n =scan.nextInt()
    var sum=0
    var arraylists= mutableListOf<Int>()
    for (i in 1..n){
        arraylists.add(scan.nextInt())

    }
    println(arraylists.sum())

 }*/

//task5
/*

fun main(){
    for (i in 1..4){
        for (j in 1..i){
            print("*")
        }
        println(" ")
    }
}
*/

//task6

/*
fun main(){
    var texts="Men Kotlin yaxsi bilirem ona gore menin ucun KotLin dilinde layihe yazmaq problem deyil."

    var newtexts=texts.replace("yaxsi","normal")
    var new=newtexts.replace("Kotlin","Java",  ignoreCase = true)
    println(new)

}*/

//task7

//task8

/*fun main() {
    var scan = Scanner(System.`in`)
    var n = scan.nextInt()
   var max:Int?=null
   var min:Int?=null
    var arraylists1 = mutableListOf<Int>()
    var arraylists2 = mutableListOf<Int>()
    for (i in 1..n) {
       arraylists1.add(scan.nextInt())
        arraylists2.add(scan.nextInt())
    }

    val largestElement1 = arraylists1.maxOrNull()
    val largestElement2 = arraylists2.maxOrNull()
    val lowestElement1 = arraylists2.minOrNull()
    val lowestElement2 = arraylists2.minOrNull()


    if (largestElement1 != null) {
        if (largestElement1> largestElement2!!){
            max=largestElement1
        } else{
            max=largestElement2
        }
    }


    if (lowestElement1 != null) {
        if (lowestElement1< lowestElement2!!){
            min=lowestElement1
        } else{
            min=lowestElement2
        }
    }

    println ("max=$max,min=$min")
}*/




//task9

/*
fun main(){
    sum()
}
fun sum(){
    val scan=Scanner(System .`in`)
    val x=scan.nextInt()
    val y=scan.nextInt()
    println(x+y)

}
*/


//task10
//listOf(true, false, true, true, false)
/*

fun main(){
    var sum=0
    var scan=Scanner(System .`in`)
    var n=scan.nextInt()
    val lists= mutableListOf<Boolean>()
    for (j in 1..n ){
        lists.add(scan.nextBoolean())
    }

    for (i in lists){
        if (i==true) {
        sum=sum+1
    }
    }
    println(sum)
}

*/

//task11
//wordCounter(“Proqramlasdirma menim heyatimi deyişdi”)
/*
fun main(){
    var scan=Scanner(System .`in`)
    var texts=scan.nextLine()
    val words= texts.split("\\s+".toRegex())
    println(words.size)

}
*/
