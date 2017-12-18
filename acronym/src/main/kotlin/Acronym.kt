object Acronym {

    fun generate(s: String): String {
        val tokens: List<String> = s.split(" ", "-")
        return buildString(capacity = tokens.size) {
            for (token in tokens) {
                append(token[0].toUpperCase())
            }
        }
    }

}