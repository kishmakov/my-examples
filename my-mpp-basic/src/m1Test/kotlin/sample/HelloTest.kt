package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTestsMacOS {
    @Test
    fun testQuestion() {
        assertTrue("up" in question("What's up"))
    }
}
