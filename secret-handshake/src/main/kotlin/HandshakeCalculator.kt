object HandshakeCalculator {
    fun calculateHandshake(n: Int): List<Signal> {
        val events = mutableListOf<Signal>()
        if (n and 1 != 0) {
            events.add(Signal.WINK)
        }
        if (n and 2 != 0) {
            events.add(Signal.DOUBLE_BLINK)
        }
        if (n and 4 != 0) {
            events.add(Signal.CLOSE_YOUR_EYES)
        }
        if (n and 8 != 0) {
            events.add(Signal.JUMP)
        }
        if (n and 16 != 0) {
            events.reverse()
        }
        return events
    }
}