import kotlin.math.pow

fun main() {
    println("Введите данные 1: ")
    val x = readln().toInt()
    println("Введите данные 2: ")
    val y = readln().toInt()
    var o = 0
    if ((x + y) % 2 != 0) {
        o++
        println("Создать нечетное число возможно при сложении : " + (x + y))
    }
    if ((x - y) % 2 != 0) {
        o++
        println("Создать нечетное число возможно при вычитании : " + (x - y) )
        if ((y - x) % 2 != 0) {
            o++
            println("Создать нечетное число возможно при вычитании : "  + (y - x))
        }
    }
    if ((x * y) % 2 != 0) {
        o++
        println("Создать нечетное число возможно при умножении : " + (x * y))
    }
    if ((x / y) % 2 != 0) {
        o++
        println("Создать нечетное число возможно при делении : " + (x / y))
        if ((y / x) % 2 != 0) {
            o++
            println("Создать нечетное число возможно при делении : "  + (y / x))
        }
    }
    if (x.toDouble().pow(y) % 2 != 0.toDouble()){
        o++
        println("Создать нечетное число возможно при возведении в степень: " + (x.toDouble().pow(y)))

            if (y.toDouble().pow(x) % 2 != 0.toDouble()) {
                o++
                println("Создать нечетное число возможно при возведении в степень: " + (y.toDouble().pow(x)))
            }
    }
    if (o == 0)
        println("Создать нечетное число невозможно")
}