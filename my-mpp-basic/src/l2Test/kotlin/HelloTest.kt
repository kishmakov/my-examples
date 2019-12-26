package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTestsLinux2 {
    @Test
    fun testHello() {
        assertTrue("Hello" in hello())
    }

    @Test
    fun testBye() {
        assertTrue("Bye" in bye())
    }
}
