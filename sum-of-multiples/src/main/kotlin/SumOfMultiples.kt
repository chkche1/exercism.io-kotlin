object SumOfMultiples {
    fun sum(nums: Set<Int>, max: Int): Int {
        return (1 until max).filter {
            nums.any { num -> it % num == 0 }
        }.sum()
    }
}