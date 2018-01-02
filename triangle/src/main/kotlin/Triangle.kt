data class Triangle(private val s1: Double, private val s2: Double, private val s3: Double) {

    constructor(s1: Int, s2: Int, s3: Int) : this (s1.toDouble(), s2.toDouble(), s3.toDouble())

    init {
        require(listOf(s1, s2, s3).all { it > 0.0 }) { "All side lengths must be > 0"}
        require((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1)) { "Not a triangle - violates triangle inequality"}
    }

    val isEquilateral = (s1 == s2) && (s2 == s3)
    val isIsosceles = (s1 == s2) || (s1 == s3) || (s2 == s3)
    val isScalene = (s1 != s2) && (s2 != s3) && (s1 != s3)

}