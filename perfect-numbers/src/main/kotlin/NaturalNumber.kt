enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

fun classify(n: Int): Classification {
    if (n <= 0) {
        throw RuntimeException()
    }
    val aliquotSum: Int = (1..n/2).filter { n % it == 0 }.sum()
    return when {
        aliquotSum > n -> Classification.ABUNDANT
        aliquotSum == n -> Classification.PERFECT
        else -> Classification.DEFICIENT
    }
}