object Raindrops {
    fun convert(input: Int): String {
        return buildString {
            with(input) {
                if (isFactor(input, 3)) append("Pling")
                if (isFactor(input, 5)) append("Plang")
                if (isFactor(input, 7)) append("Plong")
                if (isEmpty()) append(this)
            }
        }
    }

    private fun isFactor(dividend: Int, divisor: Int): Boolean {
        return if (divisor != 0) dividend % divisor == 0 else false
    }
}