import java.math.BigInteger

object Board {

    fun getGrainCountForSquare(n: Int): BigInteger {
        require (n in 1..64) { "Only integers between 1 and 64 (inclusive) are allowed" }
        return if (n == 1) BigInteger.ONE else BigInteger.ONE.shiftLeft(n - 1)
    }

    fun getTotalGrainCount(): BigInteger {
        return BigInteger.ONE.shiftLeft(64).subtract(BigInteger.ONE)
    }
}