package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class Macos1Test {
    @Test
    fun testQuestion() {
        assertTrue("up" in question("What's up"))
        val words = listOf("aa", "bb", "cc")
        words.forEach { println(it) }
    }
}
