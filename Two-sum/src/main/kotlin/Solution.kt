package org.example

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var map = HashMap<Int, Int>()

        for((index, value) in nums.withIndex()) {
            val complement = target-value

            if(map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, index)
            }
            map[value] = index
        }

        return intArrayOf();
    }
}