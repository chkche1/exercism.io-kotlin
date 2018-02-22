object Series {

    fun slices(n: Int, s: String): List<List<Int>> {
        return if (n > s.length) emptyList()
        else (0..s.length - n).map { i -> (0 until n).map { Integer.parseInt(s.substring(i+ it, i+ it +1)) } }
    }
    
}