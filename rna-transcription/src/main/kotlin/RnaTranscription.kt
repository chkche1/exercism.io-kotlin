/* fun transcribeToRna(dna: String): String {
    val map: HashMap<Char, Char> = hashMapOf('G' to 'C', 'C' to 'G', 'T' to 'A', 'A' to 'U')
    val builder: StringBuilder = StringBuilder(dna.length)
    for (c: Char in dna) {
        builder.append(map.get(c))
    }

    return builder.toString()
}
*/

fun transcribeToRna(dna: String): String {
    return dna.toCharArray().map {
        when (it) {
            'G' -> 'C'
            'C' -> 'G'
            'T' -> 'A'
            'A' -> 'U'
            else -> ' '
        }
    }.joinToString(separator = "")
}