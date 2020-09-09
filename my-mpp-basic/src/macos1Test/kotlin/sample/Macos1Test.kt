package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class Macos1Test {
    @Test
    fun testQuestion() {
        val what = question("What's up")

        assertTrue("up" in what)

        val words = listOf(what, currentLocation())
        words.forEach { println(it) }
    }
}
