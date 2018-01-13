class DiamondPrinter {

    private fun printLine(curr: Char, end: Char) = buildString {
        val lineLength = if (end == 'A') 1 else (end - 'A') * 2 + 1
        val space = if (curr == end) 0 else end - curr
        val padding = " ".repeat(space)
        var midSpace = if (curr == 'A') 0 else lineLength - 2 - space * 2
        val midPadding = " ".repeat(midSpace)
        append(padding)
        append(curr)
        if (midSpace > 0) {
            append(midPadding)
            append(curr)
        }
        append(padding)
    }

    fun printToList(input: Char): List<String> {
        require(input in 'A'..'Z') { "Need to be a letter" }
        val res = mutableListOf<String>()
        ('A' until input).forEach { res.add(printLine(it, input)) }
        (input.downTo('A')).forEach { res.add(printLine(it, input)) }
        return res
    }

}