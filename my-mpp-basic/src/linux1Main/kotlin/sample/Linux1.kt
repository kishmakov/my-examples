package sample

import kotlinx.cinterop.*
import platform.posix.*

actual class Common actual constructor() {
    actual fun getCode(): Int = 239
}

actual object Platform {
    actual val name: String = "Linux1"
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
}

fun main2(args: Array<String>) {
    println(question("Will none of you wait for me", args))
    println("Location: " + currentLocation())
}
