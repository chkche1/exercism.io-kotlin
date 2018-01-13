data class Matrix(private val m: List<List<Int>>) {

    val saddlePoints: Set<MatrixCoordinate> by lazy(mode = LazyThreadSafetyMode.NONE) {
        computeSaddlePoints()
    }

    private fun rowMax(index: Int): Int? {
        return m[index].max()
    }

    private fun colMin(index: Int): Int? {
        return m.map { it[index] }.min()
    }

    private fun computeSaddlePoints(): Set<MatrixCoordinate> =
        m.foldIndexed(emptySet()) { rowIndex, acc, row ->
            acc union row.foldIndexed(emptySet()) { colIndex, saddlePoints, colVal ->
                if (colMin(colIndex) == colVal && rowMax(rowIndex) == m[rowIndex][colIndex]) saddlePoints + MatrixCoordinate(rowIndex, colIndex)
                else saddlePoints
            }
        }
}