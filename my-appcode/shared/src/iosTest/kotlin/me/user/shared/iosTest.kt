package me.user.shared

import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    @Test
    fun testExample() {
        println(">>> IosGreetingTest")
        assertTrue(Greeting().greeting().contains("iOS"), "Check iOS is mentioned")
    }
}