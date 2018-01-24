object SpiralMatrix {

    fun ofSize(n: Int): Array<IntArray> {
        val m = Array(n) { IntArray(n)}
        if (n == 1) {
            m[0][0] = 1
            return m
        }

        var r1 = 0
        var r2 = n - 1
        var c1 = 0
        var c2 = n - 1
        var count = 1
        while (r1 <= r2 && c1 <= c2) {
            // left to right
            for (i in c1..c2) {
                m[r1][i] = count++
            }

            // top to bottom
            for (i in r1+1..r2) {
                m[i][c2] = count++
            }

            // bottom to left
            for (i in c2-1 downTo c1+1) {
                m[r2][i] = count++
            }

            // left to top
            for (i in r2 downTo r1+1) {
                m[i][c1] = count++
            }

            r1++
            c1++
            r2--
            c2--
        }

        return m
    }

}