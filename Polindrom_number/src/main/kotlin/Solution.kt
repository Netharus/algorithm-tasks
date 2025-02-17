package org.example

class Solution {
    fun isPalindrome(x: Int): Boolean {
        val num1: String = x.toString()
        return num1 == num1.reversed()
    }

    fun isPalindromeFast(x: Int): Boolean {
        var org = x
        var revs: Int=0
        while (org > 0) {
            revs=revs * 10 + org%10
            org /= 10
        }
        return revs==x
    }
}