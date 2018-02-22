import java.util.Stack

private val OPEN = listOf('{', '[', '(')
private val CLOSE = listOf('}', ']', ')')
private val mapping = CLOSE.mapIndexed { index, c -> c to OPEN[index] }.toMap()

/**
 * More functional implementation: http://exercism.io/submissions/5a79599059b94aff841dd82d2c21a173
 */
object BracketPush {

    fun isValid(s: String): Boolean {
        if (s.isEmpty()) {
            return true
        }

        val stack = Stack<Char>()
        for (c in s) {
            if (OPEN.contains(c)) {
                stack.push(c)
            } else if (CLOSE.contains(c)) {
                if (stack.isEmpty()) {
                    return false
                } else {
                    if (stack.pop() != mapping[c]) {
                        return false
                    }
                }
            }
        }

        return stack.isEmpty()
    }
}