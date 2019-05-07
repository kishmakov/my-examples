package demo

import kotlinx.coroutines.*

fun g(n: Int): Int {
    if (n < 0)
        throw Exception("What do you want?")
    return f(n - 1) + g(n - 3)
}

fun f(n: Int): Int {
    return g(n - 1) + f(n - 2)
}

fun main() {
    // f(10) // exception producing call

    GlobalScope.launch {
        delay(1000L)
        println("<coroutine 1>") // breakpoint
        g(12)
        delay(1000L)
        println("<coroutine 2>")
    }
    println("<main 1>")
    Thread.sleep(1500L)
    f(10)
    println("<main 2>")
    Thread.sleep(1500L)
    println("<main 3>")
}