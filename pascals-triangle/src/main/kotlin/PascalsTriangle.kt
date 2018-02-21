object PascalsTriangle {

    fun computeTriangle(n: Int): List<List<Int>> {
        require (n >= 0) { "Rows can't be negative!" }

        if (n == 0) {
            return emptyList()
        }

        val res = mutableListOf(listOf(1))
        for (i in 1 until n) {
            val level = mutableListOf<Int>()
            val prev = res[i - 1]

            // add head
            level.add(1)

            (1 until prev.size).mapTo(level) { prev[it -1] + prev[it] }

            // add tail
            level.add(1)

            res.add(level)
        }

        return res
    }

}