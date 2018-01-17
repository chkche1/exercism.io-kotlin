class PhoneNumber(private val raw: String) {

    val number by lazy(mode = LazyThreadSafetyMode.NONE) {
        convert()
    }

    private fun convert(): String? {
        val digits= raw.filter { it.isDigit() }

        if ((digits.length == 11 && digits[0] == '1')) {
            return validate(digits.substring(1))
        } else if (digits.length == 10) {
            return validate(digits)
        }

        return null
    }

    /**
     * Expects input to be a 10-digit string
     */
    private fun validate(input: String): String? {
        if (input[0] !in '2'..'9' || input[3] !in '2'..'9') {
            return null
        }

        return input
    }

}