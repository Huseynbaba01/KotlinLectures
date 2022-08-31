package solutions.lesson_7.by_vaqif

import java.util.Scanner
class Store (){

    fun storeCashier(){
        println("Welcome to Matrix Store. My name is Vaqif. I help you in this shopping.")
        val storeAssistant = Scanner(System.`in`)
        print("Main Menu:\n1 -> Shopping rules\n2 -> Enter to store\n3 -> Exit\nYour choice: ")

        val rules = "Keep calm in the store. The people have mothers and sisters. After you start shopping, you'll be asked if you want to finish each item you buy. Press the number 1 to continue, and the number 2 to finish. You are familiar with the rules."
        val choice = storeAssistant.nextInt()
        val priceList = arrayListOf<Double>()
        val productList = arrayListOf<String>()
        val numList = arrayListOf<Double>()

        when(choice){
            1 -> println(rules)
            2 ->
                while (true){
                    print("Enter product name: ")
                    val product = storeAssistant.next()
                    print("Enter a num of products: ")
                    val productNum = storeAssistant.nextDouble()
                    print("Enter a price of product: ")
                    val productPrice = storeAssistant.nextDouble()
                    priceList.add(productPrice)
                    productList.add(product)
                    numList.add(productNum)
                    print("You want exit?\nChoice: ")
                    val choiceOfExit = storeAssistant.nextInt()
                    when(choiceOfExit){
                        1 -> continue
                        2 -> break
                    }

                }
            3 -> println("Exit")
        }
        println("______Bill______")
        println("Product Name -> Product Num -> Product Price")
        println("$productList -> $numList -> $priceList")
        val finalMoney = priceList.sum() * numList.sum()
        print("Price: ${finalMoney}\nEnter your money: ")
        val yourMoney = storeAssistant.nextDouble()
        val qaliq = yourMoney - finalMoney
        println("Qaliq: $qaliq")
        println("EDV: ${finalMoney / 18}")
    }
}





fun main(){
    val vaqif = Store()
    vaqif.storeCashier()



}