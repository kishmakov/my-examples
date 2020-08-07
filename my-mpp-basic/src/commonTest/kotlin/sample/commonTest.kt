package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class CommonTest {
    @Test
    fun testMe() {
        assertTrue(Sample().checkMe() > 0)
    }

    @Test
    fun testProxy() {
        assertTrue(Proxy().proxyHello("Jack").contains("Dear"))
    }

    @Test
    fun testQuestion1() {
        val pair = Pair(1, "one")
        val (num, name) = pair
        assertTrue("up" in hello("What's up"))
        println("> num is $num $name")
    }

    fun fun1() { }

    fun fun2() { }

    fun call() {
        fun1()
        fun2()
    }

    @Test
    fun testQuestion2() {
        call()
    }
}