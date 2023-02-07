package com.teseus.functionalprogramminginkotlin.chapter2

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class Chapter2Test : FunSpec({
    test("should return a factorized value") {
        Chapter2.apply {
            factorial(3) shouldBe 6
            factorial(10) shouldBe 3628800
        }
    }
})
