package sample

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

fun ask1(): String = buildString {
    val x = "2"
    append(x + 39)
}

fun ask2(): String {
    val x = "2"
    return x + 39
}

class Macos1Test {
    @Test
    fun testWhat() {
        val location = currentLocation()
        val what = question("What's up here at $location")

        val pair = Pair(location, what)

        assertTrue("up" in what)

        val a1 = ask1()
        val a2 = ask2()

        assertEquals(a1, a2)
    }

    @Test
    fun testHow() {
        val how = question("How are you?", arrayOf("Jim", "Bob"))

        assertTrue("are2" in how)
    }
}
