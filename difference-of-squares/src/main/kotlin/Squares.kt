class Squares(val n: Long) {
    fun squareOfSum(): Long {
        val sum = (1 + n) * n / 2
        return sum * sum
    }

    fun sumOfSquares(): Long {
        return LongRange(1, n).map { it * it }.reduce {x, y -> x + y}
    }

    fun difference(): Long {
        return squareOfSum() - sumOfSquares()
    }
}