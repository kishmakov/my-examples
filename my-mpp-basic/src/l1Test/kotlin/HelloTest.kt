package sample.helloworld

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTests {
    @Test
    fun testHello() {
        assertTrue("333" in hello(3))
        assertTrue("4444" in hello(4))
    }
}
