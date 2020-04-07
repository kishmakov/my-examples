package sample

import kotlin.test.Test
import kotlin.test.assertTrue

fun checkMap(): AbstractMutableMap<String, String> = TODO()

class M1Tests {
    @Test
    fun testQuestion() {
        assertTrue("up" in question("What's up"))
        val words = listOf("aa", "bb", "cc")
        words.forEach { println(it) }
    }
}
