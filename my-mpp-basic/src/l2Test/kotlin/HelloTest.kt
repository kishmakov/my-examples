package sample.helloworld

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTests {
    @Test
    fun testHello() {
        assertTrue("Hello" in hello())
    }

    @Test
    fun testBye() {
        assertTrue("Bye" in bye())
    }
}
