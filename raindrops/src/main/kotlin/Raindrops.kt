object Raindrops {
    fun convert(input: Int): String {
        return buildString {
            var isFactor = false
            if (input % 3 == 0) {
                append("Pling")
                isFactor = true
            }
            if (input % 5 == 0) {
                append("Plang")
                isFactor = true
            }
            if (input % 7 == 0) {
                append("Plong")
                isFactor = true
            }

            if (!isFactor) {
                append(input)
            }

        }
    }
}