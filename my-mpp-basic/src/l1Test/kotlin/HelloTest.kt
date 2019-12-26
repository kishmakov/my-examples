package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTestsLinux1 {
    @Test
    fun testHello() {
        assertTrue("up" in question("What's up"))
    }
}
