fun countC(string: String) {
    val c = HashMap<Char, Int>()
    for (char in string) {
        if (c.containsKey(char)) {
            c[char] = c[char]!! + 1
        } else {
            c[char] = 1
        }
    }
    val sortedChars = c.keys.sorted()
    for (char in sortedChars) {
        println("$char - ${c[char]}")
    }
}
    fun main () {
        println("Введите строку символов: ")
        val string = readLine().toString()
        countC(string)
    }