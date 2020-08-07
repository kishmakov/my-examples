package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class Linux2Test {
    @Test
    fun testHello() {
        assertTrue("Hello" in hello())
    }

    @Test
    fun testBye() {
        assertTrue("Bye" in bye())
    }
}
