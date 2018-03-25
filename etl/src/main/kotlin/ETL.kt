object ETL {

    fun transform(map: Map<Int, List<Char>>) =
            map.flatMap { (k, v) -> v.map { it.toLowerCase() to k } }.toMap()

}