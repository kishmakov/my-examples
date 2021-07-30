package sample

import kotlinx.cinterop.toKString
import platform.posix.getenv

actual class Common actual constructor() {
    actual fun getCode(): Int = 30
}

fun nowFun(): String {
    val begin = "n"
    val end = "ow"
    return "$begin$end"
}


fun initialFun(): String {
    val begin = nowFun()
    val end = "here"

    return "$begin$end"
}

actual fun currentLocation(): String {
    val foo = "bar"
    val names = ArrayList<String>()
    val couple = Pair(1, 2)

    val nowhere = initialFun()

    names.forEach { println(it) } // breakpoint

    val lon = getenv("Latitude")?.toKString() ?: return nowhere
    val lat = getenv("Longitude")?.toKString() ?: return nowhere
    return "($lon, $lat)"
}

fun main1(args: Array<String>) {
    println(question("Will no one stay awake for me", args))
    println("Location: " + currentLocation())
    println("JAVA_HOME = " + getenv("JAVA_HOME")?.toKString())
}

fun main2(args: Array<String>) {
    println(question("Will none of you wait for me", args))
    println("Location: " + currentLocation())
}

actual object Platform {
    actual val name: String = "MacOS"
}