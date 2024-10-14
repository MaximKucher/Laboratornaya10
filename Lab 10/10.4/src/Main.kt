fun fizzBuzz(n: Int): List<Any> {
    return (1..n).map { i ->
        when {
            i % 3 == 0 && i % 5 == 0 -> "ВизллБизлл"
            i % 3 == 0 -> "Физллл"
            i % 5 == 0 -> "Бизлллл"
            else -> i
        }
    }
}

fun main() {
    println(fizzBuzz(20))
}
