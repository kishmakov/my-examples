package sample.helloworld

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTests {
    @Test
    fun testHello() {
        assertTrue("John" in hello("John"))
    }
}
