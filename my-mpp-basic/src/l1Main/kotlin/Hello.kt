package sample.helloworld

import kotlinx.cinterop.*
import platform.posix.*

fun hello(n: Int): String {
    val result = buildString {
        append("Hello, Kotlin/Native @")
        for (i in 0 .. n-1) {
            append("$n")
        }
        append("@ Linux!")
    }

    return result
}



fun main1(args: Array<String>) {
    println(hello(1))
    val file = fopen("aba.txt", "w")
    for (arg in args) {
        fputs(">>> $arg\n", file)
    }
    fclose(file)
    val path = getenv("myvar")?.toKString()
    println("myvar is $path")
}

fun main2(args: Array<String>) {
    println(hello(2))
    for (arg in args) {
        println(arg)
    }
}
