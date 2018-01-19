object WordCount {

    fun phrase(s: String) = s.toLowerCase()
                .replace(Regex("[_\\W]+"), " ")
                .trim()
                .split(" ")
                .groupBy { it }
                .mapValues { it.value.size }
}