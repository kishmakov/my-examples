package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class Macos1Test {
    @Test
    fun testWhat() {
        val location = currentLocation()
        val what = question("What's up here at $location")

        assertTrue("up" in what)
    }

    @Test
    fun testHow() {
        val how = question("How are you?", arrayOf("Jim", "Bob"))

        assertTrue("are" in how)
    }
}
