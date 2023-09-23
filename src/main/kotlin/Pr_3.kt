fun main() {
    println("Введите число в 10 системе счисления: ")
    val n = readLine()!!.toInt()
    val m = n.toString(2)
    println(m)
}