package sample.helloworld

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTestsWindows {
    @Test
    fun testHello() {
        assertTrue("John" in greet("John"))
    }
}
