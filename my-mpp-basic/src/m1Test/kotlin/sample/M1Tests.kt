package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class M1Tests {
    @Test
    fun testQuestion() {
        assertTrue("up" in question("What's up"))
        val words = listOf("aa", "bb", "cc")
        words.forEach { println(it) }
        val numbers = listOf("11", "22", "33")
        numbers.forEach { print("> $it ") }
    }
}
