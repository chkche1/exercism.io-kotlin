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

    /*
    Reference impl: http://exercism.io/submissions/d66bdbf7fe49486a83afa765ff3969a0

    fun primesUpTo(limit: Int) : List<Int> {
        val range = (2..limit)
        return range.fold((range.toList())) { acc, i ->
            acc.minus((2*i)..range.last() step i) }
    }
    */
}