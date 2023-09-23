import kotlin.math.pow

fun main() {
    println("Введите данные x: ")
    val x = readln().toDouble()
    println("Введите данные n: ")
    var n = readln().toDouble()

    if (n != null && x != null){
        var y = 0
        while (x.pow(y).toDouble() != n) {
            if (x.toDouble().pow(y).toInt() > n) {
                println("Целочисленный показатель не существует")
                return
            }
            y++
        }
        println("Целочисленный показатель степени y: $y")
    } else {
        println("Ошибка ввода")
    }
}
