package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class Win1Test {
    @Test
    fun testHello() {
        assertTrue("John" in greet("John"))
    }
}
