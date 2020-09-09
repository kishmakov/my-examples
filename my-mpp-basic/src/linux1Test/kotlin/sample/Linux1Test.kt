package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class Linux1Test {
    @Test
    fun testHello() {
        assertTrue("up" in question("What's up"))
    }
}
