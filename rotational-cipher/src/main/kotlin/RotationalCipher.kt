class RotationalCipher(private val shift: Int) {

    fun encode(s: String) = buildString {
        s.forEach {  c -> append(if (c.isLetter()) rotate(c) else c) }
    }

    private fun rotate(c: Char): Char {
        val base = if (c.isUpperCase()) 65 else 97
        return ((c.toInt() - base + shift) % 26 + base).toChar()
    }

}