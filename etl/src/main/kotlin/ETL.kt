object ETL {

    fun transform(map: Map<Int, List<Char>>): Map<Char, Int> {
        val res = mutableMapOf<Char, Int>()
        map.forEach {entry -> entry.value.forEach { res[it.toLowerCase()] = entry.key } }
        return res
    }

}