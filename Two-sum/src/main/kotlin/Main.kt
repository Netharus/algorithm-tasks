package org.example

fun main() {
    var solution = Solution()
    var intArray = intArrayOf(2,7,11,15)
    var target = 9

    println(solution.twoSum(intArray, target).joinToString())
}