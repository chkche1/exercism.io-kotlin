object Bob {
    fun hey(input: String): String {
        val s = input.trim()

        return if (s.isEmpty() || s.all { it.isWhitespace() }) {
            "Fine. Be that way!"
        } else if (!s.none { it.isLetter() } && s.filter { it.isLetter() }.all { it.isUpperCase() }) {
            "Whoa, chill out!"
        } else if (s.last() == '?') {
            "Sure."
        } else {
            "Whatever."
        }
    }
}