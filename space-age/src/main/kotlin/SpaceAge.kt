class SpaceAge(val secs: Long){
    private val secondsInYear: Double = (60 * 60 * 24 * 365.25)

    fun convert(period: Double): Double {
        val years = secs / period / secondsInYear
        return Math.round(years * 100.0) / 100.0
    }

    fun onEarth(): Double {
        return convert(1.0)
    }

    fun onMercury(): Double {
        return convert(0.2408467)
    }
    fun onVenus(): Double {
        return convert(0.61519726)
    }
    fun onMars(): Double {
        return convert(1.8808158)
    }
    fun onJupiter(): Double {
        return convert(11.862615)
    }
    fun onSaturn(): Double {
        return convert(29.447498)
    }
    fun onUranus(): Double {
        return convert(84.016846)
    }

    fun onNeptune(): Double {
        return convert(164.79132)
    }
}