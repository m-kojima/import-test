package com.github.mkojima

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals

class SampleSpec : Spek({
    describe("Sample") {
        it("doSomething") {
            val sut = Sample()
            assertEquals(12, sut.doSomething())
        }
    }
})