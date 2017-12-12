object Hamming {
    fun compute(x: String, y: String): Int {
        if (x.length != y.length) throw IllegalArgumentException("left and right strands must be of equal length.")

        return if (x.isEmpty()) 0
        else (0 until x.length).count { x[it] != y[it] }
    }
}