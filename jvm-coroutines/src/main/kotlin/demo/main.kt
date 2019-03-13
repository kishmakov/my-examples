package demo

import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch {
        delay(1000L)
        println("<coroutine 1>") // breakpoint
        delay(1000L)
        println("<coroutine 2>")
    }
    println("<main 1>")
    Thread.sleep(1500L)
    println("<main 2>")
    Thread.sleep(1500L)
    println("<main 3>")
}