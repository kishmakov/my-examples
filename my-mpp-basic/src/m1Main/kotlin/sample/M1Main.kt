package sample

import kotlinx.cinterop.toKString
import platform.posix.getenv

actual class Sample actual constructor() {
    actual fun checkMe(): Int = 30
}

fun question(subject: String, names: Array<String> = emptyArray()): String {
    return buildString {
        append("$subject?")
        for (name in names)
            append(" $name?")
    }
}

fun currentLocation(): String {
    val nowhere = "nowhere"
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