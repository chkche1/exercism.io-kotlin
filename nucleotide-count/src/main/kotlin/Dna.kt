class Dna(private val input: String) {

    companion object {
        private val NUCLEOTIDES = listOf('A', 'C', 'G', 'T')
    }

    init {
        require (input.all { it in NUCLEOTIDES })
    }

    val nucleotideCounts by lazy {
        input.groupingBy { it }.eachCountTo(mutableMapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0))
    }
}