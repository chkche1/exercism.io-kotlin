import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(dateTime: LocalDateTime) {
    val date = dateTime.plusSeconds(1_000_000_000)
    constructor(dateTime: LocalDate): this(dateTime.atTime(0, 0))
}