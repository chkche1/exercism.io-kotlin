/**
 * Interesting impl - http://exercism.io/submissions/3e2d9f368af64dfaa01cb0b06eb22aa9
 *
 * Below is a solution based on idea above. The use of `let`, `?.`, and takeIf is neat
 */
class PhoneNumber(private val raw: String) {

    var number : String? = raw.filter { it.isDigit() }
            .let {
                when (it.length) {
                    11 -> if (it[0]=='1') it.drop(1) else null
                    10 -> it
                    else -> null
                }
            }?.takeIf { ('2'..'9').contains(it[0]) && ('2'..'9').contains(it[3]) }

/*
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

    //Expects input to be a 10-digit string
    private fun validate(input: String): String? {
        if (input[0] !in '2'..'9' || input[3] !in '2'..'9') {
            return null
        }

        return input
    }*/

}