object Flattener {
    fun flatten(input: List<Any?>): List<Any> {
        return input.flatMap { e ->
            when (e) {
                is List<*> -> flatten(e)
                else -> listOfNotNull(e)
            }
        }
    }
}