package com.modsen

class Solution {

    fun singleNumber(nums: IntArray): Int {

        var unique=0

        for (num in nums) {
            unique = unique xor num
        }

        return unique
    }

}