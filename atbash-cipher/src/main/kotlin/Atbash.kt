object Atbash {

    private val alphabet = 'a'..'z'
    private val reversedAlphabet = alphabet.reversed()
    private val mapping = alphabet.zip(reversedAlphabet).toMap()
    private val reversedMapping = reversedAlphabet.zip(alphabet).toMap()

    private fun process(input:String, map: Map<Char, Char>, addSpace: Boolean): String {
        val sanitized = input.filter { it.isLetterOrDigit() }
        return buildString {
            for ((i, c) in sanitized.withIndex()) {
                val mapped = map.getOrDefault(c.toLowerCase(), c)
                if (addSpace && i > 0 && i % 5 ==0) {
                    append(" ")
                }
                append(mapped)
            }
        }
    }

    fun encode(input: String): String {
        return process(input, mapping, true)
    }

    fun decode(input: String): String {
        return process(input, reversedMapping, false)

    }
}