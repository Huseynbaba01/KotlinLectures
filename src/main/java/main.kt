/*
import java.util.*

object Main {
    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        val n = `in`.nextInt()
        val x = Array(n) { IntArray(n) }
        for (i in 0 until n) {
            for (j in 0 until n) {
                x[i][j] = `in`.nextInt()
            }
        }
        var roads = 0
        for (i in 0 until n) {
            for (j in i until n) {
                if (x[i][j] == 1) roads++
            }
        }
        print(roads)
    }
}*/
