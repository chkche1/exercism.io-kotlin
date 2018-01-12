/**
 * Interesting implementation: http://exercism.io/submissions/15278ed977694e2f8846ae1b51482d4e
 *
 */
object Prime {

    fun nth(n: Int): Int {
        require(n > 0) { "There is no zeroth prime." }

        if (n == 1) {
            return 2
        } else if (n == 2) {
            return 3
        }

        var current = 3
        var count = 2
        while (count < n) {
            do {
                current += 2
            } while (!isPrime(current))

            count++
        }

        return current
    }

    private fun isPrime(n: Int): Boolean {
        if (n == 2 || n == 3) {
            return true
        }

        if (n == 1 || (n.and(1)) == 0) {
            return false
        }

        var end = Math.sqrt(n.toDouble()).toInt()
        for (i in 3..end step 2) {
            if (n % i == 0) {
                return false
            }
        }

        return true
    }

}