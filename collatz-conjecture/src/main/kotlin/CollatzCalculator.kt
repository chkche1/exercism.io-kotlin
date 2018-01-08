object CollatzCalculator {
    fun computeStepCount(n: Int): Int {
        require(n > 0) { "Only natural numbers are allowed" }

        var steps = 0
        var temp = n
        while (temp > 1) {
            if (temp % 2 == 0) {
                temp /= 2
            } else {
                temp = 3 * temp + 1
            }

            steps++
        }

        return steps
    }
}