package generics

import java.util.LinkedList

fun main(){
    val line = readLine()
//    LinkedList

//    var int = line?.toInt()?:0

//    if(line == null )

//    var a = true ? 0 : 1
//    Integer a = 2>1 ? 0 : 1;

//    println(5 + (line?.toInt()?:0))


    try {
        println(5 + line!!.toInt())
        //
        //
    } catch (e: Exception){
        e.printStackTrace()
//        e.printStackTrace()
    }
    catch (e: java.lang.NumberFormatException){
        println(e.message)
        e.printStackTrace()
    } catch (e: NullPointerException){
        e.printStackTrace()
    } /*catch (e: Exception){
        e.printStackTrace()
    }*/
    finally {
        println("24th line")
    }

    println("28")
    //Davam edirik

}