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

    // Interesting implementation - http://exercism.io/submissions/5a6f7f10e5dd42ad82dc7dd6396fd3f4

    /*
	init {
		require (s.all { it.isDigit()})
	}

	fun getLargestProduct(n : Int) : Int {
		require (n <= s.length && n >= 0)
		return if (n == 0) 1
			    else
				s.asIterable().windowed(size = n) {
					window : List<Char> -> window.fold(1, {product, element-> product*decimalDigitValue(element)})
				}.max()?: 1
	}

	fun decimalDigitValue(c: Char): Int {
        return c.toInt() - '0'.toInt() // Explicit conversions to numbers
	}
    */

}