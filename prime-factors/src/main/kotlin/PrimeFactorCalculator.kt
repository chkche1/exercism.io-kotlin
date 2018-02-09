object PrimeFactorCalculator {

    fun primeFactors(n: Long): List<Long> {
        val factors = mutableListOf<Long>()

        var running = n
        var prime = 2L
        while (running != 1L) {
            if (running % prime == 0L) {
                factors.add(prime)
                running /= prime
            }

            prime = getNextPrime(prime)
        }

        return factors
    }

    private fun getNextPrime(n: Long): Long {
        var p = n
        if (p and 1 === 0L) {
            p++
        }
        while (!isPrime(p)) {
            p += 2
        }
        return p
    }

    private fun isPrime(n: Long): Boolean {
        if (n == 2L || n == 3L) {
            return true
        }
        if (n == 1L || n and 1L == 0L) {
            return false
        }
        val end = Math.sqrt(n.toDouble()).toLong()
        var i = 3
        while (i <= end) {
            if (n % i == 0L) {
                return false
            }
            i += 2
        }
        return true
    }
}