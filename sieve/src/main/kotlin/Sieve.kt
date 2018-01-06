object Sieve {

    fun primesUpTo(n: Int): List<Int> {
        if (n <= 1)
            return emptyList()
        val primeTable = BooleanArray(n + 1) { i -> i > 1 }
        (2..n).filter { primeTable[it] }
                .flatMap { it * it..n step it }
                .forEach { primeTable[it] = false }

        var primes = mutableListOf<Int>()
        primeTable.forEachIndexed({ idx, b -> if (b) primes.add(idx) })
        return primes
    }
}