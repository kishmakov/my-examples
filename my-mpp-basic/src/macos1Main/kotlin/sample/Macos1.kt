package sample

import kotlinx.cinterop.toKString
import platform.posix.getenv

actual class Common actual constructor() {
    actual fun getCode(): Int = 30
}

actual fun currentLocation(): String {
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