object Series {

    /*Improved implementation based on http://exercism.io/submissions/929533e1004d4d8ca553ad9e2da921fb */
    fun slices(n: Int, s: String): List<List<Int>> = s.map { Character.getNumericValue(it) }.windowed(n)

    /*
    fun slices(n: Int, s: String): List<List<Int>> = if (n > s.length) emptyList()
        else (0..s.length - n).map { i -> (0 until n).map { Integer.parseInt(s.substring(i+ it, i+ it +1)) } }
    */
}