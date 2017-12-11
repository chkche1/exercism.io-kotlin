object Pangram {
    fun isPangram(s: String): Boolean {
        val letters = s.toLowerCase().toCharArray()
        val sortedLetters = letters.filter { it in 'a'..'z' }.sorted()
        var ptr = 'a'
        sortedLetters
                .asSequence()
                .filter { it == ptr }
                .forEach { ptr++ }

        return ptr == 'z' + 1
    }
}

/*
object Pangram {
    fun isPangram(phrase: String): Boolean {
        return ('a'..'z').all { l -> phrase.contains(l, true) }
    }
}
 */