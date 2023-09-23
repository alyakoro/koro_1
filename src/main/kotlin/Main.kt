fun count2(input: String): String {
    val res = StringBuilder()
    var t = 1
    for (i in 1 until input.length) {
        if (input[i] == input[i - 1]) {
            t++
        } else {
            res.append(input[i - 1])
            if (t > 1) {
                res.append(t)
            }
            t = 1
        }
    }
    res.append(input[input.length - 1])
    if (t > 1) {
        res.append(t)
    }
    return res.toString()
}
fun main() {
    println("Введите строку символов: ")
    val input = readLine().toString()
    val output = count2(input)
    println(output)
}