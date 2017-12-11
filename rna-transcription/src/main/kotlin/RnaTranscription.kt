fun transcribeToRna(dna: String): String {
    val map: HashMap<Char, Char> = hashMapOf('G' to 'C', 'C' to 'G', 'T' to 'A', 'A' to 'U')
    val builder: StringBuilder = StringBuilder(dna.length)
    for (c: Char in dna) {
        builder.append(map.get(c))
    }

    return builder.toString()
}
