package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class CommonTests {
    @Test
    fun testMe() {
        assertTrue(Sample().checkMe() > 0)
    }

    @Test
    fun testProxy() {
        assertTrue(Proxy().proxyHello("Jack").contains("Dear"))
    }
}