import java.util.concurrent.ThreadLocalRandom

class Robot {

    var name = createName()

    // 26 * 26 * 1000 = 676000
    companion object {
        @JvmStatic val set:BooleanArray = BooleanArray(676001) {false}
    }

    fun reset() {
        val id = nameToId()
        set[id] = false
        this.name = createName()
    }

    private fun createName(): String {
        var id = (0..676000).random()
        while (set[id]) {
            id = (0..676000).random()
        }
        val name = generateName(id)
        set[id] = true
        return name
    }

    private fun digitToChar(d: Int): Char {
        return ((d + 65).toChar())
    }

    private fun generateName(id: Int): String {
        return buildString {
            append(digitToChar(id / 26000))
            append(digitToChar(id % 26000 % 26))
            append(id % 1000)
        }
    }

    private fun nameToId(): Int {
        return (this.name[0].toInt() - 65) * 26000 + ((this.name[1].toInt() - 65) * 1000) + Integer.parseInt(this.name.substring(2))
    }

}

fun ClosedRange<Int>.random() =
        ThreadLocalRandom.current().nextInt(endInclusive - start) +  start