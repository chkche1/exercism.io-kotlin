object BeerSong {

    fun verses(n: Int, k: Int) = (n downTo k).joinToString(separator = "\n\n", postfix = "\n") { verse(it) }

    private fun verse(n: Int) = when (n) {
        0 -> "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall."
        1 -> "1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall."
        else -> "$n bottles of beer on the wall, $n bottles of beer.\nTake one down and pass it around, ${n-1} ${if (n - 1 == 1) "bottle" else "bottles"} of beer on the wall."
    }

}