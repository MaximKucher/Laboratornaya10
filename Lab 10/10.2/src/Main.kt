fun generatePyramid(n: Int) {
    for (i in 0 until n) {

        val spaces = " ".repeat(n - i - 1)

        val hashes = "#".repeat(2 * i + 1)

        println("$spaces$hashes$spaces")
    }
}

fun main() {
    val n = 15
    generatePyramid(n)
}
