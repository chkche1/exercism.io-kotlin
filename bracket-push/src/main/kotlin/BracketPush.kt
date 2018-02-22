import java.util.Stack

private val OPEN = listOf('{', '[', '(')
private val CLOSE = listOf('}', ']', ')')
private val mapping = CLOSE.mapIndexed { index, c -> c to OPEN[index] }.toMap()

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