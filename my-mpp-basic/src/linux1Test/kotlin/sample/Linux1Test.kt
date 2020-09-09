package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class Linux1Test {
    @Test
    fun testHello() {
        val what = question("What's up")

        assertTrue("up" in what)

        val words = listOf(what, currentLocation())
        words.forEach { println(it) }
    }
}
