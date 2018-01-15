object Isogram {
    fun isIsogram(input: String): Boolean {
        val a = input.filter { it.isLetter() }.map { it.toLowerCase() }.sorted()
        return (1 until a.size).none { a[it] == a[it - 1] }
    }
}