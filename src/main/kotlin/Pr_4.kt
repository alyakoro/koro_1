fun main() {
    println("Введите 3 перемеменные через пробелл: (ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ) ")
    val str = readLine()
    var str2 = str?.split(" ")

        val a = str2!![0].toInt()
        val b = str2!![1].toInt()
        val sim = str2!![2].toString()
    var s = 0
    if (sim == "-"){
        s = a - b
    }
    if (sim == "+"){
        s = a + b
    }
    if (sim == "/"){
        s = a / b
    }
    if (sim == "*"){
        s = a * b
    }
    println(s)
}