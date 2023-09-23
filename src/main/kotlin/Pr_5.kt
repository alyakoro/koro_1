fun main() {
    println("Введите данные x: ")
    val x = 3.toDouble()
    println("Введите данные n: ")
    var n = readln().toDouble()
    var y = 0
    while ((n % x) == 0.toDouble())
    {
        y += 1
        n /= 3
    }
    if (n == 0.toDouble())
        println(y)
    else
        println("Целочисленный показатель не существует")
}
