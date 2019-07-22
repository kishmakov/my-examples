package sample.helloworld

import kotlinx.cinterop.*
import platform.posix.*

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

//    val file = fopen("aba.txt", "w")
//    for (arg in args) {
//        fputs(">>> $arg\n", file)
//    }
//    fclose(file)
}

fun main2(args: Array<String>) {
    println(question("Will none of you wait for me", args))
    println("Location: " + currentLocation())
}
