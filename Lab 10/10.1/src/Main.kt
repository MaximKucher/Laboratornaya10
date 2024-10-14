fun printNumber(n: Int): List<Int> {
    return if (n <= 0) {
        emptyList()
    } else {
        (n downTo 1).toList()
    }
}

fun main() {
    println(printNumber(7))

}
