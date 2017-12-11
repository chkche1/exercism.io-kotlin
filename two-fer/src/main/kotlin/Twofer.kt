fun twofer(x: String? = ""): String {
    return "One for ${x}, one for me."
}

fun twofer(): String {
    return twofer("you")
}