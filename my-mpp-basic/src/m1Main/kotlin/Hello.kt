package sample.helloworld

import kotlinx.cinterop.toKString
import platform.posix.getenv

fun hello(name: String): String {
    return "Hello, $name!"
}

fun main1(args: Array<String>) {
    println(hello("Kotlin/Native"))
    for (arg in args)
        println(hello(arg))

    val aba = getenv("aba")?.toKString()
    println("aba is $aba")
}

fun main2() {
    println(hello("James Smith"))
}
