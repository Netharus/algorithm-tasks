package com.modsen

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        var map = HashMap<Int, Int>()
        for (num in nums) {
            map.put(num, map.getOrDefault(num, 0) + 1)
        }
        val num = map.toList()
            .sortedBy { (key, value) -> value }
            .last()

        return num.component2()>1
    }


}