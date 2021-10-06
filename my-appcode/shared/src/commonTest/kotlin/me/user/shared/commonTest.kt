package me.user.shared

import kotlin.test.Test
import kotlin.test.assertTrue

class CommonTest {
    @Test
    fun testMe() {
        assertTrue(Greeting().greeting().isNotEmpty())
    }
}

class AnotherCommonTest {
    @Test
    fun testMe() {
        assertTrue(Greeting().greeting().isNotEmpty())
    }
}