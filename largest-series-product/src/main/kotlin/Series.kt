class Series(private val s: String) {

    init {
        require(s.all { it.isDigit() }) { "input contains non-digit character"}
    }

    fun getLargestProduct(n: Int): Int {
        require(n >= 0 && n <= s.length) { "n is invalid" }
        if (n == 0 || s.isEmpty()) {
            return 1
        }

        var products = IntArray(s.length - n + 1)
        for (i in (0..s.length - n)) {
            var product = charToDigit(s[i])
            for (j in (1 until n)) {
                product *= charToDigit(s[i + j])
            }
            products[i] = product
        }


        return products.max()!!
    }

    private fun charToDigit(c: Char): Int {
        return c - '0'
    }
}