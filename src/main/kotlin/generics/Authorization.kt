package generics


fun main(){
    var defaultPassword = "Vaqif123"
    var password = readLine()!!.trim()

    try {
//        if (password != defaultPassword){} /*throw IncorrectPasswordException("Incorrect password")*/
    }catch (e: IncorrectPasswordException){
        e.printStackTrace()
    }

}