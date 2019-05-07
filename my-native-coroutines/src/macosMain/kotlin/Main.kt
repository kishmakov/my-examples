package demo

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val i = 239
    GlobalScope.launch {
        delay(1000L)
        println("<child 1>")
        delay(1000L)
        println("<child 2>")
    }
    println("<main 1>")
    val j = i + 10
    val k = "$j * $i = ${i * j}"
    delay(1500L)
    println("<main 2>")
    delay(1500L)
    println("<main 3>")
}
