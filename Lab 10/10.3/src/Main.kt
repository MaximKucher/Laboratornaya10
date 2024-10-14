fun caesarCipher(text: String, shift: Int): String {
    val result = StringBuilder()

    for (char in text) {

        if (char.isLetter()) {
            val base = if (char.isLowerCase()) 'a' else 'A'

            val shifted = ((char - base + shift) % 26 + base.toInt()).toChar()
            result.append(shifted)
        } else {

            result.append(char)
        }
    }

    return result.toString()
}

fun main() {
    val text = "Masha and Bear"
    val shift = 3

    val encryptedText = caesarCipher(text, shift)
    println("Зашифрованный: $encryptedText")

    val decryptedText = caesarCipher(encryptedText, -shift)
    println("Расшифрованный: $decryptedText")
}
