package com.teseus.functionalprogramminginkotlin.chapter2

object Chapter2 {
    fun factorial(num: Int): Long {
        fun go(num: Int, acc: Long): Long {
            if (num <= 0) {
                return acc
            } else {
                return go(num - 1, acc * num)
            }
        }
        return go(num, 1L)
    }
}