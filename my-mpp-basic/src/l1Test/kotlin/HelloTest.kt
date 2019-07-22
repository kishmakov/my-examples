package sample.helloworld

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTests {
    @Test
    fun testHello() {
        assertTrue("up" in question("What's up"))
    }
}
