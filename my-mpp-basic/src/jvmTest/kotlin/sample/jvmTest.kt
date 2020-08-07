package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class JvmTest {
    @Test
    fun testHello() {
        assertTrue("Jacob" in hello("Jacob"))
    }
}