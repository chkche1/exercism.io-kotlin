class Allergies(score: Int) {
    private val allergies = Allergen.values().filter { it.score and score > 0 }

    fun isAllergicTo(allergen: Allergen) = allergies.contains(allergen)

    fun getList(): List<Allergen> = allergies.toList()
}