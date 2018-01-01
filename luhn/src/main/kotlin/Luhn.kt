object Luhn {
    fun isValid(input: String): Boolean {
        if (input.any { it.isLetter() })
            return false
        val s = input.replace("\\s".toRegex(), "")
        if (s.length < 2) {
            return false
        }
        val arr = s.toCharArray()

        for (i in arr.size - 2 downTo 0 step 2) {
            var num = charToDigit(arr[i]) * 2
            arr[i] = digitToChar(if (num > 9) num - 9 else num)
        }

        return arr.sumBy { charToDigit(it) } % 10 == 0
    }

    private fun charToDigit(c: Char): Int {
        return c - '0'
    }

    private fun digitToChar(d: Int): Char {
        return ((d + 48).toChar())
    }
}