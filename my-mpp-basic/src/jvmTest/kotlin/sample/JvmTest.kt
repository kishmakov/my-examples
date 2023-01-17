package sample

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

fun ask1() = buildString {
    val x = "2"
    append(x + 39)
}

fun ask2(): String {
    val x = "2"
    return x + 39
}

class JvmTest {
    @Test
    fun testHello() {
        assertTrue("Jacob" in hello("Jacob"))

        val a1 = ask1()
        val a2 = ask2()
        val names = listOf<String>("first", "second", "third")
        val couple = (a1 to a2) to ("first" to "second")
        val namesList = ArrayList<String>(names)

        assertEquals(a1, a2)
        assertTrue { names.isNotEmpty() }
    }
}