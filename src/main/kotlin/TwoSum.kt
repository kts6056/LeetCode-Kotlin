import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    val time = measureTimeMillis {
        println(TwoSum().twoSum(intArrayOf(3,3), 6).joinToString(","))
    }
    println("Time : $time")
}

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, i ->
            val diff = target - i
            map[diff]?.let { return intArrayOf(it, index) }
            map[i] = index
        }
        return intArrayOf()
    }
}
